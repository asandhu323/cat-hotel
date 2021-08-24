package ca;

/**
 * Cat class.
 * Creates a Cat object.
 * @author Sandhu,Avneet asandhu190@my.bcit.ca
 * @version 2021-04-01
 */
public class Cat {

    /** Name of the cat. */
    private final String name;
    
    /** Age of the cat. */
    private int age;
    
    /**
     * Constructs a Cat object by defining its name and age.
     * @param name
     *      Cat's name.
     * @param age
     *      Cat's age.
     */
    public Cat(String name, int age) {
        if (name.isBlank()) {
            this.name = "Cleo";
        } else {
            this.name = name;
        }
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    
    /**
     * Get cat's name.
     * @return
     *      Cat's name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Get cat's age.
     * @return
     *      Cat's age.
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Set cat's age.
     * @param age
     *      Age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Return description of cat.
     * @return 
     *      Cat's description.
     */
    public String toString() {
        return "Name:\t" + name + "\tAge:\t" + age;
    }
}
