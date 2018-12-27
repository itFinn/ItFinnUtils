package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-24 17:28
 *
 * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
 *
 * Examples input/output:
 *
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 */
public class XO {
    public static boolean getXO (String str) {

        // Good Luck!!
        str = str.toLowerCase();
        String[] strs = str.split("");
        int x = 0, o = 0;

        for (String s : strs) {
            switch (s) {
                case "x":
                    x++;
                    break;
                case "o":
                    o++;
                    break;
            }
        }
        return x == o || (x == 0 && o == 0) ? true : false;
    }


    public static void main(String[] args) {
        Print.print(getXO("xxxooo")); //true
        Print.print(getXO("xxxXooOo")); //true
        Print.print(getXO("xxx23424esdsfvxXXOOooo")); //false
        Print.print(getXO("xXxxoewrcoOoo")); //false
        Print.print(getXO("XxxxooO")); //false
        Print.print(getXO("zssddd")); //true
        Print.print(getXO("Xxxxertr34")); //false
    }
}
