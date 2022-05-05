package root.ogbot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import root.ogbot.games.Commands;
public class Main extends ListenerAdapter {
    Commands commands = new Commands();

    public static void main(String[] arguments) throws Exception {
        JDABuilder api = JDABuilder.createDefault("OTY5ODA3NzI1NjY2MTE5Nzkw.Ymyx0w.Brx5EZ6mR-OU-K7xJGmi4Y9xJ_Y");
        api.addEventListeners(new Main());
        api.setActivity(Activity.watching("for commands like !help..."));
        api.build();
        System.out.println("BOT STARTED");
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;
        commands.run(event);
    }
}


//heroku deploy:jar Downloads/JavaExeDemo/OG-Bot-Discord/build/libs/OG-Bot-Discord-1.0-all.jar --app morning-beach-98088