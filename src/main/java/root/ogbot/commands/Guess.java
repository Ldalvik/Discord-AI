package root.ogbot.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import javax.management.relation.RelationNotFoundException;
import java.util.Random;

public class Guess {

    public static void run(MessageReceivedEvent event){
        String content = event.getMessage().getContentRaw();

        if(content.startsWith("!guess:easy")){
            int r = new Random().nextInt(25);
            if(Integer.parseInt(content.split(" ")[1])==r)
                event.getMessage().reply("You guessed it right wtf? You win.. nothing.").queue();
            else event.getMessage().reply("You got it wrong, bozo. It was " + r).queue();
        }

        if(content.startsWith("!guess:normal")){
            int r = new Random().nextInt(50);
            if(Integer.parseInt(content.split(" ")[1])==r)
                event.getMessage().reply("How did you guess that shit? You deserve head for that").queue();
            else event.getMessage().reply("Good try, but no. It's " + r).queue();
        }

        if(content.startsWith("!guess:hard")){
            int r = new Random().nextInt(100);
            if(Integer.parseInt(content.split(" ")[1])==r)
                event.getMessage().reply("WRONG! Just kidding, you had a 1% chance to guess it right, " +
                        "and you fucking did. You get nothing from it. Brag?").queue();
            else event.getMessage().reply("Nope, it was " + r).queue();
        }
    }
}
