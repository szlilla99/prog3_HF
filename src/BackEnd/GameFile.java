package BackEnd;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GameFile {

    public static void saveField(GameState gameState) throws IOException {
        String fileName;
        Path path;
        for (int i=0; i<4; i++){
            fileName= "saves\\unclosed" + i + ".txt";
            path= Paths.get(fileName);
            if (!Files.exists(path)){
                ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(fileName));
                out.writeObject(gameState);
                out.close();
                return;
            }
        }
    }

    public static ArrayList<GameState> loadField() throws IOException, ClassNotFoundException {
        ArrayList<GameState> allUnclosedBattle= new ArrayList<>();
        String fileName;
        Path path;
        for (int i=0; i<4; i++){
            fileName= "saves\\unclosed" + i + ".txt";
            path= Paths.get(fileName);
            if (Files.exists(path)){
                ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName));
                allUnclosedBattle.add((GameState) in.readObject());
                in.close();
            }
        }
        return allUnclosedBattle;
    }
}
