package com.itfinn.codeWars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author xiefei
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 *
 * For example:
 *  persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 *                       // and 4 has only one digit
 *  persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 *                        // 1*2*6 = 12, and finally 1*2 = 2
 *  persistence(4) == 0 // because 4 is already a one-digit number
 */
public class PersistentBugger {
    public static int persistence(long n) {
        // your code
        int digit = 0;
        int numLength = String.valueOf(n).length();
        if (numLength == 1) {
            return 0;
        } else {
            int num = String.valueOf(n).charAt(0);
            for (int i = 1; i < numLength; i++) {
                num *= String.valueOf(n).charAt(i);
            }
            digit++;
            if (String.valueOf(num).length() != 1) {

            }
        }


        return digit;
    }

    public int conver() {

        return 0;
    }


    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        Assert.assertEquals(3, PersistentBugger.persistence(39));
        Assert.assertEquals(0, PersistentBugger.persistence(4));
        Assert.assertEquals(2, PersistentBugger.persistence(25));
        Assert.assertEquals(4, PersistentBugger.persistence(999));
    }
}
