package Window;

import GUI.MenuGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindowEasy<balls> implements ActionListener {
    JFrame frame = new JFrame("Game field - Easy");

    JPanel[] ballPanels = new JPanel[8];

    JPanel bluePanel;
    JPanel greenPanel;

    JButton retakeButton = new JButton("Retake");
    JButton backButton = new JButton("Back");
    JButton addStorageButton = new JButton("Add");

    JButton[][] balls = new JButton[8][4];

    JButton exitButton;

    public GameWindowEasy(){

        retakeButton.setPreferredSize(new Dimension(100,100));
        retakeButton.addActionListener(this::actionPerformed);

        backButton.setPreferredSize(new Dimension(100,100));


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

        for (int i= 0; i<8; i++){
            ballPanels[i] = new JPanel();
        }

        for(int i = 0; i < 8; i++){
            for(int j = 0; j<4; j++){
                if(i == 0){
                    balls[i][j] = new JButton();
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 1){
                    balls[i][j] = new JButton();
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 2){
                    balls[i][j] = new JButton();
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 3){
                    balls[i][j] = new JButton();
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 4){
                    balls[i][j] = new JButton();
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 5){
                    balls[i][j] = new JButton();
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 6){
                    balls[i][j] = new JButton();
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 7){
                    balls[i][j] = new JButton();
                    ballPanels[i].add(balls[i][j]);
                    ballPanels[i].setVisible(false);
                }


            }
        }

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


        bluePanel.add(retakeButton);
        bluePanel.add(backButton);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exitButton)
        {
            frame.dispose();
            MenuGUI menuGUI = new MenuGUI();
        }
        else if(e.getSource() == addStorageButton){
            ballPanels[7].setVisible(true);
        }
        else if (e.getSource() == backButton){

        }
        else if(e.getSource() == retakeButton){
            frame.dispose();
            GameWindowEasy gameWindowEasy = new GameWindowEasy();
        }
    }
}
