package codeWars;

import com.itfinn.utils.base.Print;

import java.util.Arrays;

/**
 * @author xiefei
 * @date 2018-10-18 15:25
 *
 * Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.
 * For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
 *
 * your_order("is2 Thi1s T4est 3a")
 * [1] "Thi1s is2 3a T4est"
 */
public class Order {
    public static String order(String words) {
        // ...
        String[] strings = words.split(" ");
        Arrays.sort(strings, (String s1, String s2)
                -> s1.replaceAll("[a-zA-Z]", "").compareTo(s2.replaceAll("[a-zA-Z]", "")));
        String f = "";
        for (String s : strings) f += s + " ";
        return f.substring(0,f.length()-1);
    }

    public static void main(String[] args) {
        Print.print(order("4of Fo1r pe6ople g3ood th5e the2"));
    }
}