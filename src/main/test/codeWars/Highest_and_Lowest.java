package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-19 17:24
 */
public class Highest_and_Lowest {

    public static String HighAndLow(String numbers) {
        // Code here or
        String[] strs = numbers.split(" ");

        int min = Integer.valueOf(strs[0]), max = Integer.valueOf(strs[0]);

        for (int i = 0; i < strs.length; i++) {
            int tmp = Integer.valueOf(strs[i]);
            max = tmp > max ? tmp : max;
            min = tmp < min ? tmp : min;
        }
        return max + " " + min;
    }

    public static void main(String[] args) {
        Print.print(HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
