package swap.bot.root;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class ShouldICommands extends ListenerAdapter {

    String[] weedResponses = {
            "I think you already know the answer to that... don't come back until you green out.",
            "What? Why are you even asking me that? Just smoke you retard",
            "Nope, not unless you're matching up.",
            "Stop typing and start smoking",
            "You're a fucking pothead, you were gonna do it regardless of what a bot says lmao.",
            "Hmmm... idk, smells like mids to me",
            "Addiction is a serious problem. How many times have you smoked today?\nDoesn't matter smoke again"
    };

    String[] responses = {
            "The answer to your question... is absolutely not.",
            "Yes. No matter what you said, you're doing it. No going back.",
            "I think that's a question you should ask God.",
            "Fuck you, no.",
            "That's a yes from me. Not that it means anything.",
            "Idk man... I don't think I want to answer that.",
            "OH HELL NAH BRUH WTF???",
            "That's... a good question.",
            "Why are you asking and why aren't you doing",
            "No, and if you ask me again I'm gonna purge the chat.",
            "I'm not answering that lmao"
    };

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equalsIgnoreCase("shouldi")) {
            String content = event.getOption("text").getAsString();
            if (content.contains("smoke") || content.contains("take a hit") || content.contains("take a rip") ||
                    content.contains("bong rip") || content.contains("joint") || content.contains("spark up") ||
                    content.contains("get high") || content.contains("pen"))
                event.reply(weedResponses[new Random().nextInt(weedResponses.length)]).queue();
            else event.reply(responses[new Random().nextInt(responses.length)]).queue();
        }
    }
}
