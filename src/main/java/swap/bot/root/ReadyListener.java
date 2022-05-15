package swap.bot.root;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import root.ogbot.utils.ReadData;

import java.util.concurrent.TimeUnit;

public class ReadyListener extends ListenerAdapter {
    long start;

    public ReadyListener(long start) {
        this.start = start;
    }

    @Override
    public void onReady(@NotNull ReadyEvent event) {
        int loadTime = (int) (System.currentTimeMillis() - start);
        String[] loadTimes = ReadData.getLoadTimes();
        int slowest = Integer.parseInt(loadTimes[0]);
        int fastest = Integer.parseInt(loadTimes[1]);
        if (loadTime < fastest)
            ReadData.setFastLoadTime(loadTime);
        if (loadTime > slowest)
            ReadData.setSlowLoadTime(loadTime);

        String[] loadTimes1 = ReadData.getLoadTimes();
        int s = Integer.parseInt(loadTimes1[0]);
        int f = Integer.parseInt(loadTimes1[1]);
        JDA jda = event.getJDA();

                /*jda.upsertCommand("shouldi [question]", "Ask questions in a \"Should I\" format. May or ").queue();
                jda.upsertCommand("8balls [question here]", "Come on, you know how 8balls work.").queue();
                jda.upsertCommand("guess [easy|normal|hard]", "Guess a number between 15, 25, or 50. (easy, normal hard)").queue();
                jda.upsertCommand("type", "Type the given word as fast as you can. Fastest scores are saved.").queue();
                jda.upsertCommand("type:score", "[NOT WORKING, FIXED IN 0.1.0] Get your personal highscore.").queue();
                jda.upsertCommand("type:score:global", "Get user with the fastest response time.").queue();
                jda.upsertCommand("swap [RIM_ID] [tuneFile]", "Swap rims on locked Forza Horizon 5 tune files.").queue();
                jda.upsertCommand("swap:help", "Display text tutorial on how to use the /swap command.").queue();
                jda.upsertCommand("swap:rims", "Link to the list of RIM_IDs needed for the /swap command.").queue();
                jda.upsertCommand("website", "Link the bot's website.").queue();*/

        //Bot channel LuAu
        //Queues.LUAU_Ready(jda, loadTime, f, s);

        //Status channel for bot
        jda.getGuildById("969809178401050655").getTextChannelById("972053387921219584")
                .sendMessage("I came online in " + loadTime + " ms!\n" +
                        "Fastest: " + f + "ms\n" +
                        "Slowest: " + s + "ms\n" +
                        "Version: " + System.getenv("BOT_VERSION") + "\n" +
                        "(This message will be deleted in 30 seconds)")
                .delay(30, TimeUnit.SECONDS)
                .flatMap(Message::delete).queue();

        //Bot channel ForzaModding
                /*jda.getGuildById("457063425005191168").getTextChannelById("493072341467791361")
                        .sendMessage("I came online in " + loadTime + " ms!\n" +
                                "Fastest: " + f + "ms\n" +
                                "Slowest: " + s + "ms\n" +
                                "Version: " + VERSION + "\n" +
                                "Heroku version: " + HEROKU_VERSION + "\n" +
                                "(This message will be deleted in 5 minutes)")
                        .delay(5, TimeUnit.MINUTES)
                        .flatMap(Message::delete)
                        .queue();*/
    }
}

