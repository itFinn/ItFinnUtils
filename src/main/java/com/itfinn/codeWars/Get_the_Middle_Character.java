package com.itfinn.codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-18 16:16
 *
 * Get the Middle Character
 *
 * You are going to be given a word. Your job is to return the middle character of the word.
 * 你会得到一个字。你的工作是返回单词的中间字符。
 * If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
 * 如果单词的长度为奇数，则返回中间字符。如果单词的长度是偶数，则返回中间2个字符。
 *
 * #Examples:
 * Kata.getMiddle("test") should return "es"
 * Kata.getMiddle("testing") should return "t"
 * Kata.getMiddle("middle") should return "dd"
 * Kata.getMiddle("A") should return "A"
 *
 * #Input
 * A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases).
 * 一个长度为0 <str <1000的单词（字符串）（在javascript中，由于测试用例中的错误，在某些测试用例中可能会略微超过1000）。
 * You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.
 * 您无需为此进行测试。这只是告诉您，您不必担心解决方案超时问题。
 *
 * #Output
 * The middle character(s) of the word represented as a string.
 * 单词的中间字符表示为字符串。
 *
 */
public class Get_the_Middle_Character {
    public static String getMiddle(String word) {
        //Code goes here!

        int wordLength = word.length();
        String str;
        int midNum;

        // != 0 奇数
        if (wordLength % 2 != 0) {
            if (wordLength == 1) {
                return word;
            }
            midNum = wordLength / 2;
            str = word.substring(midNum, midNum + 1);
        } else {
            midNum = wordLength / 2;
            str = word.substring(midNum - 1, midNum + 1);
        }
        return str;
    }

    public static void main(String[] args) {
        Print.print(getMiddle("sduifuoisadufoiu"));
        Print.print(getMiddle("testing"));
        Print.print(getMiddle("A"));
        Print.print(getMiddle("apples"));
    }
}
