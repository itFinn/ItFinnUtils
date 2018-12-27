package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-19 14:47
 *
 * String repeat
 * Write a function called repeatStr which repeats the given string string exactly n times.
 *
 * repeatStr(6, "I") // "IIIIII"
 * repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */
public class String_repeat {
    public static String repeatStr(final int repeat, final String string) {
        String str = "";

        if (string.isEmpty()) {
            return "";
        }
        for (int i = 0; i < repeat; i++) {
            str += string;
        }
        return str;
    }

    public static void main(String[] args) {
        Print.print(repeatStr(4, "a"));
        Print.print(repeatStr(3, "Hello"));
        Print.print(repeatStr(5, ""));
        Print.print(repeatStr(0, "kata"));
        Print.print(repeatStr(-10, "kata"));
    }
}
