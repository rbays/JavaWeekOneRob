package dayTwo.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import static dayTwo.example.PersonCreation.*;

/**
 * Created by student on 28-Jun-16.
 */
public class Programme {
    public static void main(String[] args){
        Collection<Person> people = new ArrayList<>();
        PersonCreation.setAlex();
        people.add(john);
        people.add(alex);
        for (Person person:people
             ) {System.out.println(person);

        }
    }

}
