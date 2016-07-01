package dayThree;

import java.util.Random;

/**
 * Created by student on 29-Jun-16.
 */
public class HandlingError {

    public static void main(String[] args){
        int a = 0, b = 0, c = 0;
        Random r = new Random();
        int completed = 0;
        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            }catch (ArithmeticException e){
                continue;
            }
            completed ++;
            System.out.println("a: " + a);
        }
        System.out.println(completed + " lines ran");
    }
}
