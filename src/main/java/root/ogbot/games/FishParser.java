package root.ogbot.games;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FishParser {
    static MessageReceivedEvent event;
    /*static JSONObject userData;
    JSONObject fishData;
    JSONObject fishMetadata;
    JSONObject fishInventory;
    JSONObject fishPerks;
    JSONObject fishStats;
    JSONObject fishBonuses;
    JSONObject fishSkills;
*/
    int totalCommonFish;
    int totalExoticFish;
    int totalCash;
    long lastFish;
    long firstFish;

    int[] fishRange;

    static String NEWPLAYER_STR =
                "\"fish\":{" +
                "    \"metadata\":{" +
                "        \"last_fish\":0," +
                "        \"first_fish\":" + System.currentTimeMillis() +
                "      }" +
                "   }," +
                "   \"inventory\":{" +
                "       \"common_fish\":50," +
                "       \"exotic_fish\":5," +
                "       \"cash\":25" +
                "   }," +
                "   \"perks\":{}," +
                "   \"stats\":{" +
                "       \"fish_range\":\"0,30\"" +
                "   }," +
                "   \"bonuses\":{}," +
                "   \"skills\":{}";

    public FishParser(String data, MessageReceivedEvent ev){
        event = ev;
    }

    public static void createNewPlayer() {
        try {
            FileWriter myWriter = new FileWriter("data/users/" + event.getAuthor().getId() + ".json");
            myWriter.write(NEWPLAYER_STR);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void goFish(){
        int fishCaught = fishRange[0] + new Random().nextInt(fishRange[1]);
        System.out.println(fishCaught);
    }

    public FishParser writeData(){
        try {
            FileWriter myWriter = new FileWriter("data/users/" + event.getAuthor().getId() + ".json");
            myWriter.write(toString());
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }


}
