package com.itfinn.codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 *
 * You are given an odd-length array of integers, in which all of them are the same, except for one single number.
 *
 * Complete the method which accepts such an array, and returns that single different number.
 *
 * The input array will always be valid! (odd-length >= 3)
 *
 * Examples
 * [1, 1, 2] ==> 2
 * [17, 17, 3, 17, 17, 17, 17] ==> 3
 */
public class Find_the_stray_number {
    static int stray(int[] numbers) {
        int numA;
        int numB = 0;

        for (int i = 0; i < numbers.length; i++) {
            numA = numbers[0];
            if (numA != numbers[i]) {
                numB = numbers[i];
            }

            if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) {
                numB = numbers[0];
            }
        }
        return numB;
    }

    public static void main(String[] args) {
        Print.print(stray(new int[]{1, 1, 2}));
        Print.print(stray(new int[]{6, 17, 17, 17, 17, 17, 17, 17}));
    }

}
