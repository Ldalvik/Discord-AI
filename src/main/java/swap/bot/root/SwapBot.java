package swap.bot.root;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.*;
import swap.bot.root.commands.HelpListener;
import swap.bot.root.commands.PingListener;
import swap.bot.root.commands.SwapListener;

public class SwapBot {
    public static void main(String[] arguments) throws Exception {
        JDABuilder api = JDABuilder.createDefault(System.getenv("BOT_TOKEN"));
        api.setActivity(Activity.watching("for commands like !help..."));
        api.addEventListeners(
                new ReadyListener(System.currentTimeMillis()),
                new SwapListener(),
                new PingListener(),
                new HelpListener()
        ).build().awaitReady();
        System.out.println("BOT STARTED");
    }

    /*@Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().getId().equals("584160547272917015")) MisaInteractions.run(event);
        if (event.getAuthor().isBot()) return;
        RawResponses.run(event);
        String content = event.getMessage().getContentRaw();
        MessageChannel channel = event.getMessage().getChannel();
        Message message = event.getMessage();
        String userID = event.getAuthor().getId();

        //if(content.startsWith("!fish")) fish.run(event);
        if (content.equals("/help"))
            message.reply("/help").setEmbeds(helpcmd.build()).queue();
            message.reply("This bot was made for swapping rims on FH5 tune files, but " +
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
            ).queue();


        if(content.equals("/swap help"))
            message.reply("""
                    To find the tune file you want to swap, make sure it's the most recently 
                    "downloaded tune. If not, download and save/install the tune with ugly rims. To get the file, 
                    "go to this location:
                    
                    "Microsoft: C:/Users/(user)/AppData/Local/Packages/Microsoft.624F8B84B80_8wekyb3d8bbwe/SystemAppData/wgs
                    
                    "(You may have 3+ folders (ignore the 't' folder) in your wgs directory if you have multiple 
                    "accounts signed in.) If you don't know which XUID is yours, it should be the most recently modified 
                    "folder (after you download a tune). Once you are in this folder, you should see a bunch of hashed folder names 
                    "and a container file. Open up the most recently created/modified folder in here as well. You should see a few 1kb 
                    "files and another container file. Hover over each file, and find the one that is 378 bytes. 
                    "This is the file you want to attach to the !swap command.
                    
                    
                    "Steam: C:/Program Files (x86)/Steam/userdata/(STEAMID)/155136/remote/(XUID)/
                    
                    
                    "Steam is a lot simpler. Download your tune and open up the most recently modified directory in the 
                    "remote folder. You should see names along the lines of 'Tuning_####(date)####.Data' 
                    "as well as ones with .header and thumbnails. You want the one that ends in '.Data'. 
                    "Make sure it's the tune you downloaded by setting it to recently created/modified.
                    
                    
                    "HOW TO USE !swap COMMAND
                    To get the ID of the rim you want to swap, type !swap:rims to get the link. 
                    "There will be a list of rims in the format of 'RIM_ID (RIM NAME). You only need to put the RIM_ID. For example, 
                    "to switch the rims to Work XD9's, you would attach the tune file to the command '!swap WOR_XD9' and send
                    
                    "The bot will reply with the tune file that you must replace the old tune file with.
                    """
            ).queue();

        if(content.equals("/swap rims"))
            message.reply("Here is a link to the rim IDs. Remember, you only need the ID, not he name in parentheses.\n" +"" +
                    "https://github.com/Ldalvik/SwapBot/blob/main/RIM_IDS.txt").queue();

        if (content.equals("/invite"))
            channel.sendMessage("Use this link to invite the bot to your groupchat: "
                    + "https://discord.com/oauth2/authorize?client_id=969807725666119790&scope=bot").queue();

        if (content.equals("/website"))
            channel.sendMessage("https://github.com/Ldalvik/SwapBot").queue();

        if (content.startsWith("/log")) System.out.println(content.substring(5));

        if (content.equals("/ping")) ping.run(event);

        //if(content.startsWith("!rpc"))
        //RockPaperScissors.run(event);

        if(content.startsWith("/guess")) Guess.run(event);

        if (content.startsWith("/roll")) Roll.run(event);

        if (content.startsWith("/shouldi")) ShouldI.run(event);

        if(content.startsWith("/8balls")) EightBalls.run(event);

        //Run everytime to check for correct type word
        if (!event.getMessage().getContentRaw().isEmpty()) type.run(event);

        if (content.equals("/type score_global")) type.getGlobalHighscore(event);

        //if(content.equals("!typescore")) type.getPersonalHighscore(event);

        if (content.startsWith("/swap")) {
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
    }*/
}


//git add --all
//git commiteve -m "Commit"
//git push heroku master

//heroku deploy:jar Downloads/JavaExeDemo/OG-Bot-Discord/build/libs/OG-Bot-Discord-1.0-all.jar --app morning-beach-98088