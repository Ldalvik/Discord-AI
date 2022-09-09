package swap.bot.root;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import openai.FileUtils;

import java.util.Random;

public class ScrambleGame extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equalsIgnoreCase("scramble")) {
            if(!FileUtils.read("games/scramble/word").equals("null")) {
                event.replyEmbeds(new EmbedBuilder()
                        .setTitle("A game is still going! If your stuck, use /reset.").build()).queue();
            } else {
                String[] scrambledWord = getScrambledWord();
                FileUtils.write("games/scramble/word", scrambledWord[1]);
                FileUtils.write("games/scramble/time", String.valueOf(System.currentTimeMillis()));
                event.replyEmbeds(new EmbedBuilder()
                        .setTitle("Text to unscramble:")
                        .setDescription(scrambledWord[0]).build()).queue();
            }

        }
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String scrambleWord = FileUtils.read("games/scramble/word");
        long guessTime = System.currentTimeMillis() -
                Long.parseLong(FileUtils.read("games/scramble/time"));
        if (event.getMessage().getContentRaw().equals(scrambleWord)) {
            event.getMessage().replyEmbeds(new EmbedBuilder()
                    .setTitle("You got it! The word was " + scrambleWord)
                    .setDescription("Good job " + event.getAuthor().getName())
                    .addField("Guessed in:", (guessTime / 1000.0) + " seconds", false)
                    .build()).queue();
            FileUtils.write("games/scramble/word", "null");
        }
    }

    private String[] scrambleWords = {"house", "vehicle", "movie", "super", "pretty", "javascript", "fancy"};

    private String[] getScrambledWord(){
        String word = scrambleWords[new Random().nextInt(scrambleWords.length)];
        char[] a = word.toCharArray();
        for(int i = 0 ; i < a.length; i++) {
            int b = new Random().nextInt(a.length);
            char temp = a[i]; a[i] = a[b];  a[b] = temp;
        }
        return new String[]{new String(a), word};
    }
}
