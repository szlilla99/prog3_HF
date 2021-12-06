package Window;

import GUI.MenuGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindowMedium<balls> implements ActionListener {
    JFrame frame = new JFrame("Game field - Medium");

    JPanel[] ballPanels = new JPanel[10];

    JPanel bluePanel;
    JPanel greenPanel;

    boolean first = true;

    JButton retakeButton = new JButton("Retake");
    JButton backButton = new JButton("Back");
    JButton addStorageButton = new JButton("Add");

    JButton[][] balls = new JButton[10][4];

    JButton exitButton;

    Color buttonColor = Color.lightGray;

    public GameWindowMedium(){
        //ImageIcon retakeIcon = new ImageIcon("reverse.png");
        //ImageIcon backIcon = new ImageIcon("back2.jpg");
        //ImageIcon pluszIcon = new ImageIcon("plus.jpg");

        //retakeButton.setIcon(retakeIcon);
        retakeButton.setPreferredSize(new Dimension(100,100));
        retakeButton.addActionListener(this::actionPerformed);

        //backButton.setIcon(backIcon);
        backButton.setPreferredSize(new Dimension(100,100));

        //addstorageButton.setIcon(pluszIcon);
        addStorageButton.setPreferredSize(new Dimension(100,100));
        addStorageButton.addActionListener(this::actionPerformed);

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
        exitButton.addActionListener(this::actionPerformed);

        bluePanel = new JPanel();
        //bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0, 0, 1000, 160);
        //bluePanel.setHorizontalAlignment(JPanel.CENTER);

        bluePanel.setLayout(new FlowLayout());

        greenPanel = new JPanel();
        //greenPanel.setBackground(Color.green);
        greenPanel.setBounds(400, 600, 200, 200);
        greenPanel.setLayout(new GridLayout(3,1));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,800);
        frame.setResizable(false);
        frame.setLayout(null);

        for (int i= 0; i<10; i++){
            ballPanels[i] = new JPanel();
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j<4; j++){
                if(i == 0){
                    balls[i][j] = new JButton();
                    balls[i][j].addActionListener(this::Coloring);
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 1){
                    balls[i][j] = new JButton();
                    balls[i][j].addActionListener(this::Coloring);
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 2){
                    balls[i][j] = new JButton();
                    balls[i][j].addActionListener(this::Coloring);
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 3){
                    balls[i][j] = new JButton();
                    balls[i][j].addActionListener(this::Coloring);
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 4){
                    balls[i][j] = new JButton();
                    balls[i][j].addActionListener(this::Coloring);
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 5){
                    balls[i][j] = new JButton();
                    balls[i][j].addActionListener(this::Coloring);
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 6){
                    balls[i][j] = new JButton();
                    balls[i][j].addActionListener(this::Coloring);
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 7){
                    balls[i][j] = new JButton();
                    balls[i][j].addActionListener(this::Coloring);
                    balls[i][j].setBackground(Color.white);
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 8){
                    balls[i][j] = new JButton();
                    balls[i][j].addActionListener(this::Coloring);
                    balls[i][j].setBackground(Color.white);
                    ballPanels[i].add(balls[i][j]);
                }
                else if(i == 9){
                    balls[i][j] = new JButton();
                    balls[i][j].addActionListener(this::Coloring);
                    balls[i][j].setBackground(Color.white);
                    ballPanels[i].add(balls[i][j]);
                    ballPanels[i].setVisible(false);
                }


            }
        }
        balls[0][0].setBackground(Color.red);
        balls[0][1].setBackground(Color.pink);
        balls[0][2].setBackground(Color.pink);
        balls[0][3].setBackground(Color.red);

        balls[1][0].setBackground(Color.red);
        balls[1][1].setBackground(Color.blue);
        balls[1][2].setBackground(Color.red);
        balls[1][3].setBackground(Color.yellow);

        balls[2][0].setBackground(Color.orange);
        balls[2][1].setBackground(Color.orange);
        balls[2][2].setBackground(Color.cyan);
        balls[2][3].setBackground(Color.orange);

        balls[3][0].setBackground(Color.black);
        balls[3][1].setBackground(Color.cyan);
        balls[3][2].setBackground(Color.blue);
        balls[3][3].setBackground(Color.black);

        balls[4][0].setBackground(Color.orange);
        balls[4][1].setBackground(Color.black);
        balls[4][2].setBackground(Color.yellow);
        balls[4][3].setBackground(Color.cyan);

        balls[5][0].setBackground(Color.yellow);
        balls[5][1].setBackground(Color.pink);
        balls[5][2].setBackground(Color.black);
        balls[5][3].setBackground(Color.yellow);

        balls[6][0].setBackground(Color.cyan);
        balls[6][1].setBackground(Color.blue);
        balls[6][2].setBackground(Color.blue);
        balls[6][3].setBackground(Color.pink);

        bluePanel.add(retakeButton);
        bluePanel.add(backButton);
        bluePanel.add(addStorageButton);
        greenPanel.add(exitButton);

        for (int i= 0; i<10; i++){
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
            ballPanels[i].setLayout(new GridLayout(4,1));
            frame.add(ballPanels[i]);
        }

        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.setVisible(true);




    }

    public void Coloring(ActionEvent actionEvent) {
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                if(actionEvent.getSource() == balls[i][j]){
                    if(first){
                        if(balls[i][j].getBackground() != Color.white && buttonColor != Color.white){
                            buttonColor = balls[i][j].getBackground();
                            balls[i][j].setBackground(Color.white);
                            first = false;
                            return;
                        }

                    }
                    else if(!first){
                        if(balls[i][j].getBackground() == Color.white && buttonColor != Color.white){
                            balls[i][j].setBackground(buttonColor);
                            first = true;
                            return;
                        }

                    }
                }
            }
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
            ballPanels[9].setVisible(true);
        }
        else if (e.getSource() == backButton){

        }
        else if(e.getSource() == retakeButton) {
            frame.dispose();
            GameWindowMedium gameWindowMedium = new GameWindowMedium();

        }


    }






}

