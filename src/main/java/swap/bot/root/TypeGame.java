package swap.bot.root;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import openai.FileUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class TypeGame extends ListenerAdapter {
    String[] words = {"mariah", "super", "pretty", ":)", "elevator", "amazing", "airplane", "marijuana", "vehicle"};

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equalsIgnoreCase("type")) {
            if(!FileUtils.read("games/type/word").equals("null")) {
                event.replyEmbeds(new EmbedBuilder()
                        .setTitle("A game is still going! If your stuck, use /reset.").build()).queue();
            } else {
                String currentWord = words[new Random().nextInt(words.length)];
                FileUtils.write("games/type/word", currentWord);
                FileUtils.write("games/type/time", String.valueOf(System.currentTimeMillis()));
                event.replyEmbeds(new EmbedBuilder()
                        .setTitle("Text to type:")
                        .setDescription(currentWord).build()).queue();
            }
        }
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String currentWord = FileUtils.read("games/type/word");
        long guessTime = System.currentTimeMillis() -
                Long.parseLong(FileUtils.read("games/type/time"));
        if (event.getMessage().getContentRaw().equals(currentWord)) {
            event.getMessage().replyEmbeds(new EmbedBuilder()
                    .addField("Guessed in:", (guessTime / 1000.0) + " seconds", false)
                    .build()).queue();
            FileUtils.write("games/type/word", "null");
        }
    }

}