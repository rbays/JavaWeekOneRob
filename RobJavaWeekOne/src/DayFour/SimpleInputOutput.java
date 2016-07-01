package DayFour;

import java.io.*;
import java.util.Scanner;

/**
 * Created by student on 30-Jun-16.
 */
public class SimpleInputOutput {

    public static void main(String[] args){

        /*
        //Scanner
        Scanner inout = new Scanner(System.in);
        System.out.println("Please enter a string");

        String str = inout.nextLine();
        System.out.println("Using scanner: " + str);
        */

        /*
        //Buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String st = br.readLine();
            writeToFile(st,"newFile");

        }catch(IOException e){
            e.printStackTrace();
        }
        */

        SimpleInputOutput myInstance = new SimpleInputOutput();
        myInstance.readFromFile("newFile");

    }

    //using file Writer
    static void writeToFile(String str,String fileName){
        System.out.println(System.getProperty("user.dir"));
        try {
            FileWriter fw = new FileWriter(fileName + ".txt");

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.newLine();
            bw.write("Extra line hax!!!!lolololol");
            bw.close();
        }
        catch(IOException ex){
            System.out.println("Error writing to file: " + ex);
        }
    }


    void readFromFile(String fileName){
        System.out.println(getClass());
        Scanner fileReader = new Scanner(getClass().getResourceAsStream(fileName + ".txt"));
        while(fileReader.hasNextLine()){
            System.out.println(fileReader.nextLine());
        }
        fileReader.close();
    }
}
