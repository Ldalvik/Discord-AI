package openai;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {
    public static void write(String path, String data) {
        Writer out;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(path), StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            out.write(data);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String read(String path) {
        try {
            return Files.readString(Path.of(path), StandardCharsets.UTF_8).replace("â€™","'");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
