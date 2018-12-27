package codeWars;

import com.itfinn.utils.base.Print;

import java.util.Arrays;

/**
 * @author xiefei
 * @date 2018-10-22 11:12
 *
 * Descending Order
 *
 * Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order.
 * Essentially, rearrange the digits to create the highest possible number.
 *
 * Examples:
 * Input: 21445 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 1254859723 Output: 9875543221
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code
        char[] chars = String.valueOf(num).toCharArray();
        int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = Integer.parseInt(String.valueOf(chars[i]));
        }
        Arrays.sort(ints);
        String numStr = "";
        for (int i = ints.length - 1; i >= 0; i--) {
            numStr += String.valueOf(ints[i]);
        }

        return Integer.valueOf(numStr).intValue();
    }

    public static void main(String[] args) {
        Print.print(sortDesc(15));  // 51
        Print.print(sortDesc(123456789));  // 987654321
        Print.print(sortDesc(0)); //0
        Print.print(sortDesc(1254859723)); // 9875543221
        Print.print(sortDesc(145263)); // 654321
        Print.print(sortDesc(21445)); //54421
    }


}
