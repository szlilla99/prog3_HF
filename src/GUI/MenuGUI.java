package GUI;

import BackEnd.ResultTable;
import Windows.GameWindow;
import Windows.GameWindow2;
import Windows.ResultWindow;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGUI extends JFrame implements ActionListener {

    JPanel bluePanel;
    JPanel redPanel;
    JPanel greenPanel;

    JLabel iconLabel;
    JLabel nameLabel;

    JTextField nameText;

    JButton startButton;
    JButton resultButton;
    JButton nameSaveButton;

    JComboBox levelBox;

    public MenuGUI() {
        super("Ball Sort Puzzle");

        ImageIcon ballIcon = new ImageIcon("ball.jpg");
        iconLabel = new JLabel("Ball Sort Puzzle");
        iconLabel.setIcon(ballIcon);
        iconLabel.setHorizontalTextPosition(JLabel.CENTER);
        iconLabel.setFont(new Font("Comic Sans",Font.BOLD,50));
        iconLabel.setForeground(Color.white);
        iconLabel.setVisible(true);

        nameText = new JTextField("Player1");
        nameText.setPreferredSize(new Dimension(400, 100));
        nameText.setFont(new Font("Comic Sans",Font.BOLD,30));
        //nameText.setHorizontalAlignment(JTextField.CENTER);

        nameLabel = new JLabel("Name: ");
        nameLabel.setPreferredSize(new Dimension(150,100));
        nameLabel.setFont(new Font("Comic Sans",Font.BOLD,30));
        //nameLabel.setHorizontalAlignment(JLabel.CENTER);

        nameSaveButton = new JButton("Save");
        nameSaveButton.setPreferredSize(new Dimension(150,80));
        //nameSaveButton.setFont(new Font("Comic Sans",Font.BOLD,30));
        nameSaveButton.setHorizontalAlignment(JButton.CENTER);
        nameSaveButton.setFocusable(false);
        nameSaveButton.setHorizontalTextPosition(JButton.CENTER);
        nameSaveButton.setVerticalTextPosition(JButton.BOTTOM);
        nameSaveButton.setFont(new Font("Comic Sans",Font.BOLD,25));
        nameSaveButton.setForeground(Color.cyan);
        nameSaveButton.setBackground(Color.lightGray);
        nameSaveButton.setBorder(BorderFactory.createEtchedBorder());

        String[] levels = {"Easy", "Medium", "High"};
        levelBox = new JComboBox(levels);
        levelBox.setFont(new Font("Comic Sans",Font.BOLD,25));
        levelBox.setForeground(Color.cyan);
        levelBox.setBackground(Color.lightGray);

        startButton = new JButton("Start");
        startButton.setBounds(0, 0, 100, 30);
        startButton.setFocusable(false);
        startButton.setHorizontalTextPosition(JButton.CENTER);
        startButton.setVerticalTextPosition(JButton.BOTTOM);
        startButton.setFont(new Font("Comic Sans",Font.BOLD,25));
        startButton.setForeground(Color.cyan);
        startButton.setBackground(Color.lightGray);
        startButton.setBorder(BorderFactory.createEtchedBorder());
        startButton.setLayout(new GridLayout());
        startButton.addActionListener(this);

        resultButton = new JButton("Results");
        resultButton.setBounds(0, 0, 100, 30);
        resultButton.setFocusable(false);
        resultButton.setHorizontalTextPosition(JButton.CENTER);
        resultButton.setVerticalTextPosition(JButton.BOTTOM);
        resultButton.setFont(new Font("Comic Sans",Font.BOLD,25));
        resultButton.setForeground(Color.cyan);
        resultButton.setBackground(Color.lightGray);
        resultButton.setBorder(BorderFactory.createEtchedBorder());
        resultButton.setLayout(new GridLayout());
        resultButton.addActionListener(this);


        redPanel = new JPanel();
        //redPanel.setBackground(Color.red);
        redPanel.setBounds(120, 0, 800, 200);
        redPanel.setLayout(new BorderLayout());

        bluePanel = new JPanel();
        //bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(000, 240, 800, 160);
        //bluePanel.setHorizontalAlignment(JPanel.CENTER);
        bluePanel.setLayout(new FlowLayout());



        greenPanel = new JPanel();
        //greenPanel.setBackground(Color.green);
        greenPanel.setBounds(200, 400, 400, 300);
        greenPanel.setLayout(new GridLayout(3,1));




        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800,800);
        this.setVisible(true);
        this.setResizable(false);

        greenPanel.add(levelBox);
        greenPanel.add(startButton);
        greenPanel.add(resultButton);

        redPanel.add(iconLabel);

        bluePanel.add(nameLabel);
        bluePanel.add(nameText);
        bluePanel.add(nameSaveButton);

        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);



        //menuFrame.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==nameSaveButton) {

        }
        else if (e.getSource()==startButton){
            this.dispose();
            //GameWindow gameWindow = new GameWindow();
            GameWindow2 gameWindow2 = new GameWindow2();
        }
        else if (e.getSource()==resultButton){
            this.dispose();
            ResultWindow resultWindow = new ResultWindow();
        }

    }

    public static void main(String[] args) {
        new MenuGUI();
        //new ResultWindow();
    }


}
