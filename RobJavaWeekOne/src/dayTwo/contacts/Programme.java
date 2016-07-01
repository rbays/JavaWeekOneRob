package dayTwo.contacts;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.io.IOException;
import java.util.Scanner;


/**
 * Created by student on 28-Jun-16.
 */
public class Programme {

    static AddressBook Book = new AddressBook();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        boolean running = true;

        while (running) {
            try {
                int choice;
                do {
                    System.out.println("Welcome to BOOM Address Book");
                    System.out.println("1. add a new contact");
                    System.out.println("2. edit a contact");
                    System.out.println("3. sort contacts");
                    System.out.println("4. remove a contact");
                    System.out.println("5. exit");
                    System.out.println("6. check entry by index");
                    System.out.println("Choose an option");

                    choice = Integer.parseInt(scan.nextLine());

                } while (choice < 1 || choice > 6);

                switch (choice) {
                    case 1:
                        Contact newContact = getDetails();
                        Book.addContact(newContact);
                        System.out.println("current size: " + Book.getSize() + "/100");
                        break;
                    case 2:
                        editContact();
                        break;

                    case 3:
                        Book.sort();
                        break;
                    case 4:
                        removeContact();
                        Book.sort();    //if a non-ultimate entry is removed, the last entry would be overwritten by a new address if not sorted
                        System.out.println("current size: " + Book.getSize() + "/100");
                        break;
                    case 5:
                        running = false;
                        break;
                    case 6:
                        System.out.println("Enter index");
                        int index = Integer.parseInt(scan.nextLine());
                        Book.getDetails(index);
                        break;
                    default:
                        break;

                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private static Contact getDetails(){

        System.out.println("enter first name");
        String firstName = scan.nextLine();
        System.out.println("enter last name");
        String lastName = scan.nextLine();
        System.out.println("enter Street");
        String street = scan.nextLine();
        System.out.println("enter City");
        String city = scan.nextLine();
        System.out.println("enter Country");
        String country = scan.nextLine();
        System.out.println("enter Post Code");
        String postCode = scan.nextLine();
        System.out.println("enter Phone number");
        String phoneNumber = scan.nextLine();
        System.out.println("enter email");
        String email = scan.nextLine();
        return new Contact(new Person(firstName,lastName),new Address(street,city, country, postCode), phoneNumber, email);
    }
    private static void editContact(){
        Contact contact = searchBook(Book);
        changeDetails(contact);
        System.out.println(contact.getPerson().getFirstName());
    }
    private static Contact searchBook(AddressBook book) {

        Contact output = null;
        do {
            String searchTerm = "";
            System.out.println("search by:");
            System.out.println("1. First name");
            System.out.println("2. Last name");
            System.out.println("3. email");
            System.out.println("4. cancel");
            int searchByInt = Integer.parseInt(scan.nextLine());
            if (searchByInt<4 && searchByInt >=1) {
                System.out.println("search term:");
                searchTerm = scan.nextLine();
            }
            switch (searchByInt) {
                case 1:
                    for (int i = 0; i<100; i++){
                        if (book.getContacts()[i] != null) {
                            if (book.getContacts()[i].getPerson().getFirstName().contains(searchTerm)) {
                                output = book.getContacts()[i];
                                i = 100;
                            }
                        }
                    }
                    break;
                case 2:
                    for (Contact c : book.getContacts()) {
                        if (c != null) {
                            if (c.getPerson().getLastName().contains(searchTerm)) {
                                output = c;
                            }
                        }
                    }
                    break;
                case 3:
                    for (Contact c : book.getContacts()) {
                        if (c != null) {
                            if (c.getEmail().contains(searchTerm)) {
                                output = c;
                            }
                        }
                    }
                    break;
                case 4:
                    return null;
                default:
                    break;
            }
            if(output == null){
                System.out.println("no result found, try again");
            }
        } while (output == null);
        return output;
    }

    public static void changeDetails(Contact contact){
        System.out.println("What would you like to change?");
        System.out.println("1. Name");
        System.out.println("2. Address");
        System.out.println("3. Email");
        System.out.println("4. Phone number");
        System.out.println("5. Cancel");
        int choice = Integer.parseInt(scan.nextLine());

        switch (choice){
            case 1:
                Contact.changeName(contact);
                break;
            case 2:
                Contact.changeAddress(contact);
                break;
            case 3:
                Contact.changeEmail(contact);
                break;
            case 4:
                Contact.changePhone(contact);
                break;
            case 5:
                break;
            default:
                System.out.println("Input not recognised, returning to main menu");
                break;

        }
    }
    public static void removeContact(){
        Contact deadContact = searchBook(Book);
        Book.removeContact(deadContact);
    }



}
