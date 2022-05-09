package root.ogbot;

import net.dv8tion.jda.api.EmbedBuilder;
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

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Main extends ListenerAdapter {
    public static String VERSION = "0.0.2";
    public static String HEROKU_VERSION = "v45";
    static long start = System.currentTimeMillis();
    Fish fish = new Fish();
    Type type = new Type();
    Ping ping = new Ping();

    Message helpcmd = (Message) new EmbedBuilder()
            .setTitle("Help Commands", null)
            .setColor(Color.CYAN)
            .setDescription("This bot was made for swapping rims on FH5 tune files, but " +
                    "also has a handful of commands/games that I added from an old bot I made for Kik " +
                    "a long time ago.")
            .addField("/help", "Displays this help command", true)
            .addField("/ping", "Gets server response time. (used to calculate more accurate /type score)", true)
            .addField("/roll", "The more duplicates at the end of the number, the truer your statement is." +
                    "Least true being singles (most common) and 100% factual being octuples (least common)", true)
            .setFooter("For more in-depth explanations and extra info, visit the bot's website here.\n" +
                            "https://",
                    "https://avatars.githubusercontent.com/u/25795619?s=400&u=45b3491cbd606e3bbbb14492b7807e3975b9bb0b&v=4")
            .setThumbnail("https://avatars.githubusercontent.com/u/25795619?s=400&u=45b3491cbd606e3bbbb14492b7807e3975b9bb0b&v=4")
            .build();


    public static void main(String[] arguments) throws Exception {
        System.out.println("Initializing...");
        JDABuilder api = JDABuilder.createDefault("OTY5ODA3NzI1NjY2MTE5Nzkw.Ymyx0w.Brx5EZ6mR-OU-K7xJGmi4Y9xJ_Y");
        api.setActivity(Activity.watching("for commands like !help..."));
        api.addEventListeners(new Main());
        api.addEventListeners(new ListenerAdapter() {
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

                //Bot channel LuAu
                jda.getGuildById("398717225663725569").getTextChannelById("443097260423774208")
                        .sendMessage("I came online in " + loadTime + " ms!\n" +
                                "Fastest: " + f + "ms\n" +
                                "Slowest: " + s + "ms\n" +
                                "Version: " + VERSION + "\n" +
                                "Heroku version: " + HEROKU_VERSION + "\n" +
                                "(This message will be deleted in 5 minutes)")
                        .delay(5, TimeUnit.SECONDS)
                        .flatMap(Message::delete)
                        .queue();

                //Status channel for bot
                jda.getGuildById("969809178401050655").getTextChannelById("972053387921219584")
                        .sendMessageFormat("I came online in %d ms! (This message will be deleted in 5 minutes)", loadTime)
                        .delay(10, TimeUnit.SECONDS)
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
        }).build();
        System.out.println("BOT STARTED");
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().getId().equals("584160547272917015")) MisaInteractions.run(event);
        if (event.getAuthor().isBot()) return;
        RawResponses.run(event);
        String content = event.getMessage().getContentRaw();
        MessageChannel channel = event.getMessage().getChannel();
        Message message = event.getMessage();
        String userID = event.getAuthor().getId();

        //if(content.startsWith("!fish")) fish.run(event);
        if (content.equals("!help"))
            message.reply(helpcmd).queue();
            /*message.reply("This bot was made for swapping rims on FH5 tune files, but " +
                    "also has a handful of commands/games that I added from an old bot I made for Kik " +
                    "a long time ago.\n" +
                    "!help (Displays this help command)\n" +
                    "!ping (Get message response time)\n" +
                    "!roll [your question]\n" +
                    //"!rps [rock, paper, scissors]\n" +
                    "!shouldi [something you wanna/dont wanna do]\n" +
                    "!8balls [you know how an 8ball works]\n" +
                    "!guess:[easy|normal|hard] (Guess a number between 15, 25, or 50)\n" +
                    "!type (type the given word as fast as possible)\n" +
                    //"!typescore (personal score, WIP)\n" +
                    "!type:score (Get the fastest typer's username)\n" +
                    "!swap [rimId] [tunefile] (Swap rims on tune files for FH5, EXPERIMENTAL)\n" +
                    "!swap:help (How to use rim swapper)\n" +
                    "!swap:rims (Link to rim IDs)\n" +
                    "!website (Replies with the bot's website)\n"
            ).queue();*/


        if(content.equals("!swap:help"))
            message.reply("To find the tune file you want to swap, make sure it's the most recently " +
                    "downloaded tune. If not, download and save/install the tune with ugly rims. To get the file, " +
                    "go to this location:\n" +
                    "Microsoft: C:/Users/(user)/AppData/Local/Packages/Microsoft.624F8B84B80_8wekyb3d8bbwe/SystemAppData/wgs\n" +
                    "Steam: C:/Program Files (x86)/Steam/userdata/(STEAMID)/155136/remote/(XUID)/\n\n" +
                    "(You may have 3+ folders (ignore the 't' folder) in your wgs directory if you have multiple " +
                    "accounts signed in.) If you don't know which XUID is yours, it should be the most recently modified " +
                    "folder (after you download a tune). Once you are in this folder, you should see a bunch of hashed folder names " +
                    "and a container file. Open up the most recently created/modified folder in here as well. You should see a few 1kb " +
                    "files and another container file. Hover over each file, and find the one that is 378 bytes. " +
                    "This is the file you want to attach to the !swap command.\n\n" +
                    "Steam is a lot simpler. Download your tune and open up the most recently modified directory in the " +
                    "remote folder. You should see names along the lines of 'Tuning_####(date)####.Data' " +
                    "as well as ones with .header and thumbnails. You want the one that ends in '.Data'. " +
                    "Make sure it's the tune you downloaded by setting it to recently created/modified.\n\n" +
                    "HOW TO USE !swap COMMAND\nTo get the ID of the rim you want to swap, type !swap:rims to get the link. " +
                    "There will be a list of rims in the format of 'RIM_ID (RIM NAME). You only need to put the RIM_ID. For example, " +
                    "to switch the rims to Work XD9's, you would attach the tune file to the command '!swap WOR_XD9' and send\n" +
                    "The bot will reply with the tune file that you must replace the old tune file with.").queue();

        if(content.equals("!swap:rims"))
            message.reply("Here is a link to the rim IDs. Remember, you only need the ID, not he name in parentheses.\n" +"" +
                    "https://github.com/Ldalvik/FH5TuneSwapper/blob/main/rims").queue();

        if (content.equals("!link"))
            channel.sendMessage("Use this link to invite the bot to your groupchat: "
                    + "https://discord.com/oauth2/authorize?client_id=969807725666119790&scope=bot").queue();

        if (content.equals("!website"))
            channel.sendMessage("https://github.com/Ldalvik/SwapBot").queue();

        if (content.startsWith("!log")) System.out.println(content.substring(5));

        if (content.equals("!ping")) ping.run(event);

        //if(content.startsWith("!rpc"))
            //RockPaperScissors.run(event);

        if(content.startsWith("!guess")) Guess.run(event);

        if (content.startsWith("!roll")) Roll.run(event);

        if (content.startsWith("!shouldi")) ShouldI.run(event);

        if(content.startsWith("!8balls")) EightBalls.run(event);

        //Run everytime to check for correct type word
        if (!event.getMessage().getContentRaw().isEmpty()) type.run(event);

        if (content.equals("!typescore")) type.getGlobalHighscore(event);

        //if(content.equals("!typescore")) type.getPersonalHighscore(event);

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