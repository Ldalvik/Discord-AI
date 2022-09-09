package open.ai.root;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class ChatCommands extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equalsIgnoreCase("ping")) {
            pingCommand(event);
        }
    }

    public void pingCommand(SlashCommandInteractionEvent event) {
        long time = System.currentTimeMillis();
        event.getChannel().sendMessageEmbeds(new EmbedBuilder()
                        .setColor(Color.cyan)
                        .setTitle("Ping!")
                        .addField("Response time", "Pinging...", false).build())
                .queue(response -> {
                    long responseTime = System.currentTimeMillis() - time;
                    response.editMessageEmbeds(new EmbedBuilder()
                                    .setColor(Color.cyan)
                                    .setTitle("Pong!")
                                    .addField("Response time", responseTime + "ms", false).build())
                            .queue();
                });

//          .flatMap(v ->
//                event.getHook().editOriginalFormat("Pong: %d ms", System.currentTimeMillis() - time) // then edit original
//        ).queue();
    }
}
