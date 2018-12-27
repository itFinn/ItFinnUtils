package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-19 16:26
 *
 * A square of squares
 *
 * You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!
 * However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.
 * Task
 * Given an integral number, determine if it's a square number:
 * In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
 * The tests will always use some integral number, so don't worry about that in dynamic typed languages.
 *
 * Examples
 * is_square (-1) # => false
 * is_square   0 # => true
 * is_square   3 # => false
 * is_square   4 # => true
 * is_square  25 # => true
 * is_square  26 # => false
 */
public class Square {
    public static boolean isSquare(int n) {
        Double sqrt = Math.sqrt(n);
        Integer ir = sqrt.intValue() * sqrt.intValue();
        return ir != n ? false : true;

        // 最优方案
        // return Math.sqrt(n) % 1 == 0;
    }

    public static void main(String[] args) {
        Print.print(isSquare(0));
        Print.print(isSquare(3));
        Print.print(isSquare(4));
        Print.print(isSquare(25));
        Print.print(isSquare(26));
        Print.print(isSquare(83925460));






    }
}
