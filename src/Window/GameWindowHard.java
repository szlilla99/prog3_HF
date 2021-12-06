package Window;

import GUI.MenuGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindowHard<balls> implements ActionListener {
    JFrame frame = new JFrame("Game field - Hard");

    JPanel[] ballPanels = new JPanel[12];

    JPanel bluePanel;
    JPanel greenPanel;

    JButton retakeButton = new JButton("Retake");
    JButton backButton = new JButton("Back");
    JButton addStorageButton = new JButton("Add");

    JButton[][] balls = new JButton[12][4];

    JButton exitButton;

    public GameWindowHard(){
        //ImageIcon retakeIcon = new ImageIcon("reverse.png");
        //ImageIcon backIcon = new ImageIcon("back2.jpg");
        //ImageIcon pluszIcon = new ImageIcon("plus.jpg");

        //retakeButton.setIcon(retakeIcon);
        retakeButton.setPreferredSize(new Dimension(100,100));

        //backButton.setIcon(backIcon);
        backButton.setPreferredSize(new Dimension(100,100));

        //addstorageButton.setIcon(pluszIcon);
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
        bluePanel.setBounds(0, 0, 1200, 160);
        //bluePanel.setHorizontalAlignment(JPanel.CENTER);

        bluePanel.setLayout(new FlowLayout());

        greenPanel = new JPanel();
        //greenPanel.setBackground(Color.green);
        greenPanel.setBounds(500, 600, 200, 200);
        greenPanel.setLayout(new GridLayout(3,1));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,800);
        frame.setResizable(false);
        frame.setLayout(null);

        for (int i= 0; i<12; i++){
            ballPanels[i] = new JPanel();
        }

        for(int i = 0; i < 12; i++){
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
                }
                else if(i == 8){
                    balls[i][j] = new JButton();
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 9){
                    balls[i][j] = new JButton();
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 10){
                    balls[i][j] = new JButton();
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 11){
                    balls[i][j] = new JButton();
                    ballPanels[i].add(balls[i][j]);
                    ballPanels[i].setVisible(false);
                }


            }
        }

        bluePanel.add(retakeButton);
        bluePanel.add(backButton);
        bluePanel.add(addStorageButton);
        greenPanel.add(exitButton);

        for (int i= 0; i<12; i++){
            ballPanels[0].setBounds(25, 200, 50, 200);
            ballPanels[1].setBounds(125, 200, 50, 200);
            ballPanels[2].setBounds(225, 200, 50, 200);
            ballPanels[3].setBounds(325, 200, 50, 200);
            ballPanels[4].setBounds(425, 200, 50, 200);
            ballPanels[5].setBounds(525, 200, 50, 200);
            ballPanels[6].setBounds(625, 200, 50, 200);
            ballPanels[7].setBounds(725, 200, 50, 200);
            ballPanels[8].setBounds(825, 200, 50, 200);
            ballPanels[9].setBounds(925, 200, 50, 200);
            ballPanels[10].setBounds(1025, 200, 50, 200);
            ballPanels[11].setBounds(1125, 200, 50, 200);
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
            ballPanels[11].setVisible(true);
        }
        else if (e.getSource() == backButton){

        }
        else if(e.getSource() == retakeButton){

        }
    }
}
