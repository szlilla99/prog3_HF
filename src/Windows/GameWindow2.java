package Windows;

import GUI.MenuGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow2<balls> implements ActionListener {
    JFrame frame = new JFrame("Game field");

    JPanel b1Panel;
    JPanel b2Panel;
    JPanel b3Panel;
    JPanel b4Panel;
    JPanel b5Panel;
    JPanel b6Panel;
    JPanel b7Panel;
    JPanel plusPanel;

    JPanel bluePanel;
    JPanel greenPanel;

    JButton retakeButton = new JButton("Retake");
    JButton backButton = new JButton("Back");
    JButton addstorageButton = new JButton("Add");

    JButton[][] balls = new JButton[7][4];

    JButton exitButton;

    public GameWindow2(){
        //ImageIcon retakeIcon = new ImageIcon("reverse.png");
        //ImageIcon backIcon = new ImageIcon("back2.jpg");
        //ImageIcon pluszIcon = new ImageIcon("plus.jpg");

        //retakeButton.setIcon(retakeIcon);
        retakeButton.setPreferredSize(new Dimension(100,100));

        //backButton.setIcon(backIcon);
        backButton.setPreferredSize(new Dimension(100,100));

        //addstorageButton.setIcon(pluszIcon);
        addstorageButton.setPreferredSize(new Dimension(100,100));

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

        /*for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                balls[i][j] = new JButton("O");
                balls[i][j].setBackground(Color.BLACK);
                balls[i][j].setForeground(Color.WHITE);
                //balls[i][j].addActionListener(new TileListener());
                //ballpanel.add(balls[i][j]);
            }
        }*/

        /*
        plusPanel = new JPanel();
        //plusPanel.setBackground(Color.red);
        plusPanel.setBounds(725, 200, 50, 200);
        plusPanel.setLayout(new GridLayout(4,1));
        //plusPanel.setVisible(false);
*/
        b1Panel = new JPanel();
        b1Panel.setBackground(Color.red);
        b1Panel.setBounds(25, 200, 50, 200);
        b1Panel.setLayout(new GridLayout(4,1));

        b2Panel = new JPanel();
        b2Panel.setBackground(Color.red);
        b2Panel.setBounds(125, 200, 50, 200);
        b2Panel.setLayout(new GridLayout(4,1));

        b3Panel = new JPanel();
        b3Panel.setBackground(Color.red);
        b3Panel.setBounds(225, 200, 50, 200);
        b3Panel.setLayout(new GridLayout(4,1));

        b4Panel = new JPanel();
        b4Panel.setBackground(Color.red);
        b4Panel.setBounds(325, 200, 50, 200);
        b4Panel.setLayout(new GridLayout(4,1));

        b5Panel = new JPanel();
        b5Panel.setBackground(Color.red);
        b5Panel.setBounds(425, 200, 50, 200);
        b5Panel.setLayout(new GridLayout(4,1));

        b6Panel = new JPanel();
        b6Panel.setBackground(Color.red);
        b6Panel.setBounds(525, 200, 50, 200);
        b6Panel.setLayout(new GridLayout(4,1));

        b7Panel = new JPanel();
        b7Panel.setBackground(Color.red);
        b7Panel.setBounds(625, 200, 50, 200);
        b7Panel.setLayout(new GridLayout(4,1));


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

        for(int i = 0; i < 7; i++){
            for(int j = 0; j<4; j++){
                if(i == 0){
                    balls[i][j] = new JButton();
                    b1Panel.add(balls[i][j]);
                }
                else if(i == 1){
                    balls[i][j] = new JButton();
                    b2Panel.add(balls[i][j]);
                }
                else if(i == 2){
                    balls[i][j] = new JButton();

                    b3Panel.add(balls[i][j]);
                }
                else if(i == 3){
                    balls[i][j] = new JButton();

                    b4Panel.add(balls[i][j]);
                }
                else if(i == 4){
                    balls[i][j] = new JButton();

                    b5Panel.add(balls[i][j]);
                }
                else if(i == 5){
                    balls[i][j] = new JButton();

                    b6Panel.add(balls[i][j]);
                }
                else if(i == 6){
                    balls[i][j] = new JButton();

                    b7Panel.add(balls[i][j]);
                }
                

            }
        }
/*
        plusPanel.add(plus1);
        plusPanel.add(plus2);
        plusPanel.add(plus3);
        plusPanel.add(plus4);
*/
        bluePanel.add(retakeButton);
        bluePanel.add(backButton);
        bluePanel.add(addstorageButton);

        greenPanel.add(exitButton);

        frame.add(b1Panel);
        frame.add(b2Panel);
        frame.add(b3Panel);
        frame.add(b4Panel);
        frame.add(b5Panel);
        frame.add(b6Panel);
        frame.add(b7Panel);
        //frame.add(plusPanel);

        frame.add(bluePanel);
        frame.add(greenPanel);

        //frame.add(ballpanel);

        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exitButton)
        {
            frame.dispose();
            MenuGUI menuGUI = new MenuGUI();
        }
    }
}
