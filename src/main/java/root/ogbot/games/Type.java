package root.ogbot.games;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.Random;

public class Type {
    long startMilli = 0;
    String currentWord;

    public void run(MessageReceivedEvent event) {
        String username = event.getAuthor().getName();
        String content = event.getMessage().getContentRaw();
        Message message = event.getMessage();

        if (content.equals("!type")) {
            String[] words = {"car", "loser", "creative", "delta", "bittle"};
            int random = new Random().nextInt(words.length);
            currentWord = words[random];
            if (startMilli != 0) message.reply("A game is still going on!").queue();
            else {
                message.reply("Your word is: " + currentWord).queue();
                startMilli = System.currentTimeMillis();
            }
        }
        if (content.equals(currentWord)) {
            long time = System.currentTimeMillis();
            long reaction = startMilli - time;
            message.reply("pinging...")
                    .queue(response -> response.editMessageFormat(
                            username + " won! %d ms",
                                    ((System.currentTimeMillis() - time) - reaction)).queue());
            startMilli = 0;
            currentWord = "";
            //Type.write(userID, word, milli);
        }
        //https://ci.dv8tion.net/job/JDA/javadoc/net/dv8tion/jda/api/interactions/components/Button.html
    }

}
