package dayTwo.animalsTask;

/**
 * Created by student on 28-Jun-16.
 */
public class Bird extends Vertebrate {
    public Bird(){}
    public Bird (String name, int life){
        setLifeExpectancy(life);
        setName(name);
    }

    @Override
    public void reproduce(){
        System.out.println(name + " laid an egg");
    }
    public void move(){
        System.out.println(name + " flew around the room");
    }
    public void eat(){
        System.out.println(name + " ate a worm");
    }
}
