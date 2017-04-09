import java.io.*;
import java.util.Scanner;

public class AddressBook {

       private Contact[] friends; // An array of Contacts - each stores info for one friend
       private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
        friends = new Contact[10];
        numfriends = 0;
    }
    public int numContacts(){
        return numfriends;
    }
    public int haveContact(String s){
        for(int i = 0;i<numfriends-1;i++){
            if(friends[i].getName().equals(s)){
                return i;
              }
            else{
                return -1;
              }
        }
        return -1; 
    }
    public int deleteContact(String s){
        int pos = haveContact(s);
        friends[pos] = friends[friends.length-1];
        numfriends --;
        return haveContact(s);
        
    }
    public int addContact(Contact addedcontact){
        friends[numfriends] = addedcontact;
        numfriends ++;
        return numfriends;
    }
    public void printContacts(){
        for(int i = 0; i<numfriends; i ++){
                System.out.println(friends[i]);
            }
    }
    public static void main(String args[]){
        System.out.println("Hi");
        Scanner s = new Scanner(System.in);
        System.out.println("You can delete a contact (1), add a contact(2), print the contacts(3),see if your list contains a contact(4), or break(0).\n" + " What would you like to do?");
        int choice = 10;
        AddressBook book = new AddressBook();
        while(choice != 0){
            choice = s.nextInt();
            if(choice == 2){
            System.out.println("Imput name:");
            String name = s.next();
            System.out.println("Imput age: ");
            int age = s.nextInt();
            System.out.println("Imput phone number Ex:5135183026");
            int num = s.nextInt();
            System.out.println("Imput birthday date as month: ");
            int month = s.nextInt();
            System.out.println("Input Birthday date year: ");
            int year = s.nextInt();
            Contact c = new Contact(name, age, num, month, year);
            book.addContact(c);
        }
            if(choice == 1){
            System.out.println("What would you like to delete? ");
            String deleted = s.next();
            book.deleteContact(deleted);
        }
        if(choice == 3){
            book.printContacts();
        }
        if(choice == 4){
            String isIn = s.next();
          }      
        }
    }
    }

