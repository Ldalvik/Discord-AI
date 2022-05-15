package swap.bot.root.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import swap.bot.root.utils.Embeds;

public class HelpListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if(event.getAuthor().isBot()) return;
        //Checks if command starts with help
        if (event.getMessage().getContentRaw().startsWith("!help")) {
            String[] args = event.getMessage().getContentRaw().split("\\s+");

            //Checks if command has no parameters, sends general help message if null
            System.out.println(args.length);
            if (args.length == 1) {
                event.getMessage().reply("Help").setEmbeds(Embeds.helpCommand.build()).queue();
            } else {
                //Checks if command parameters equals "swap", sends swap help message if true
                if (args[1].equalsIgnoreCase("swap")) {
                    event.getMessage().reply("Swap Help").setEmbeds(Embeds.swapHelpCommand.build()).queue();
                    return;
                }

                //Checks if command parameters equals "rims", sends link to rim IDs if true
                if (args[1].equalsIgnoreCase("rims")) {
                    event.getMessage().reply("""
                            Remember, you only need the ID, not the name in parentheses.
                            https://github.com/Ldalvik/SwapBot/blob/main/RIM_IDS.txt
                            """).queue();
                }
            }
        }
    }
}
