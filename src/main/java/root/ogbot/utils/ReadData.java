package root.ogbot.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadData {


    public static void setTypeHighscore(String userID, int score){
        try {
            FileWriter myWriter = new FileWriter("data/type/users/" + userID + ".txt");
            myWriter.write(""+score);
            myWriter.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int getTypeHighscore(String userID) throws IOException {
        if(!new File("data/type/users/" + userID + ".txt").exists()){
            if(new File("data/type/users/" + userID + ".txt").createNewFile())
                setTypeHighscore(userID, 99999); System.out.println("File created");
            return 99999;
        } else {
            try {
               return Integer.parseInt(new String(Files.readAllBytes(
                        Paths.get("data/type/users/" + userID + ".txt"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static boolean getTypeGlobalHighscore(String userID, int score) {
        String data;
            try {
                data = new String(Files.readAllBytes(
                        Paths.get("data/type/highscore.txt")));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            int highscore = Integer.parseInt(data.split(",")[1]);
            if(score<highscore){
                setTypeHighscore(userID, score);
                return true;
            } else {
                return false;
            }

        }

        public static void setTypeGlobalHighscore(String userID, int score){
            try {
                FileWriter myWriter = new FileWriter("data/type/highscore.txt");
                myWriter.write(userID + "," + score);
                myWriter.close();
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    public static String[] getLoadTimes() {
        String data;
        try {
            data = new String(Files.readAllBytes(
                    Paths.get("data/loadtimes.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       return data.split(",");
    }

    public static void setFastLoadTime(int time){
        String data;
        try {
            data = new String(Files.readAllBytes(
                    Paths.get("data/loadtimes.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String slow = data.split(",")[0];
        try {
            FileWriter myWriter = new FileWriter("data/loadtimes.txt");
            myWriter.write(slow + "," + time);
            myWriter.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setSlowLoadTime(int time){
            String data;
            try {
                data = new String(Files.readAllBytes(
                        Paths.get("data/loadtimes.txt")));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String fast = data.split(",")[1];
        try {
            FileWriter myWriter = new FileWriter("data/loadtimes.txt");
            myWriter.write(time + "," + fast);
            myWriter.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
