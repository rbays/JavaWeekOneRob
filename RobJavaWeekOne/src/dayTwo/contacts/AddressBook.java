package dayTwo.contacts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 28-Jun-16.
 */
public class AddressBook {
    private Contact[] contacts = new Contact[100];
    private int counter = 0;


    public void addContact(Contact newContact){
        if(counter<100){
        contacts[counter] = newContact;
        counter ++;
        }
        else{

        }
    }
    public Contact[] getContacts(){
        return contacts;
    }
    public void removeContact(Contact contact){
        for (int i = 0; i<100; i++){
            if (this.contacts[i] == contact){
                contacts[i] = null;
                counter -=1;
            }
        }
    }

    public int getSize(){
        return counter;
    }

    public void sort(){
        //sort algorithm
        boolean allOrdered;
        do {
            allOrdered = true;
            for (int i = 0; i < 99; i++) {
                if (contacts[i] != null && contacts[i+1] != null) {
                    String lastName1 = contacts[i].getPerson().getLastName().toLowerCase();
                    String lastName2 = contacts[i + 1].getPerson().getLastName().toLowerCase();
                    char[] lastName1Array = lastName1.toCharArray();
                    char[] lastName2Array = lastName2.toCharArray();
                    boolean compared = false;
                    int j = 0;
                    while (compared == false) {
                        if (lastName1Array[j] == lastName2Array[j]) {
                            if (j + 1 == lastName1Array.length || j + 1 == lastName2Array.length) {
                                compared = true;
                            }
                            j++;
                            continue;
                        }
                        if (lastName1Array[j] < lastName2Array[j]) {
                            compared = true;
                        } else {
                            Contact tempContact = contacts[i];
                            contacts[i] = contacts[i + 1];
                            contacts[i + 1] = tempContact;
                            compared = true;
                            allOrdered = false;
                        }
                    }
                }
                else if (contacts[i+1] == null){
                    continue;
                }
                else {
                    Contact tempContact = contacts[i];
                    contacts[i] = contacts[i + 1];
                    contacts[i + 1] = tempContact;
                    allOrdered = false;
                }
            }
        }while (allOrdered == false);
    }

    public void getDetails(int index){
        System.out.println("First Name: " + contacts[index].getPerson().getFirstName());
        System.out.println("Last Name: " + contacts[index].getPerson().getLastName());
        System.out.println("Email: " + contacts[index].getEmail());
        System.out.println("Phone: " + contacts[index].getPhoneNumber());
        for(int i = 0; i < contacts[index].addressesCount();i++){
            Address currentAddress = contacts[index].getAddressByIndex(i);
            System.out.println();
            System.out.println(currentAddress.getStreet());
            System.out.println(currentAddress.getCity());
            System.out.println(currentAddress.getCountry());
            System.out.println(currentAddress.getPostCode());
            System.out.println();
        }
    }
}
