package root.ogbot.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.Random;

public class RawResponses {

    static String[] responses = {
            "Wait, you gotta match up with Root ot Kira first.",
            "I think you should share some of that with me",
            "LMAO you got mids bro",
            "Zaza? Baba."
    };

    public static void run(MessageReceivedEvent event) {
        String content = event.getMessage().getContentRaw();

        if(content.contains("smoke") || content.contains("smoking") || content.contains("take a hit") ||
                content.contains("take a rip") || content.contains("bong rip") ||
                content.contains("joint") || content.contains("spark up") ||
                content.contains("blazed"))
            event.getMessage().reply(responses[new Random().nextInt(responses.length)]).queue();
    }
}
