package swap.bot.root.commands;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import root.ogbot.decoder.Decoder;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SwapListener extends ListenerAdapter {


    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event){
        if(event.getAuthor().isBot()) return;

        if(event.getMessage().getContentRaw().startsWith("!swap")) {
            String[] args = event.getMessage().getContentRaw().split("\\s+");

            if (args[1] == null) {
                event.getMessage()
                        .reply("You need to supply a `RIM_ID` to this command. Use `!help rims` to get a link to them.")
                        .queue();
            } else {
                List<Message.Attachment> attachments = event.getMessage().getAttachments();
                if (attachments.isEmpty()) {
                    event.getMessage().reply("You need to supply a tune file to this command. Use `!help swap` for " +
                            "instructions on how to find it.").queue();
                    return;
                }

                CompletableFuture<File> future = attachments.get(0).downloadToFile("data/tunes/" +
                        attachments.get(0).getFileName());
                future.exceptionally(error -> {
                    error.printStackTrace();
                    return null;
                });
                try {
                    Decoder.run(event, future.get(), args[1]);
                } catch (InterruptedException | ExecutionException | IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
