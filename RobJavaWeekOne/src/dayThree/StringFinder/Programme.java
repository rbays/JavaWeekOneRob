package dayThree.StringFinder;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by student on 29-Jun-16.
 */
public class Programme extends JFrame{

    JPanel panel;
    JButton btnSearch;
    JTextArea searchableTxt;
    JTextArea characterFind;
    ScrollPane scrollPane;

    public Programme() {
        super("Rob's Character Finder");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,300);
        setResizable(false);
        setLayout(new GridLayout());
        setLocationRelativeTo(null);




        panel = new JPanel();
        panel.setMinimumSize(new Dimension(600,300));
        panel.setBackground(new Color(150,120,120));



        //add components to panel

        //panel.add(scrollPane);
        //scrollPane.setSize(300,200);

        searchableTxt = new JTextArea("Enter your text here",5,20);

        panel.add(searchableTxt, BorderLayout.WEST);
        searchableTxt.setMaximumSize(new Dimension(300,200));
        searchableTxt.setLineWrap(true);

        characterFind = new JTextArea("",1,2);
        panel.add(characterFind, BorderLayout.WEST);

        btnSearch = new JButton("Search");
        btnSearch.addActionListener(event -> {

            String searchString = characterFind.getText();
            String toSearch = searchableTxt.getText();
            int count = 0;
            int index = -1;
            do {
                index = toSearch.indexOf(searchString);
                if (index >= 0){
                    count++;
                    toSearch = toSearch.substring(index+1,toSearch.length());
                }
            }while (index >=0);

            /*
            //get char
            char c = characterFind.getText().toCharArray()[0];
            //search for char
            int cCount = 0;
            //count the letters
            String inputString = searchableTxt.getText();
            char[] inputArray = inputString.toCharArray();
            for(char ch : inputArray){
                if (ch == c){
                    cCount ++;
                }
            }*/
            JOptionPane.showMessageDialog(null,count);

        });

        panel.add(btnSearch, BorderLayout.EAST);
        add(panel);
        setVisible(true);

    }
    public static void main(String[] args){
        new Programme();
    }

}
