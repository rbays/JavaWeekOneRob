package dayTwo.example;

/**
 * Created by student on 28-Jun-16.
 */
public class Person {

    //fields
    private String firstName;
    private String lastName;
    private int age;
    private boolean female;

    //properties
    public void setFirstName(String fn){ this.firstName = fn;}
    public String getFirstName(){ return this.firstName;}
    public void setLastName(String ln){ this.lastName = ln;}
    public String getLastName(){ return this.lastName;}
    public void setAge(int age){this.age = age;}
    public int getAge(){ return this.age;}
    public boolean isFemale() {return female;}
    public void setFemale(boolean female) {this.female = female;}

    //constructors
    public Person(){}
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return(firstName + " " + lastName);
    }

    //methods
    public String talk(){return null;}
    public void walk(){}

    //events


}
