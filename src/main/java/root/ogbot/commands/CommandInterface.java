package root.ogbot.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public interface CommandInterface {

    void run(MessageReceivedEvent event);
}
