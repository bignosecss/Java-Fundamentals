# The Golden Rule of Equals (GRoE)

When you write `y = x`, you are telling the Java interpreter to **copy the bits from x into y.**

# Types

## 8 primitive types

- byte
- short
- int
- long
- float
- double
- boolean
- char

## Reference Types

Everything else, including arrays, are a `reference type`.

### Object instantiation

When we `instantiate` an Object using `new` (e.g. Dog, Walrus, Planet),.

1. Java first allocates a box for each instance variable of the class. A
2. nd fills them with a default value. 
3. The constructor then usually (but not always) fills every box with some other value.

### Reference Variable Declaration

When we `declare` a variable of any reference type (Walrus, Dog, Planet, array, etc.), **Java allocates a box of 64 bits, no matter what type of object.**

The 64 bit box contains not the data about the walrus, but instead the address of the Walrus in memory.
As an example:

``````Java
Walrus someWalrus;
someWalrus = new Walrus(1000, 8.3);
``````

1. The first line creates a box of 64 bits.

2. The second line creates a new Walrus.

   > The address is returned by the `new` operator. These bits are then copied into the `someWalrus` box according to the `GRoE`.

# Parameter Passing

> If the parameter is the instance of a class (e.g. Walrus someWalrus), then it represents an address of the memory space store the data of our instance. So if we make some changes to the class in our function, we change the memory space the `someWalrus` points to.

When pass parameters to a function, this is also simply copying the bits. In other words, the GRoE also applies to parameter passing. Copying the bits is usually called "pass by value". In Java, we **always** pass by value.

For example:
```Java
public static double average(double a, double b) {
    return (a + b) / 2;
}
```

Suppose we invoke this function as shown below:

```Java
public static void main(String[] args) {
    double x = 5.5;
    double y = 10.5;
    double avg = average(x, y);
}
```

After executing the first two lines of this function, the main method will have two boxes labeled `x` and `y` containing the values shown below:
![image](https://joshhug.gitbooks.io/hug61b/content/chap2/fig21/main_x_y.png)

When the function is invoked, the `average` function has its **own** scope with two new boxes labeled as `a` and `b` , and the bits are simply *copied* in. This copying of bits is what we refer to when we say "pass by value".
![image](https://joshhug.gitbooks.io/hug61b/content/chap2/fig21/average_a_b.png)

If the `average` function were to change `a`, then `x` in main would be unchanged, since the GRoE tells us that we'd simply be filling in the box labeled `a` with new bits.