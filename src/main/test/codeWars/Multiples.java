package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 *
 * Note: If the number is a multiple of both 3 and 5, only count it once.
 */
public class Multiples {
    public static int solution(int number) {
        //TODO: Code stuff here
        int result = 0;
        if (number == 3 || number == 5) {
            return number;
        }
        for (int i = 3; i < number; i++) {
            result += i % 3 == 0 || i % 5 == 0 ? i : 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Print.print(solution(10)); // 23
        Print.print(solution(15)); // 23
        Print.print(solution(20)); // 23
        Print.print(solution(21)); // 23
    }
}
