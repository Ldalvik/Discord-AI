package root.ogbot.commands;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Fish {
    MessageReceivedEvent event;
    String content;
    String username;
    MessageChannel channel;
    Message message;
    long messageSentMilli;

    public Fish run(MessageReceivedEvent event){
        this.event = event;
        content = event.getMessage().getContentRaw();
        username = event.getMessage().getAuthor().getName();
        channel = event.getMessage().getChannel();
        message = event.getMessage();
        messageSentMilli = (Long.parseLong(event.getMessageId()) >> 22) + 1420070400000L;

        if(!new File("data/users/" + event.getAuthor().getId() + ".json").exists()){
            //new player
            FishParser.createNewPlayer();
            channel.sendMessage("This was your first fish! You've been given some starter fish and cash," +
                    "type !beginfishing to setup your build.").queue();
        } else {
            String userData = null;
            try {
                userData = new String(Files.readAllBytes(
                        Paths.get("data/users/" + event.getAuthor().getId() + ".json")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            FishParser parser = new FishParser(userData, event);
            parser.goFish();
        }
        return this;
    }


}
