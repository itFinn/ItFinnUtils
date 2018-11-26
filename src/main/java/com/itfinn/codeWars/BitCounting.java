package com.itfinn.codeWars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author xiefei
 *
 * Write a function that takes an integer as input,
 * and returns the number of bits that are equal to one in the binary representation of that number.
 * You can guarantee that input is non-negative.
 *
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */
public class BitCounting {
    public static int countBits(int n) {
        // Show me the code!
        return 0;
    }


    public class BitCountingTest {
        @Test
        public void testGame() {
            Assert.assertEquals(5, BitCounting.countBits(1234));
            Assert.assertEquals(1, BitCounting.countBits(4));
            Assert.assertEquals(3, BitCounting.countBits(7));
            Assert.assertEquals(2, BitCounting.countBits(9));
            Assert.assertEquals(2, BitCounting.countBits(10));
        }
    }
}
