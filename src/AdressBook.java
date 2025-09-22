// Hello My name is Gabriel 

import java.util.ArrayList;

public class AdressBook {

    private ArrayList<BuddyInfo> buddies;


    public AdressBook() {

        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){

        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){

        buddies.remove(buddy);

    }


    public static void main(String[] args) {

        System.out.println("Adress Book");

        BuddyInfo buddy = new BuddyInfo("tom","carleton",613);

        AdressBook adressBook = new AdressBook();

        adressBook.addBuddy(buddy);

        adressBook.removeBuddy(buddy);


    }

}
