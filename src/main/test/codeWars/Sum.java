package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-24 17:38
 * Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. If the two numbers are equal return a or b.
 * Note: a and b are not ordered!
 * Examples
 * GetSum(1, 0) == 1   // 1 + 0 = 1
 * GetSum(1, 2) == 3   // 1 + 2 = 3
 * GetSum(0, 1) == 1   // 0 + 1 = 1
 * GetSum(1, 1) == 1   // 1 Since both are same
 * GetSum(-1, 0) == -1 // -1 + 0 = -1
 * GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2
 */
public class Sum {
    public static int GetSum(int a, int b) {
        //Good luck!
        int sum = 0;

        for (int i = a < b ? a : b; i <= (b < a ? a : b); i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Print.print(GetSum(0, -1)); // -1
        Print.print(GetSum(0, 1)); // 1
        Print.print(GetSum(1, 2)); // 3
        Print.print(GetSum(0, 1)); // 1
        Print.print(GetSum(-5, 10)); //
    }
}
