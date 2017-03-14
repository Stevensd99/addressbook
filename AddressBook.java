import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<String> friends = new ArrayList<String>; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		numfriends = 0;
	    	for(Adressbook cc: friends){
			friends.add(cc)
		}
    }	
    public void addItem(String name){
	    friends.add(name)
	    
    }
}
