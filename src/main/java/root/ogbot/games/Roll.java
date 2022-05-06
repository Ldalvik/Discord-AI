package root.ogbot.games;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.concurrent.TimeUnit;

public class Roll {


    public Roll run(MessageReceivedEvent event){
        String username = event.getAuthor().getName();
        String content = event.getMessage().getContentRaw();
        Message message = event.getMessage();

        if(content.startsWith("!roll")) {

            String result = "Singles!?";
            String roll = String.valueOf((long) (Math.random() * (99999999 - 11111111)) + 11111111);
            for (int i = 0; i <= 9; i++) {
                String num = String.valueOf(i);
                if (roll.endsWith(num)) result = "Singles!";
                if (roll.endsWith(num + num)) result = "Doubles!!";
                if (roll.endsWith(num + num + num)) result = "Triples!!!";
                if (roll.endsWith(num + num + num + num)) result = "Quadruples!!!!";
                if (roll.endsWith(num + num + num + num + num)) result = "Quintuples!!!!!";
                if (roll.endsWith(num + num + num + num + num + num)) result = "Sextuples!!!!!!";
                if (roll.endsWith(num + num + num + num + num + num + num)) result = "Septuples!!!!!!!";
                if (roll.endsWith(num + num + num + num + num + num + num + num)) result = "Octuples!!!!!!!!";
            }
            //Roll.writeUserStats(userID, index);
            //Roll,writeGlobalStats(index);
            message.reply("*" + username + "> " + content.substring(6) + "*\n" + result + " \n" + roll)
                    .delay(500, TimeUnit.MILLISECONDS).queue();
        }
        return this;
    }
}
