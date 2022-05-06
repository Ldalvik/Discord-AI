package root.ogbot.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.Random;

public class EightBalls {
    static String[] penisResponses = {
            "Yea... no. It's not even mediocre.",
            "Dude, nobody wants to hear about your penis. Ask me something else jeez.",
            "Can't say, but regardless it's nothing I'd want to be around.",
            "The fact that you're trying to get validation from a bot pretty much answers that lol.",
            "I think you should get some bitches before going around talking about your genitalia size.",
            "Don't know but it smells awful.",
            "Command not found. Please try again when you aren't asking about your penis."
    };

    public static void run(MessageReceivedEvent event){
        String content = event.getMessage().getContentRaw();
        if(content.contains("big dick") || content.contains("big cock") || content.contains("big penis") ||
                content.contains("huge dick") || content.contains("huge cock") || content.contains("huge penis")){
            event.getMessage().reply(penisResponses[new Random().nextInt(penisResponses.length)]).queue();
        }
    }
}
