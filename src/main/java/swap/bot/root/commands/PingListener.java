package swap.bot.root.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if(event.getAuthor().isBot()) return;
        if(!event.getMessage().getContentRaw().equalsIgnoreCase("!ping")) return;

        long time = System.currentTimeMillis();
        event.getMessage().reply("Pong! - ms:")
                .queue(response -> {
                    long responseTime = System.currentTimeMillis() - time;
                    response.editMessageFormat("Pong! %d ms", responseTime).queue();
                });
    }
}
