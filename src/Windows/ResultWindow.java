package Windows;

import BackEnd.Player;
import BackEnd.ResultTable;
import GUI.MenuGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ResultWindow implements ActionListener{
        //private String data;

        JFrame frame = new JFrame("Results");

        JButton exitButton;
        JPanel greenPanel;
        //JTextField playerName = new JTextField();
        //JTextField levelNum = new JTextField();


        public ResultWindow(){


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

            greenPanel = new JPanel();
            //greenPanel.setBackground(Color.green);
            greenPanel.setBounds(300, 600, 200, 200);
            greenPanel.setLayout(new GridLayout(3,1));

            //JTable table = new JTable();
            //JScrollPane scrollPane = new JScrollPane(table);
            //table.setFillsViewportHeight(true);

            greenPanel.add(exitButton);
            frame.add(greenPanel);




        }

        private void createUI() throws IOException {
            JTable table = new JTable();

            String readline = null;

            ResultTable resultTable = new ResultTable();
            File file = new File("result.txt");

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<Player> players = new ArrayList<Player>();
            while ((readline = bufferedReader.readLine()) != null){
                //String[] split;
                String[] splitData = readline.split(";");

                Player player = new Player();
                player.setName(splitData[0]);
                player.setEasyLevel(splitData[1]);
                player.setMediumLevel(splitData[2]);
                player.setHardLevel(splitData[3]);

                players.add(player);
            }
            resultTable.setList(players);
            table.setModel(resultTable);

            frame.add(new JScrollPane(table));
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800,800);
            frame.setLayout(new BorderLayout());
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

