package open.ai.root;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

import static net.dv8tion.jda.api.interactions.commands.OptionType.STRING;

public class ReadyListener extends ListenerAdapter {
    long start;

    public ReadyListener(long start) {
        this.start = start;
    }

    @Override
    public void onReady(@NotNull ReadyEvent event) {
        int loadTime = (int) (System.currentTimeMillis() - start);
        JDA jda = event.getJDA();

        //Send online message to status channel, delete after 30 seconds
        jda.getGuildById("969809178401050655").getTextChannelById("972053387921219584")
                .sendMessage("I came online in " + loadTime + " ms!\n" +
                        "(This message will be deleted in 30 seconds)")
                .delay(30, TimeUnit.SECONDS)
                .flatMap(Message::delete).queue();

        System.out.println("BOT ONLINE");


//        jda.updateCommands().addCommands(
//                Commands.slash("prompt", "Set the prompt describing what the AI should do/act like.")
//                        .addOption(STRING, "prompt", "The initial prompt for the AI", true),
//
//                Commands.slash("data", "Set the data to train the AIs responses.")
//                        .addOption(STRING, "data", "The data to train the AI with", true),
//
//                Commands.slash("message", "Send a message for the bot to reply to.")
//                        .addOption(STRING, "message", "The message to send to the AI", true)
//        ).queue();
    }
}