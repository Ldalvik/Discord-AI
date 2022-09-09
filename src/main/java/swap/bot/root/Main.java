package swap.bot.root;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] arg) throws LoginException, InterruptedException {
        JDABuilder api = JDABuilder.createDefault(System.getenv("ROOTBOT_TOKEN"));
        api.setActivity(Activity.watching("for commands like /help..."));

        api.addEventListeners(
                new ReadyListener(System.currentTimeMillis()),
                new ChatCommands(),
                new AiCommands(),
                new Debug(),
                new TypeGame(),
                new ShouldICommands(),
                new SayCommand(),
                new PingCommand(),
                new ScrambleGame()
        ).build().awaitReady();
    }
}