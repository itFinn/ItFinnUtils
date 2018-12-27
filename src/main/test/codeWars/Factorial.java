package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 *
 * In mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
 * For example: 5! = 5 * 4 * 3 * 2 * 1 = 120. By convention the value of 0! is 1.
 *
 * Write a function to calculate factorial for a given input. If input is below 0 or above 12 throw an exception of type
 * ArgumentOutOfRangeException (C#) or IllegalArgumentException (Java) or RangeException (PHP) or throw a RangeError (JavaScript).
 */
public class Factorial {
    public static int factorial(int n) {
        // Happy coding :-)
        if (n > 12 || n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return 1;
        }
        for (int i = n - 1; i >= 1; i--) {
            n *= i;
        }
        return n;
    }


    public static void main(String[] args) {
        Print.print(factorial(0)); //1
        Print.print(factorial(3)); //6
        Print.print(factorial(5)); //120
        Print.print(factorial(-1)); //120
        Print.print(factorial(123)); //120
    }
}
