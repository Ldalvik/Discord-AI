package root.ogbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import root.ogbot.commands.*;
import root.ogbot.decoder.Decoder;
import root.ogbot.utils.ReadData;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Main extends ListenerAdapter {
    public static String VERSION = "0.0.1";
    public static String HEROKU_VERSION = "v38";
    static long start = System.currentTimeMillis();
    Fish fish = new Fish();
    Type type = new Type();
    Ping ping = new Ping();

    public static void main(String[] arguments) throws Exception {
        System.out.println("Initializing...");
        JDABuilder api = JDABuilder.createDefault("OTY5ODA3NzI1NjY2MTE5Nzkw.Ymyx0w.Brx5EZ6mR-OU-K7xJGmi4Y9xJ_Y");
        api.setActivity(Activity.watching("for commands like !help..."));
        api.addEventListeners(new Main());
        api.addEventListeners(new ListenerAdapter() {
            @Override public void onReady(@NotNull ReadyEvent event) {
                int loadTime = (int) (System.currentTimeMillis() - start);
                String[] loadTimes = ReadData.getLoadTimes();
                int slowest = Integer.parseInt(loadTimes[0]);
                int fastest = Integer.parseInt(loadTimes[1]);
                if(loadTime<fastest)
                    ReadData.setFastLoadTime(loadTime);
                if(loadTime>slowest)
                    ReadData.setSlowLoadTime(loadTime);

                String[] loadTimes1 = ReadData.getLoadTimes();
                int s = Integer.parseInt(loadTimes1[0]);
                int f = Integer.parseInt(loadTimes1[1]);
                JDA jda = event.getJDA();

                //Bot channel LuAu
                jda.getGuildById("398717225663725569").getTextChannelById("443097260423774208")
                            .sendMessage("I came online in " + loadTime + " ms!\n" +
                                            "Fastest: " + f + "ms\n" +
                                            "Slowest: " + s + "ms\n" +
                                            "Version: " + VERSION + "\n" +
                                            "Heroku version: " + HEROKU_VERSION + "\n" +
                                    "(This message will be deleted in 5 minutes)")
                                     .delay(5, TimeUnit.MINUTES)
                                     .flatMap(Message::delete)
                                     .queue();

                //Status channel for bot
                jda.getGuildById("969809178401050655").getTextChannelById("972053387921219584")
                        .sendMessageFormat("I came online in %d ms! (This message will be deleted in 5 minutes)", loadTime)
                        .delay(10, TimeUnit.SECONDS)
                        .flatMap(Message::delete).queue();

                //Bot channel ForzaModding
                jda.getGuildById("457063425005191168").getTextChannelById("493072341467791361")
                        .sendMessage("I came online in " + loadTime + " ms!\n" +
                                "Fastest: " + f + "ms\n" +
                                "Slowest: " + s + "ms\n" +
                                "Version: " + VERSION + "\n" +
                                "Heroku version: " + HEROKU_VERSION + "\n" +
                                "(This message will be deleted in 5 minutes)")
                        .delay(5, TimeUnit.MINUTES)
                        .flatMap(Message::delete)
                        .queue();
            }
        }).build();
        System.out.println("BOT STARTED");
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().getId().equals("584160547272917015")) MisaInteractions.run(event);
        if (event.getAuthor().isBot()) return;
        String content = event.getMessage().getContentRaw();
        MessageChannel channel = event.getMessage().getChannel();
        Message message = event.getMessage();
        String userID = event.getAuthor().getId();

        //if(content.startsWith("!fish")) fish.run(event);

        if (content.equals("!link"))
            channel.sendMessage("Use this link to invite the bot to your groupchat: "
                    + "https://discord.com/oauth2/authorize?client_id=969807725666119790&scope=bot").queue();

        if (content.startsWith("!log"))
            System.out.println(content.substring(5));


        if (content.equals("!ping"))
            ping.run(event);

        if (content.startsWith("!roll"))
            Roll.run(event);

        if (event.getMessage().getAttachments().isEmpty())
            type.run(event);  //Run everytime to check for correct type word

        if (content.equals("!typescore:global")) type.getGlobalHighscore(event);

        if (content.equals("!typescore")) type.getPersonalHighscore(event);

        if (content.startsWith("!swap")) {
            List<Message.Attachment> attachments = event.getMessage().getAttachments();
            if (attachments.isEmpty()) return; // no attachments on the message!

            CompletableFuture<File> future = attachments.get(0).downloadToFile("data/tunes/" +
                    attachments.get(0).getFileName());
            future.exceptionally(error -> {
                error.printStackTrace();
                return null;
            });
            try {
                Decoder.run(event, future.get(), content.substring(6));
            } catch (InterruptedException | ExecutionException | IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


//git add --all
//git commiteve -m "Commit"
//git push heroku master

//heroku deploy:jar Downloads/JavaExeDemo/OG-Bot-Discord/build/libs/OG-Bot-Discord-1.0-all.jar --app morning-beach-98088