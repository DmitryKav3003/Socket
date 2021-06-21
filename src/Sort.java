import java.io.*;
import java.util.*;

public class Sort {
    static ArrayList<String> songList = new ArrayList<>();
    public static void main(String[] args) {
        songList.add("Дюна/Дороги");
        songList.add("Виагра/Люби");
        songList.add("Алсу/Вечность");
        new Sort().go();
    }
    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
    void getSongs(){
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                addSong(line);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    void addSong(String LineToParse){
        String[] token = LineToParse.split("/");
        songList.add(token[0]);
    }
}


