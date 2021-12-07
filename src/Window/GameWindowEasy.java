package Window;

import BackEnd.GameFile;
import BackEnd.GameState;
import GUI.MenuGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GameWindowEasy<balls> implements ActionListener {
    JFrame frame = new JFrame("Game field - Easy");

    int width = 8;
    int height = 4;

    JPanel[] ballPanels = new JPanel[8];

    JPanel bluePanel;
    JPanel greenPanel;

    JButton retakeButton = new JButton("Retake");
    //JButton backButton = new JButton("Back");
    JButton addStorageButton = new JButton("Add");

    JButton[][] balls = new JButton[width][height];

    JButton exitButton;
    Color buttonColor = Color.lightGray;

    boolean first = true;

    public GameWindowEasy(){

        retakeButton.setPreferredSize(new Dimension(100,100));
        retakeButton.addActionListener(this::actionPerformed);

        //backButton.setPreferredSize(new Dimension(100,100));


        addStorageButton.setPreferredSize(new Dimension(100,100));
        addStorageButton.addActionListener(this);

        exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(200,80));
        exitButton.setHorizontalAlignment(JButton.CENTER);
        exitButton.setFocusable(false);
        exitButton.setHorizontalTextPosition(JButton.CENTER);
        exitButton.setVerticalTextPosition(JButton.BOTTOM);
        exitButton.setFont(new Font("Comic Sans",Font.BOLD,25));
        exitButton.setForeground(Color.cyan);
        exitButton.setBackground(Color.lightGray);
        exitButton.setBorder(BorderFactory.createEtchedBorder());
        exitButton.addActionListener(this);

        bluePanel = new JPanel();
        //bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0, 0, 800, 160);
        //bluePanel.setHorizontalAlignment(JPanel.CENTER);

        bluePanel.setLayout(new FlowLayout());

        greenPanel = new JPanel();
        //greenPanel.setBackground(Color.green);
        greenPanel.setBounds(300, 600, 200, 200);
        greenPanel.setLayout(new GridLayout(3,1));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setResizable(false);
        frame.setLayout(null);

        for (int i= 0; i<width; i++){
            ballPanels[i] = new JPanel();
        }

        for(int i = 0; i < 8; i++){
            for(int j = 0; j<4; j++){
                balls[i][j] = new JButton();
                balls[i][j].addActionListener(this::Coloring);
                if(i == 0){
                    ballPanels[i].add(balls[i][j]);
                    if(j>0){
                        balls[i][j].setEnabled(false);
                    }
                }
                else if(i == 1){
                    ballPanels[i].add(balls[i][j]);
                    if(j>0){
                        balls[i][j].setEnabled(false);
                    }
                }
                else if(i == 2){
                    ballPanels[i].add(balls[i][j]);
                    if(j>0){
                        balls[i][j].setEnabled(false);
                    }
                }
                else if(i == 3){
                    ballPanels[i].add(balls[i][j]);
                    if(j>0){
                        balls[i][j].setEnabled(false);
                    }
                }
                else if(i == 4){
                    ballPanels[i].add(balls[i][j]);
                    if(j>0){
                        balls[i][j].setEnabled(false);
                    }
                }
                else if(i == 5){
                    balls[i][j].setBackground(Color.white);
                    ballPanels[i].add(balls[i][j]);
                    if(j != 3){
                        balls[i][j].setEnabled(false);
                    }
                }
                else if(i == 6){
                    balls[i][j].setBackground(Color.white);
                    ballPanels[i].add(balls[i][j]);
                    if(j != 3){
                        balls[i][j].setEnabled(false);
                    }
                }
                else if(i == 7){
                    balls[i][j].setBackground(Color.white);
                    ballPanels[i].add(balls[i][j]);
                    if(j != 3){
                        balls[i][j].setEnabled(false);
                    }
                    ballPanels[i].setVisible(false);
                }


            }
        }
        try {
            Color[][] colors = GameFile.loadField().get(3).getColors();
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    balls[i][j].setBackground(colors[i][j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
/*
        balls[0][0].setBackground(Color.blue);
        balls[0][1].setBackground(Color.cyan);
        balls[0][2].setBackground(Color.orange);
        balls[0][3].setBackground(Color.cyan);

        balls[1][0].setBackground(Color.orange);
        balls[1][1].setBackground(Color.pink);
        balls[1][2].setBackground(Color.pink);
        balls[1][3].setBackground(Color.orange);

        balls[2][0].setBackground(Color.red);
        balls[2][1].setBackground(Color.blue);
        balls[2][2].setBackground(Color.red);
        balls[2][3].setBackground(Color.pink);

        balls[3][0].setBackground(Color.pink);
        balls[3][1].setBackground(Color.cyan);
        balls[3][2].setBackground(Color.red);
        balls[3][3].setBackground(Color.blue);

        balls[4][0].setBackground(Color.orange);
        balls[4][1].setBackground(Color.red);
        balls[4][2].setBackground(Color.cyan);
        balls[4][3].setBackground(Color.blue);

        try {
            GameFile.saveField(new GameState(5, 4, balls));
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        bluePanel.add(retakeButton);
        //bluePanel.add(backButton);
        bluePanel.add(addStorageButton);
        greenPanel.add(exitButton);

        for (int i= 0; i<8; i++){
            ballPanels[0].setBounds(25, 200, 50, 200);
            ballPanels[1].setBounds(125, 200, 50, 200);
            ballPanels[2].setBounds(225, 200, 50, 200);
            ballPanels[3].setBounds(325, 200, 50, 200);
            ballPanels[4].setBounds(425, 200, 50, 200);
            ballPanels[5].setBounds(525, 200, 50, 200);
            ballPanels[6].setBounds(625, 200, 50, 200);
            ballPanels[7].setBounds(725, 200, 50, 200);
            ballPanels[i].setLayout(new GridLayout(4,1));
            frame.add(ballPanels[i]);
        }

        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.setVisible(true);


    }


    public void enablePut(JButton[][] balls){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 4; j++){
                balls[i][j].setEnabled(false);
                if(balls[i][j].getBackground() == Color.white
                        && (j==3 || balls[i][j+1].getBackground() == buttonColor)){
                    balls[i][j].setEnabled(true);
                }
            }
        }
    }

    public void enablePick(JButton[][] balls){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j<4; j++){
                balls[i][j].setEnabled(false);
            }
            for(int j = 0; j<4; j++) {
                if (balls[i][j].getBackground() != Color.white) {
                    balls[i][j].setEnabled(true);
                    break;
                }

            }
        }
    }



    public void Coloring(ActionEvent actionEvent) {
        JButton jb = (JButton) actionEvent.getSource();
        if ((jb.getBackground() == Color.white) == first) return;

        if (first) {
            buttonColor = jb.getBackground();
            jb.setBackground(Color.white);
            first = false;

            enablePut(balls);
            return;

        } else{
            jb.setBackground(buttonColor);
            first = true;
            enablePick(balls);
            return;

        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exitButton)
        {
            frame.dispose();
            MenuGUI menuGUI = new MenuGUI();
        }
        else if(e.getSource() == addStorageButton){
            ballPanels[7].setVisible(true);
        }/*
        else if (e.getSource() == backButton){

        }*/
        else if(e.getSource() == retakeButton){
            frame.dispose();
            GameWindowEasy gameWindowEasy = new GameWindowEasy();
        }
    }
}
