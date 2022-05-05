package root.ogbot.games;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Commands {
    MessageReceivedEvent event;
    String content;
    String username;
    MessageChannel channel;
    Message message;
    long messageSentMilli;

    //Typing game
    long startMilli = 0;
    String currentWord;

    public void run(MessageReceivedEvent event){
        this.event = event;
        content = event.getMessage().getContentRaw();
        username = event.getMessage().getAuthor().getName();
        channel = event.getMessage().getChannel();
        message = event.getMessage();
        messageSentMilli = (Long.parseLong(event.getMessageId()) >> 22) + 1420070400000L;

        /*
         * Simple text/info commands
         */
        if(content.equals("!link"))
            channel.sendMessage("Use this link to invite the bot to your channels:"
                    + "https://discord.com/oauth2/authorize?client_id=969807725666119790&scope=bot"
            ).queue();

        if(content.startsWith("!log"))
            channel.sendMessage(content.substring(5)).queue();
        /*
         * Game commands
         */
        fish();
        type();
        roll();
        ping();
    }

    private void fish(){
        if(content.startsWith("!fish")){
            Fish fish = new Fish(event);
            fish.fish();
        }
    }

    private void type(){
        if(content.equals("!type")) {
            String[] words = {"car", "loser", "creative", "delta", "bittle"};
            int random = new Random().nextInt(words.length);
            currentWord = words[random];
            if (startMilli != 0) message.reply("A game is still going on!").queue();
            else {
                message.reply("Your word is: " + currentWord).queue();
                startMilli = System.currentTimeMillis();
            }
        }
        if(content.equals(currentWord)){
            long reaction = System.currentTimeMillis() - startMilli;
            message.reply(username + " won! " + reaction + "ms").queue();
            startMilli = 0;
            currentWord = "";
            //Type.write(userID, word, milli);
        }
        //https://ci.dv8tion.net/job/JDA/javadoc/net/dv8tion/jda/api/interactions/components/Button.html
    }

    /*
     * Roll for random number and see if it ends in singles, doubles,
     * triples, quads, etc. The higher the repeating the number, the more
     * true the statement following "/roll" is. Octuples being the highest,
     * singles being the lowest.
     */
    private void roll(){
        if(content.startsWith("!roll")) {
            int index;
            String result = "Singles!?";
            String roll = String.valueOf((long) (Math.random() * (99999999 - 11111111)) + 11111111);
            for (int i = 0; i < 9; i++) {
                String num = String.valueOf(i);
                if (roll.endsWith(num)) result = "Singles!"; index = 0;
                if (roll.endsWith(num + num)) result = "Doubles!!"; index = 1;
                if (roll.endsWith(num + num + num)) result = "Triples!!!"; index = 2;
                if (roll.endsWith(num + num + num + num)) result = "Quadruples!!!!"; index = 3;
                if (roll.endsWith(num + num + num + num + num)) result = "Quintuples!!!!!"; index = 4;
                if (roll.endsWith(num + num + num + num + num + num)) result = "Sextuples!!!!!!"; index = 5;
                if (roll.endsWith(num + num + num + num + num + num + num)) result = "Septuples!!!!!!!"; index = 6;
                if (roll.endsWith(num + num + num + num + num + num + num + num)) result = "Octuples!!!!!!!!"; index = 7;
            }
            //Roll.writeUserStats(userID, index);
            //Roll,writeGlobalStats(index);
            message.reply("*" + username + "> " + content.substring(6) + "*\n" + result + " \n" + roll)
                    .delay(500, TimeUnit.MILLISECONDS).queue();
        }
    }

    /*
     * Get ping calculated from when the message was received
     * to when the reply response is complete.
     */
    private void ping(){
        if(content.equals("!ping")) {
            long time = System.currentTimeMillis();
            message.reply("Pong! - ms:")
                    .queue(response -> {
                        long responseTime = System.currentTimeMillis() - time;
                        //int[] ping = Ping.read().split(",");
                        //int low = ping[0];
                        //int high = ping[1];
                        //if(ping[0]>responseTime){
                        //  Ping.writeNewLow(responseTime, ping[1]);
                        //  response.editMessageFormat("Pong! New low record: %d ms", responseTime).queue();
                        //} else if(ping[1]<responseTime){
                        //  Ping.writeNewHigh(responseTime, ping[0]);
                        //  response.editMessageFormat("Pong! New high record: %d ms", responseTime).queue();
                        //} else {
                            response.editMessageFormat("Pong! %d ms", responseTime).queue();
                        //  response.editMessageFormat(
                        //      "Pong! %d ms\nLowest: " + low + "\nHighest: " + high, responseTime).queue();
                        //}
                    });
        }
    }
}
