package swap.bot.root.utils;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Message;
import swap.bot.root.Config;

import java.util.concurrent.TimeUnit;

public class Queues {

    public static void LUAU_Ready(JDA jda, int loadTime, int f, int s) {
        jda.getGuildById("398717225663725569").getTextChannelById("443097260423774208")
                .sendMessage("I came online in " + loadTime + " ms!\n" +
                        "Fastest: " + f + "ms\n" +
                        "Slowest: " + s + "ms\n" +
                        "Version: " + Config.VERSION + "\n" +
                        "Heroku version: " + Config.HEROKU_VERSION + "\n" +
                        "(This message will be deleted in 30 seconds)")
                .delay(30, TimeUnit.SECONDS)
                .flatMap(Message::delete).queue();
    }
}
