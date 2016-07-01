package dayTwo.animalsTask;

/**
 * Created by student on 28-Jun-16.
 */
public abstract class Mammal extends Vertebrate {
    public Mammal(){}

    public void produceMilk(){
        System.out.println(name + " is producing milk, she's a girl!");
    }

    @Override
    public void reproduce(){
        System.out.println(name + " birthed live young");
    }
}
