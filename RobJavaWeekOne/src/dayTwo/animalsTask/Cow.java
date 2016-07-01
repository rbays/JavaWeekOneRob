package dayTwo.animalsTask;

/**
 * Created by student on 28-Jun-16.
 */
public class Cow extends Mammal {

    public Cow(){
    }
    public Cow(String name, int life){
        setName(name);
        setLifeExpectancy(life);
    }

    @Override
    public void move(){
        System.out.println(name + " walked around the field");
    }

    public void eat(){
        System.out.println(name + " ate some grass");
    }
}




