package root.ogbot.decoder;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import root.ogbot.decoder.API.Metadata.MetadataApi;
import root.ogbot.decoder.API.Upgrades.UpgradeApi;
import root.ogbot.decoder.Utils.Data;
import root.ogbot.decoder.Utils.Utils;
import swap.bot.root.utils.Embeds;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;

public class Decoder {


    static UpgradeApi upgrades;
    static MetadataApi metadata;
    public static void run(MessageReceivedEvent event, File file, String rim) throws IOException {
        byte[] fileBytes = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
        if(fileBytes.length != 378){
            event.getMessage().reply("ERROR").setEmbeds(Embeds.errorWrongFileSize(fileBytes.length).build())
                    .queue();
            return;
        }

        ByteBuffer buf = ByteBuffer.wrap(fileBytes);
        buf.order(ByteOrder.LITTLE_ENDIAN);
        upgrades   = new UpgradeApi(buf);
        metadata   = new MetadataApi(buf);

        event.getMessage().reply("SUCCESS").setEmbeds(changeRims(rim, file).build())
                .addFile(new File(file.getAbsolutePath())).queue();
    }

    public static EmbedBuilder changeRims(String rimId, File file) {
        EmbedBuilder emb = new EmbedBuilder()
                .setTitle("RIM SWAP SUCCESSFUL", null)
                .setColor(Color.GREEN)
                .setDescription("Rim's swapped successfully. Please message root.#6923 for questions or bug reports.")
                .addField("Car", metadata.getCarName(), false)
                .addField("Original rims", upgrades.getTiresAndRims().getRims(), false)
                .addField("New rims", rimId, false)
                .setFooter("If you need help, message root#6923 or ask for help in the discord.", null);
        try {
            byte[] array = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
            int id = 0;
            for(String line : Data.RIMS_ID)
                if (line.toLowerCase().split(",")[1].equals(rimId.toLowerCase()))
                    id = Integer.parseInt(line.split(",")[0]);

            byte[] rimHex = Utils.getBytes(id);
            array[10] = rimHex[0];
            array[11] = rimHex[1];
            array[12] = rimHex[2];
            array[13] = rimHex[3];

            FileOutputStream f = new FileOutputStream(file.getAbsoluteFile());
            f.write(array);
            f.close();
        } catch (IOException e) {
            emb = new EmbedBuilder()
                    .setTitle("RIM SWAP FAILED", null)
                    .setColor(Color.RED)
                    .setDescription("Rim's swap failed. Please send the below timestamp to root.#6923.")
                    .addBlankField(false)
                    .addField("Rims selected", rimId, false)
                    .addBlankField(false)
                    .addField("Exception", "```" + e.getMessage() + "```", false)
                    .setTimestamp(Instant.now())
                    .setAuthor("Swap Bot");
            e.printStackTrace();
        }
        return emb;
    }
}
