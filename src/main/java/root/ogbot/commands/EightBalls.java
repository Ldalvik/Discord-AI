package root.ogbot.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.Random;

public class EightBalls {
    static String[] penisResponses = {
            "Yea... no. It's not even mediocre.",
            "Dude, nobody wants to hear about penises. Ask me something else jeez.",
            "Can't say, but regardless it's nothing I'd want to be around.",
            "The fact that you're trying to get validation from a bot pretty much answers that lol. " +
            "And if you're asking about someone else, then you're just weird.",
            "I think you should get some bitches before going around talking about genitalia size.",
            "Don't know but it smells awful.",
            "Command not found. Please try again when you aren't asking about penis."
    };

    static String[] responses = {
            "no responses set yet cuz im lazy"
    };

    public static void run(MessageReceivedEvent event){
        String content = event.getMessage().getContentRaw();

        if(content.contains("cock") || content.contains("penis") || content.contains("dick") ||
                content.contains(" pp") || content.contains("schlong"))
            event.getMessage().reply(penisResponses[new Random().nextInt(penisResponses.length)]).queue();
        else event.getMessage().reply(responses[new Random().nextInt(responses.length)]).queue();
    }
}
