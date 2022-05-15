package swap.bot.root.utils;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class Embeds {

    public static EmbedBuilder helpCommand = new EmbedBuilder()
            .setTitle("Bot Website", "https://ldalvik.github.io/SwapBot/")
            .setColor(Color.CYAN)
            .setDescription(
                    "**_NOTE: ONLY !SWAP RELATED COMMANDS AND !PING ARE USABLE AS I AM REWRITING MOST OF THE BOT " +
                            "TO PREPARE FOR THE OPEN SOURCE RELEASE._**\nThis bot was made for swapping rims on FH5 tune files, " +
                            "but also has a handful of commands/games that I added from an old bot I made for Kik a long time ago.")
            .addField("!help", "Displays this help command", false)
            .addField("!help swap", "Display text tutorial on how to use the !swap command.", false)
            .addField("!help rims", "Link to the list of RIM_IDs needed for the !swap command.", false)
            .addField("!changelog", "Shows version and recent/upcoming changes to the bot.", false)
            .addField("!motd", "Message of the day.", false)
            .addField("!invite", "Displays invite link to add this bot to a server.", false)
            .addField("!ping", "Gets server response time. (used to calculate more accurate !type score)", false)
            .addField("!roll", "The more duplicates at the end of the number, the truer your statement is." +
                    "Least true being singles (most common) and 100% factual being octuples (least common)", false)
            .addField("!shouldi [something you wanna/don't wanna do]", "Ask questions in a \"Should I\" format. May or " +
                    "may not have programmed responses for certain keywords.", false)
            .addField("!8balls [question here]", "Come on, you know how 8balls work.", false)
            .addField("!guess [easy|normal|hard]", "Guess a number between 15, 25, or 50. (easy, normal, hard)", false)
            .addField("!type", "Type the given word as fast as you can. Fastest scores are saved.", false)
            .addField("!type score", "[NOT WORKING, FIXED IN 0.1.0] Get your personal highscore.", false)
            .addField("!type score_global", "Get user with the fastest response time.", false)
            .addField("!swap [RIM_ID] [tuneFile]", "Swap rims on locked Forza Horizon 5 tune files.", false)
            .addField("!website", "Link the bots website.", false)
            .setFooter("For more in-depth explanations and extra info, visit the bots website. " +
                            "(use !website or click the title of this message)\n" +
                            "https://ldalvik.github.io/SwapBot/",null);
    public static EmbedBuilder swapHelpCommand = new EmbedBuilder()
            .setTitle("Bot Website", "https://ldalvik.github.io/SwapBot/")
            .setColor(Color.CYAN)
            .setDescription("""
                    To find the tune file you want to swap, make sure it's the most recently
                    downloaded tune. If not, download and save/install the tune with ugly rims.
                    To get the file, follow these instructions:
                    """)
            .addField("Microsoft version", "`C:/Users/[USER]/AppData/Local/Packages/Microsoft.624F8B84B80_8wekyb3d8bbwe/SystemAppData/wgs/`", false)
            .addField("Which file is it?",
                    "*(You may have 3+ folders (ignore the `t` folder) in your wgs directory if you have multiple accounts signed in.)*\n" +
                            "If you don't know which XUID is yours, it should be the most recently modified folder (after you download a tune). " +
                            "Once you are in this folder, you should see a bunch of hashed folder names and a container file. Open up the most " +
                            "recently created/modified folder in here as well. You should see a few 1kb files and another container file. " +
                            "Hover over each file, and find the one that is 378 bytes. This is the file you want to attach to the `!swap` command."
                    , false)
            .addBlankField(false)
            .addField("Steam Version", "`C:/Program Files (x86)/Steam/userdata/[STEAMID]/155136/remote/[XUID]/`", false)
            .addField("Which File is it?",
                    "Steam is a lot simpler. Download your tune and open up the most recently modified directory in the remote folder. " +
                            "You should see names along the lines of \n`Tuning_####[DATE]####.Data` as well as ones with `.header` and thumbnails. " +
                            "You want the one that ends in `.Data`. Make sure it's the tune you downloaded by setting it to recently created/modified, " +
                            "and check that the file is 378 bytes.", false)
            .addBlankField(false)
            .addField("How do you use the !swap command?",
                    "To get the ID of the rim you want to swap, type `!help rims` to get the link. There will be a list of rims in the " +
                            "format of `RIM_ID [RIM NAME]`. You only need to put the `RIM_ID`. For example, to switch the rims to " +
                            "Work XD9's, you would attach the tune file to the command `!swap WOR_XD9` and send the message. " +
                            "The bot will reply with the tune file that you must REPLACE the old tune file with. ", false)
            .setFooter("For more in-depth explanations and extra info, visit the bots website. " +
                            "(use `!website` or click the title of this message)", null);
    public static EmbedBuilder errorWrongFileSize(int fileSize) {
        return new EmbedBuilder()
                .setTitle("RIM SWAP FAILED", null)
                .setColor(Color.RED)
                .setDescription("""
                        File size is incorrect, please make sure it is a tune file. You can find a tutorial
                        on the website or by using the `!help swap` command.
                        """)
                .addField("File size:", "" + fileSize, false)
                .setFooter("If you need help, message root#6923 or ask for help in the discord.", null);
    }
}
