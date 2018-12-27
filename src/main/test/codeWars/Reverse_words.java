package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-25 17:59
 *
 * Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
 *
 * Examples
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 */
public class Reverse_words {
    public static String reverseWords(final String original) {
        // Have at it
        String[] array = original.split(" ");

        if(array.length == 0)
            return original;

        int i = 0;
        for(String string : array){
            array[i] = new StringBuilder(string).reverse().toString();
            i++;
        }

        return String.join(" ",array);
    }

    public static void main(String[] args) {
        Print.print(reverseWords("The quick brown fox jumps over the lazy dog.")); // ehT kciuq nworb xof spmuj revo eht yzal .god
        Print.print(reverseWords("apple")); // elppa
        Print.print(reverseWords("a b c d")); // a b c d
        Print.print(reverseWords("double  spaced  words")); // elbuod  decaps  sdrow
        Print.print(reverseWords("] [")); // elbuod  decaps  sdrow
    }
}
