package root.ogbot.commands;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Ping {

    public void run(MessageReceivedEvent event) {
        Message message = event.getMessage();
        long time = System.currentTimeMillis();
        message.reply("Pong! - ms:")
                .queue(response -> {
                    long responseTime = System.currentTimeMillis() - time;
                    response.editMessageFormat("Pong! %d ms", responseTime).queue();
                });
    }


}
