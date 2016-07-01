package dayThree.FactoryPattern;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

/**
 * Created by student on 29-Jun-16.
 */
public class HandlingInteger {


    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");

        while (true){
            int yourNum;
            try {
                yourNum = Integer.parseInt(value.nextLine());
                if(yourNum<1 || yourNum>10){throw new MyException();}



            }catch(NumberFormatException e){
                System.out.println("not a number: try again");
                continue;
            }catch(MyException e){
                System.out.println("Number not between 1 and 10: try again");
                continue;
            }
            System.out.println("your number is valid, it is " + yourNum);
            break;
        }
    }
}

class MyException extends Exception{}
