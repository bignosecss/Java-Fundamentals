/**
 * The Fibonacci class provides aa method for calculating the nth Fibonacci number.
 * Fibonacci numbers are a series of numbers in which each number is the sum of the two preceding ones.
 */
public class Fibonacci {

    /**
     * Calculating the nth Fibonacci number recursively.
     * 
     * @param n The position of the Fibonacci number to be calculated.
     * @return The nth Fibonacci number.
     */
    public static int fib(int n) {
        // Base case: Fibonacci numbers for positions 1 and 2 are 0 and 1, respectively.
        if ((n <= 1)) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(fib(n));
    }
}