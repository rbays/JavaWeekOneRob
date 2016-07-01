package dayTwo.example;

/**
 * Created by student on 28-Jun-16.
 */
public class PersonCreation {

    final static Person alex = new Person();
    final static Person john = new Person("Jon", "Snow");

    static void setAlex(){
        alex.setFirstName("Alex");
        alex.setLastName("Kennedy");
    }


}
