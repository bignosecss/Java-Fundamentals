# Class Methods
## a.k.a static methods
Static methods are actions that are taken by the class itself.

eg.The `Math` class provides a `sqrt` method. Because it's static, we can call 
it as follow:

`x = Math.sqrt(100);`

### Static Method
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }

### Invoke the static method
    Dog d = new Dog(15);
    Dog d2 = new Dog(100);
    Dog.maxDog(d, d2);

We invoke using the class name, since this method is a static method


# Instance Methods
## a.k.a non-static methods
Instance methods are actions that can be taken only by a specific instance of a class.

### Instance Method
    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;
        }
        return d2;
    }

### Invoke the instance method
    Dog d = new Dog(15);
    Dog d2 = new Dog(100);
    d.maxDog(d2);

We invoke the method using a specific instance variable.

# Static Variables

It is occasionally useful for classes to have static variables. These are properties inherent to the class itself, rather than the instance.

    public class Dog {
        public int weightInPounds;
        public static String binomen = "Canis familiaris";
        ...
    }

Static variables should be accessed using the name of the class rather than a specific instance, e.g. use `Dog.binomen`, not `d.binomen`.
