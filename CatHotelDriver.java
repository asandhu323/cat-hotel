package ca;

import java.util.Random;

/**
 * Driver class for the CatHotel.
 * @author Sandhu,Avneet asandhu190@my.bcit.ca
 * @version 2021-04-01
 */
public class CatHotelDriver {
    
    /** Number for max age to set originally and for number of cats in hotel. */
    static final int MAX = 16;
    
    /** Remove cats over the age of. */
    static final int REMOVE = 10;

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        CatHotel purriott = new CatHotel("Purriott");
        Random random = new Random();
        
        for (int i = 0; i < MAX; i++) {
            int age = random.nextInt(MAX);
            Cat cat = new Cat("", age);
            purriott.addCat(cat);
        }
        
        purriott.printGuestList();
        
        System.out.println("\nThe number of guests currently at the Cat Hotel " 
                + purriott.getName() + " are: " + purriott.guestCount());
        
        purriott.removeOldGuests(REMOVE);
        
        System.out.println("\nThe number of guests after removing the cats"
                + " above the age of " + REMOVE + " are: "
                + purriott.guestCount());
        
        purriott.printGuestList();
        
        purriott.removeAllGuests();
        
        System.out.println("\nThe number of guests after removing all the cats"
                + " are: " + purriott.guestCount());
    }

}
