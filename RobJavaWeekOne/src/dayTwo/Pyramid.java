package dayTwo;

import java.util.Scanner;

/**
 * Created by student on 28-Jun-16.
 */
public class Pyramid {



    public static void main(String[] args){

        int height = setheight();


        buildPyramid(height);
    }

    static int setheight(){
        System.out.println("Please enter how many levels you would like");
        Scanner input = new Scanner(System.in);

        return input.nextInt();
    }

    static void buildPyramid(int lines){
        int heightLength = Integer.toString(lines).length();    //length in digits of the last line

        for (int i = 1, blanks = (lines-1)*heightLength; i<= lines;i++, blanks -= heightLength){

            int numLength = Integer.toString(i).length();
            String lineOut = ("");
            for(int j = blanks;j>0;j--) {
                lineOut += " ";
            }
            int spaces = heightLength * 2 - numLength;
            for (int j = i; j>0; j--){
                lineOut += i;
                for (int k = spaces;k>0;k--){
                    lineOut += " ";
                }
            }
            System.out.println(lineOut);
        }
    }
}
