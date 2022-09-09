package swap.bot.root;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingCommand extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equalsIgnoreCase("ping")) {
            long time = System.currentTimeMillis();
            event.reply("Pinging...")
                    .queue(response -> {
                        long responseTime = System.currentTimeMillis() - time;
                        response.editOriginalFormat("Pong! %d ms", responseTime).queue();
                    });
        }
    }
}
