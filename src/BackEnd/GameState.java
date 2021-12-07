package BackEnd;

import Window.GameWindowMedium;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class GameState implements Serializable {
    Long serialVersionUID = 352637817389706347L;
    int width;
    int height;
    Color[][] fieldColor;

    public GameState(int w, int h, JButton[][] jb){
            width = w;
            height = h;
            fieldColor = new Color[width][height];
            for (int i = 0; i<width; i++){
                for (int j = 0; j< height; j++){
                    fieldColor[i][j] = jb[i][j].getBackground();
                }
            }
    }

    public Color[][] getColors() {
        return fieldColor;
    }

}
