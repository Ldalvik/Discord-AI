package root.ogbot.games;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Ping {

    public void run(MessageReceivedEvent event) {
        Message message = event.getMessage();
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
