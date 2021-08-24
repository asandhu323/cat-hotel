package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * CatHotel.
 * Manage a cat hotel. Add and remove guests, as well as remove guests over a 
 * certain age.
 * @author Sandhu, Avneet asandhu190@my.bcit.ca
 * @version 2021-04-01
 */
public class CatHotel {

    /** List of guests. */
    private List<Cat> cats;
    
    /** Name of hotel. */
    private String hotelName;
    
    /**
     * Constructs a CatHotel object by defining hotel's name and instantiating
     * a Cat object guest list.
     * @param name
     *      name of hotel.
     */
    public CatHotel(String name) {
        cats = new ArrayList<Cat>();
        hotelName = name;
    }
    
    /**
     * Get the name of the hotel.
     * @return
     *      name of the hotel.
     */
    public String getName() {
        return hotelName;
    }
    
    /**
     * Add cat to the guest list.
     * @param cat
     *      Cat object to be added to CatHotel.
     */
    public void addCat(Cat cat) {
        cats.add(cat);
    }
    
    /**
     * Remove all cats from guest list.
     */
    public void removeAllGuests() {
        cats.clear();
    }
    
    /**
     * Returns number of cats currently at the hotel.
     * @return
     *      number of cats in arraylist.
     */
    public int guestCount() {
        return (cats.size());
    }
    
    /**
     * remove cats over a certain age.
     * @param maxAge
     *      cats above this age will be removed.
     */
    public void removeOldGuests(int maxAge) {
        Iterator<Cat> catIterator = cats.iterator();
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
            if (temp.getAge() > maxAge) {
                catIterator.remove();
            }
        }
    }
    
    /**
     * Prints all the cats currently staying at the hotel.
     */
    public void printGuestList() {
        System.out.println("The guests currently staying at the Cat Hotel "
                + hotelName + " are:");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
