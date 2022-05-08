package root.ogbot.decoder;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.utils.AttachmentOption;
import root.ogbot.decoder.API.Metadata.MetadataApi;
import root.ogbot.decoder.API.Upgrades.UpgradeApi;
import root.ogbot.decoder.Utils.Data;
import root.ogbot.decoder.Utils.Utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Decoder {
    static UpgradeApi upgrades;
    static MetadataApi metadata;
    public static void run(MessageReceivedEvent event, File file, String rim) throws IOException {
        ByteBuffer buf = ByteBuffer.wrap(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
        buf.order(ByteOrder.LITTLE_ENDIAN);
        upgrades   = new UpgradeApi(buf);
        metadata   = new MetadataApi(buf);

        event.getMessage().reply(changeRims(rim, file)).queue();
        event.getMessage().reply(new File(file.getAbsolutePath()), file.getName()).queue();

    }

    public static String changeRims(String rimId, File file) {
        try {
            byte[] array = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
            int id = 0;
            for(String line : Data.RIMS_ID)
                if (line.split(",")[1].equals(rimId)) id = Integer.parseInt(line.split(",")[0]);
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
            e.printStackTrace();
        }
        return "Rims on " + metadata.getCarName() + " changed from " + upgrades.getTiresAndRims().getRims() + " to " + rimId;
    }
}
