package com.itfinn.codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-22 10:26
 *
 * Square Every Digit
 *
 * Welcome. In this kata, you are asked to square every digit of a number.
 * For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.
 * Note: The function accepts an integer and returns an integer
 */
public class Square_Every_Digit {
    public static int squareDigits(int n) {
        // TODO Implement me
        char[] chars = String.valueOf(n).toCharArray();
        String square = "";

        for (int i = 0; i < chars.length; i++) {
            int tmp = (int) Math.pow(Integer.parseInt(String.valueOf(chars[i])), 2);
            square += String.valueOf(tmp);
        }
        return Integer.parseInt(square);
    }


    public static void main(String[] args) {
        Print.print(squareDigits(9119)); // 811181
    }
}
