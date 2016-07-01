package dayThree.FactoryPattern;

/**
 * Created by student on 29-Jun-16.
 */
public class Husky extends Dog implements Robotic {
    @Override
    public void speak() {
        System.out.println("HELLO");
    }

    @Override
    public Object trackObject() {
        return null;
    }

    @Override
    public void remoteControl() {

    }
}
