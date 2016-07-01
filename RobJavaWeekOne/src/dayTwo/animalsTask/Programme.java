package dayTwo.animalsTask;

import java.util.ArrayList;

/**
 * Created by student on 28-Jun-16.
 */
public abstract class Programme {

    public static void main(String[] args){
        Cow myCow = new Cow("Daisy", 40);
        Bird myBird = new Bird("Falco", 12);
        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(myCow);
        myAnimals.add(myBird);

        for(Animal a :myAnimals){
            a.move();
            a.eat();
            a.reproduce();
        }
    }
}
