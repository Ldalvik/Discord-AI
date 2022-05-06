package root.ogbot.commands;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.concurrent.TimeUnit;

public class MisaInteractions {

    public static void run(MessageReceivedEvent event){
        String content = event.getMessage().getContentRaw();
        Message message = event.getMessage();

        if(content.startsWith("H-hey master...")) {
            event.getChannel().sendTyping().completeAfter(2, TimeUnit.SECONDS);
            message.reply("I thought I was your master.. :(").queueAfter(2, TimeUnit.SECONDS);
        }

        if(content.equals("OH REALLY??!")) {
            event.getChannel().sendTyping().completeAfter(2, TimeUnit.SECONDS);
            message.reply("YEA, REALLY BITCH.").queueAfter(2, TimeUnit.SECONDS);
        }

        if(content.startsWith("root. has LOST")) {
            event.getChannel().sendTyping().completeAfter(2, TimeUnit.SECONDS);
            message.reply("Oh no.. my master lost shekels... what an idiot lol").queueAfter(2, TimeUnit.SECONDS);
        }
    }
}
