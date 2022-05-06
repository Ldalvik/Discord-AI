package root.ogbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import root.ogbot.games.Fish;
import root.ogbot.games.Ping;
import root.ogbot.games.Roll;
import root.ogbot.games.Type;

public class Main extends ListenerAdapter {
    Fish fish = new Fish();
    Type type = new Type();
    Roll roll = new Roll();
    Ping ping = new Ping();
    static JDA jda;

    public static void main(String[] arguments) throws Exception {
        JDABuilder api = JDABuilder.createDefault("OTY5ODA3NzI1NjY2MTE5Nzkw.Ymyx0w.Brx5EZ6mR-OU-K7xJGmi4Y9xJ_Y");
        api.addEventListeners(new Main());
        api.setActivity(Activity.watching("for commands like !help..."));
        api.build();
        jda = (JDA) api;
        System.out.println("BOT STARTED");
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;
        String content = event.getMessage().getContentRaw();
        MessageChannel channel = event.getMessage().getChannel();


        //if(content.startsWith("!fish")) fish.run(event);

        
        if(content.equals("!link"))
            channel.sendMessage("Use this link to invite the bot to your channels: "
                    + "https://discord.com/oauth2/authorize?client_id=969807725666119790&scope=bot").queue();

        if(content.startsWith("!log"))  //Send message to log channel
            jda.getTextChannelById("971646511475740722").sendMessage(content.substring(5));

        if(content.equals("!ping"))
            ping.run(event);



        if(content.startsWith("!roll"))
            roll.run(event);

        type.run(event, jda);  //Run everytime to check for correct type word


    }
}


//heroku deploy:jar Downloads/JavaExeDemo/OG-Bot-Discord/build/libs/OG-Bot-Discord-1.0-all.jar --app morning-beach-98088