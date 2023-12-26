package DogClass;

/**
 * Variables and Methods of a class are called Memebers of a class.
 */
public class Dog {
    /**
     * (instance variables) or (non-static variables).
     * must be declared inside class.
     */
    public int weightInPounds;

    /**
     * Constructor with signature ( public Dog(int n) ) will be invoked
     * anytime that we try to create a Dog using the new keyword and
     * a single integer parameter.
     * @param w
     */
    public Dog(int w) {
        weightInPounds = w;
    }

    /**
     * Method that we created with no STATIC keyword are called
     *  (instance methods) or (non-static methods).
     */
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }
    }
}
