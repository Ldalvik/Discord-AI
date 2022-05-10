package root.ogbot.decoder;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.utils.AttachmentOption;
import root.ogbot.decoder.API.Metadata.MetadataApi;
import root.ogbot.decoder.API.Upgrades.UpgradeApi;
import root.ogbot.decoder.Utils.Data;
import root.ogbot.decoder.Utils.Utils;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.Arrays;

public class Decoder {


    static UpgradeApi upgrades;
    static MetadataApi metadata;
    public static void run(MessageReceivedEvent event, File file, String rim) throws IOException {
        ByteBuffer buf = ByteBuffer.wrap(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
        buf.order(ByteOrder.LITTLE_ENDIAN);
        upgrades   = new UpgradeApi(buf);
        metadata   = new MetadataApi(buf);

        event.getMessage().reply("").setEmbeds(changeRims(rim, file).build())
                .addFile(new File(file.getAbsolutePath())).queue();
    }

    public static EmbedBuilder changeRims(String rimId, File file) {
        EmbedBuilder emb = new EmbedBuilder()
                .setTitle("RIMS SWAP SUCCESSFUL", null)
                .setColor(Color.GREEN)
                .setDescription("Rim's swapped successfully. Please message root.#6923 for questions or bug reports.")
                .addBlankField(false)
                .addField("Car", metadata.getCarName(), false)
                .addBlankField(false)
                .addField("Original rims", upgrades.getTiresAndRims().getRims(), false)
                .addBlankField(false)
                .addField("New rims", rimId, false)
                .setFooter("Website: \n" +
                                "https://ldalvik.github.io/SwapBot/",
                        "https://avatars.githubusercontent.com/u/25795619?s=400&u=45b3491cbd606e3bbbb14492b7807e3975b9bb0b&v=4");
        //.setThumbnail("https://avatars.githubusercontent.com/u/25795619?s=400&u=45b3491cbd606e3bbbb14492b7807e3975b9bb0b&v=4");

        try {
            byte[] array = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
            int id = 0;
            for(String line : Data.RIMS_ID)
                if (line.toLowerCase().split(",")[1].equals(rimId.toLowerCase()))
                    id = Integer.parseInt(line.split(",")[0]);
            System.out.println("ID: " + id);
            byte[] rimHex = Utils.getBytes(id);
            array[10] = rimHex[0];
            array[11] = rimHex[1];
            array[12] = rimHex[2];
            array[13] = rimHex[3];

            FileOutputStream f = new FileOutputStream(file.getAbsoluteFile());
            f.write(array);
            f.close();
            System.out.println("Rims switched from " + upgrades.getTiresAndRims().getRims() + " to " + rimId);
            System.out.println("New rim bytes=" + Arrays.toString(rimHex));
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println(Arrays.toString(array));
        } catch (IOException e) {
            emb = new EmbedBuilder()
                    .setTitle("RIMS SWAP FAILED", null)
                    .setColor(Color.RED)
                    .setDescription("Rim's swap failed. Please send the below timestamp to root.#6923.")
                    .addBlankField(false)
                    .addField("Rims selected", rimId, false)
                    .addBlankField(false)
                    .addField("Exception", "```" + e.getMessage() + "```", false)
                    .setTimestamp(Instant.now())
                    .setAuthor("Swap Bot")
                    .setFooter("For more in-depth explanations and extra info, visit the bot's website here.\n" +
                                    "https://ldalvik.github.io/SwapBot/",
                            "https://avatars.githubusercontent.com/u/25795619?s=400&u=45b3491cbd606e3bbbb14492b7807e3975b9bb0b&v=4");
            //.setThumbnail("https://avatars.githubusercontent.com/u/25795619?s=400&u=45b3491cbd606e3bbbb14492b7807e3975b9bb0b&v=4");
            e.printStackTrace();
        }
        return emb;
    }
}
