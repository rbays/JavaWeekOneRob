package dayThree;

/**
 * Created by student on 29-Jun-16.
 */
public class ThreadDemo {
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        new Thread2();

        System.out.println(t);
        try{
            for(int i = 10;i>0;i--) {
            System.out.println("Main Thread " + i);
            Thread.sleep(250);
        }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread terminated");
    }
}


class Thread2 implements Runnable {
    Thread t;
    Thread2(){
        t = new Thread(this,"SecondThread");
        System.out.println("Another thread" + t);
        t.start();
    }


    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Another Thread " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println("Second thread interrupted");
        }
        System.out.println("Second thread terminated");
    }
}