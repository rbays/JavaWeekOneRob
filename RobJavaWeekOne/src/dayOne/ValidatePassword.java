package dayOne;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



/**
 * Created by student on 27-Jun-16.
 */
public class ValidatePassword {
    JFrame mainFrame;
    JPanel panel;
    JButton btnValidate;
    JTextArea passwordTxt;

    boolean result;

    //constructor


    public ValidatePassword() {
        mainFrame = new JFrame("Password Validation");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,100);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setSize(400,100);

        //add component to panel
        passwordTxt = new JTextArea("",1,15);
        panel.add(passwordTxt, BorderLayout.WEST);

        btnValidate = new JButton("Validate");
        btnValidate.addActionListener(event -> {
            String password = passwordTxt.getText();
            passwordCheck(password,this);
            if (result){
                JOptionPane.showMessageDialog(null,"you met the requirements");
            }
            else{
                JOptionPane.showMessageDialog(null,"you did not meet the password requirements");
            }
        });

        panel.add(btnValidate, BorderLayout.EAST);
        mainFrame.add(panel);
        mainFrame.setVisible(true);

    }

    public static void main(String[] args){
        new ValidatePassword();
    }

    static void passwordCheck(String password, ValidatePassword val){
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])";
        val.result = password.matches(pattern);


        /* char[] letters = password.toCharArray();
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;
        boolean over8 = (letters.length >= 8);
        char[] specials = {'.', ',', '?', '!'}; //special characters

        for (char letter:letters){
            if (Character.isLowerCase(letter)){
                lower = true;
            }
            else if (Character.isUpperCase(letter)){
                upper = true;
            }
            else if (Character.isDigit(letter)){
                digit=true;
            }
            else {
                for (char spec : specials){
                    if (spec == letter){
                        special = true;
                    }
                }
            }
        }
        val.result = (upper && lower && digit && over8 && special);*/


    }
}
