package root.ogbot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import root.ogbot.games.*;

import java.util.Objects;

public class Main extends ListenerAdapter {
    Fish fish = new Fish();
    Type type = new Type();
    Ping ping = new Ping();

    public static void main(String[] arguments) throws Exception {
        System.out.println("Initializing...");

        JDABuilder api = JDABuilder.createDefault("OTY5ODA3NzI1NjY2MTE5Nzkw.Ymyx0w.Brx5EZ6mR-OU-K7xJGmi4Y9xJ_Y");
        api.addEventListeners(new Main());
        api.setActivity(Activity.watching("for commands like !help..."));
        api.build();
        System.out.println("BOT STARTED");
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        if(event.getAuthor().getId().equals("584160547272917015")) MisaInteractions.run(event);
        if (event.getAuthor().isBot()) return;
        String content = event.getMessage().getContentRaw();
        MessageChannel channel = event.getMessage().getChannel();


        //if(content.startsWith("!fish")) fish.run(event);


        if(content.equals("!link"))
            channel.sendMessage("Use this link to invite the bot to your groupchat: "
                    + "https://discord.com/oauth2/authorize?client_id=969807725666119790&scope=bot").queue();

        if(content.startsWith("!log"))
            System.out.println(content.substring(5));


        if(content.equals("!ping"))
            ping.run(event);

        if(content.startsWith("!roll"))
            Roll.run(event);

        if(content != null)
            type.run(event);  //Run everytime to check for correct type word

    }
}


//git add --all
//git commiteve -m "Commit"
//git push heroku master

//heroku deploy:jar Downloads/JavaExeDemo/OG-Bot-Discord/build/libs/OG-Bot-Discord-1.0-all.jar --app morning-beach-98088