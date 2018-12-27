package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 *
 * Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.
 *
 * a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.
 *
 * The four operators are "add", "subtract", "divide", "multiply".
 *
 * A few examples:
 *
 * arithmetic(5, 2, "add")      => returns 7
 * arithmetic(5, 2, "subtract") => returns 3
 * arithmetic(5, 2, "multiply") => returns 10
 * arithmetic(5, 2, "divide")   => returns 2.5
 * ArithmeticFunction.arithmetic(5, 2, "add")      => returns 7
 * ArithmeticFunction.arithmetic(5, 2, "subtract") => returns 3
 * ArithmeticFunction.arithmetic(5, 2, "multiply") => returns 10
 * ArithmeticFunction.arithmetic(5, 2, "divide")   => returns 2
 */
public class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        // your code here
        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                return a / b;
        }
        return a;
    }


    public static void main(String[] args) {
        Print.print(arithmetic(1, 2, "add")); //3
        Print.print(arithmetic(8, 2, "subtract")); //6
        Print.print(arithmetic(5, 2, "multiply")); //10
        Print.print(arithmetic(8, 2, "divide")); //4
    }
}
