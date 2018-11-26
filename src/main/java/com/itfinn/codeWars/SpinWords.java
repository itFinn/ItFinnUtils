package com.itfinn.codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 */
public class SpinWords {
    public static String spinWords(String sentence) {
        //TODO: Code stuff here
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                StringBuffer sb = new StringBuffer().append(words[i]).reverse();
                words[i] = sb.toString();
            }
        }
        return String.join(" ", words);
    }


    public static void main(String[] args) {
        Print.print(spinWords("Welcome"));
        Print.print(spinWords("Hey fellow warriors"));
        Print.print(spinWords("This is a test"));
        Print.print(spinWords("This is another test"));
        Print.print(spinWords("Write a function that takes in a string of one or more words and returns the same string"));
    }
}
