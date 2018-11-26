package com.itfinn.codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-25 09:52
 *
 * Shortest Word
 * Simple, given a string of words, return the length of the shortest word(s).
 * String will never be empty and you do not need to account for different data types.
 */
public class Shortest_Word {
    public static int findShort(String s) {
        String[] strs = s.split(" ");
        int shortest = s.length();
        for (String str : strs) {
            shortest = str.length() < shortest ? str.length() : shortest;
        }
        return shortest;
    }

    public static void main(String[] args) {
        Print.print(findShort("bitcoin take over the world maybe who knows perhaps")); // 3
        Print.print(findShort("turns out random test cases or easier than writing out basic ones")); // 2
    }
}
