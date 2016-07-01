package dayTwo.contacts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 28-Jun-16.
 */
public class Contact {
    private static Scanner scan = new Scanner(System.in);
    private Person person;
    private List<Address> addresses = new ArrayList<>();
    private String phoneNumber;
    private String email;

    public Person getPerson() {
        return person;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //add an address to a collection
    public void addAddress(Address address){
        addresses.add(address);
    }
    //remove an address from a collection based on index
    public void removeAddress(int index){
        addresses.remove(index);
    }

    public Address getAddressByIndex(int index){
        return addresses.get(index);
    }
    public int addressesCount(){
        return addresses.size();
    }

    public Contact(Person person, Address address, String phoneNumber, String email) {
        this.person = person;
        addresses.add(address);
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public static void changeName(Contact contact){
        System.out.println("Enter First name");
        String newFirstName = scan.nextLine();
        System.out.println("Enter Last name");
        String newLastName = scan.nextLine();
        contact.person.setFirstName(newFirstName);
        contact.person.setLastName(newLastName);
    }

    public static void changeEmail(Contact contact){
        System.out.println("Enter email address");
        String newEmail = scan.nextLine();
        contact.setEmail(newEmail);
    }
    public static void changePhone(Contact contact){
        System.out.println("Enter phone number");
        String newPhone = scan.nextLine();
        contact.setEmail(newPhone);
    }
    public static void changeAddress(Contact contact){
        System.out.println("Enter new address comma separated (street,city,country,post code");
        String longAddress = scan.nextLine();
        String[] addressArray = longAddress.split(",");
        contact.addAddress(new Address(addressArray[0],addressArray[1],addressArray[2],addressArray[3]));
    }
}
