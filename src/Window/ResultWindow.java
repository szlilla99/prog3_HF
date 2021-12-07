package Window;

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

public class ResultWindow implements ActionListener {
    JFrame frame = new JFrame("Results");

    JButton exitButton;
    JPanel greenPanel;

    List<Player> players = new ArrayList<Player>();


    public ResultWindow() throws IOException {


        exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(200, 80));
        exitButton.setHorizontalAlignment(JButton.CENTER);
        exitButton.setFocusable(false);
        exitButton.setHorizontalTextPosition(JButton.CENTER);
        exitButton.setVerticalTextPosition(JButton.BOTTOM);
        exitButton.setFont(new Font("Comic Sans", Font.BOLD, 25));
        exitButton.setForeground(Color.cyan);
        exitButton.setBackground(Color.lightGray);
        exitButton.setBorder(BorderFactory.createEtchedBorder());
        exitButton.addActionListener(this);

        greenPanel = new JPanel();
        //greenPanel.setBackground(Color.green);
        greenPanel.setBounds(100, 600, 200, 100);
        //greenPanel.setLayout(new GridLayout(3,1));

        //JTable table = new JTable();
        //JScrollPane scrollPane = new JScrollPane(table);
        //table.setFillsViewportHeight(true);
        createUI();

        greenPanel.add(exitButton);
        frame.add(greenPanel);

    }

    static public List<Player> loadList() throws IOException {
        File file = new File("result.txt");
        String readline = null;

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Player> players = new ArrayList<Player>();
        while ((readline = bufferedReader.readLine()) != null) {
            //String[] split;
            String[] splitData = readline.split(";");


            Player player = new Player(splitData[0]);
            //player.setName(splitData[0]);
            player.setEasyLevel(splitData[1]);
            player.setMediumLevel(splitData[2]);
            player.setHardLevel(splitData[3]);

            players.add(player);
        }
        return players;
    }

    static public void saveList(List<Player> players) throws IOException {
        File file = new File("result.txt");
        String writeline = null;

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for(int i= 0; i< players.size(); i++){
            writeline = "";
            writeline += players.get(i).getName()+";";
            writeline += players.get(i).getEasyLevel()+";";
            writeline += players.get(i).getMediumLevel()+";";
            writeline += players.get(i).getHardLevel();

            bufferedWriter.write(writeline+"\n");

        }
        bufferedWriter.close();
        fileWriter.close();
    }


    public void addPlayer(Player player){
        players.add(player);
    }

    private void createUI() throws IOException {
        JTable table = new JTable();

        players = loadList();


        ResultTable resultTable = new ResultTable();

        resultTable.setList(players);
        table.setModel(resultTable);

        //table.setLayout(new BorderLayout());
        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,800);
        frame.setResizable(false);
        frame.setLayout(null);
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

