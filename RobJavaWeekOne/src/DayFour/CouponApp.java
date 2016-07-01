package DayFour;


import com.sun.xml.internal.fastinfoset.util.StringArray;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by student on 30-Jun-16.
 */
public class CouponApp {
    JFrame mainFrame;
    JPanel panel;
    JComboBox comboBox;
    JButton button;
    JTextField fileNameBox;

    public CouponApp(){
        //instantiate elements
        mainFrame = new JFrame("Coupon App");
        panel = new JPanel();
        fileNameBox = new JTextField("fileName.txt");

        comboBox = new JComboBox();
        String[] offers = readFile();
        for(String s : offers){
            comboBox.addItem(s);
        }
        button = new JButton("Save coupon");


        //set up main frame
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,300);
        mainFrame.setLayout(new GridLayout());
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);

        //add elements
        mainFrame.add(panel);
        panel.add(comboBox);
        panel.add(button);
        panel.add(fileNameBox);

        button.addActionListener(event ->{
            String fileName = fileNameBox.getText();
            String fileContent = comboBox.getSelectedItem().toString();
            try {
                FileWriter fw = new FileWriter(fileName);

                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(fileContent);
                bw.close();
                fw.close();
            }
            catch(IOException ex){
                System.out.println("Error writing to file: " + ex);
            }
        });


    }
    String[] readFile(){
        Scanner fileReader = new Scanner(getClass().getResourceAsStream("CouponOffers.txt"));
        int length = 0;
        while (fileReader.hasNextLine()){
            String lamb = (fileReader.nextLine());
            length ++;
        }
        fileReader.close();

        fileReader = new Scanner(getClass().getResourceAsStream("CouponOffers.txt"));
        String[] output = new String[length];


        int counter = 0;
        while (fileReader.hasNextLine()){
            output[counter] = (fileReader.nextLine());
            counter ++;
        }
        fileReader.close();
        return output;
    }

    public static void main(String[] args){



        new CouponApp();
    }


}
