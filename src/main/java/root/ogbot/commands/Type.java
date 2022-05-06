package root.ogbot.commands;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import root.ogbot.utils.ReadData;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Type {
    long startMilli = 0;
    String currentWord;

    public void run(MessageReceivedEvent event) {
        String username = event.getAuthor().getName();
        String content = event.getMessage().getContentRaw();
        Message message = event.getMessage();
        String userID = event.getAuthor().getId();

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
            int highscore;
            try {
                highscore = ReadData.getTypeHighscore(userID);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            message.reply("pinging...")
                    .queue(response -> {
                        int responseTime = (int) ((System.currentTimeMillis() - time) - reaction);
                        if (ReadData.getTypeGlobalHighscore(userID, responseTime)) {
                            response.editMessageFormat(
                                    username + " just set a GLOBAL RECORD! %d ms",
                                    responseTime).queue();
                            ReadData.setTypeGlobalHighscore(userID, responseTime);
                        } else if (responseTime < highscore) {
                            response.editMessageFormat(
                                    username + " set a new personal score! %d ms",
                                    responseTime).queue();
                            ReadData.setTypeHighscore(userID, responseTime);
                        } else
                            response.editMessageFormat(
                                    username + " won! %d ms",
                                    responseTime).queue();
                    });
            startMilli = 0;
            currentWord = "";
            //Type.write(userID, word, milli);
        }
        //https://ci.dv8tion.net/job/JDA/javadoc/net/dv8tion/jda/api/interactions/components/Button.html
    }

    public void getGlobalHighscore(MessageReceivedEvent event) {
        String data;
        try {
            data = new String(Files.readAllBytes(
                    Paths.get("data/type/highscore.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String id = data.split(",")[0];
        String score = data.split(",")[1];
        event.getJDA().retrieveUserById(id).queue(user ->
                event.getMessage().reply(user.getName() +
                        " has the fastest response of " + score + "ms").queue());
    }

    public void getPersonalHighscore(MessageReceivedEvent event){
        String data;
        if(!new File("data/type/users/" + event.getAuthor().getId() + ".txt").exists()){
            event.getMessage().reply("You haven't set a score yet! Play a game of !type to set one.").queue();
        } else {
            try {
                data = new String(Files.readAllBytes(
                        Paths.get("data/type/users/" +  event.getAuthor().getId()  + ".txt")));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            event.getMessage().reply("Your fastest response time is " + data + "ms").queue();
        }
    }
}
