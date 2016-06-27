package dayOne;

import java.util.Scanner;

/**
 * Created by student on 27-Jun-16.
 */
public class BinaryProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String binary = input.nextLine();
        int total = conversion(binary);

        System.out.println(total);
    }

    public static int conversion(String binary){

        int length = binary.length();
        int total = 0;          //value to be output ta the end as an int
        int digitValue = 1;     //value of current binary digit

        for (int i = length-1; i >= 0; i--){
            if (binary.charAt(i) == '1'){
                total += digitValue;
            }
            digitValue = digitValue * 2;

        }
        return (total);
    }
}
