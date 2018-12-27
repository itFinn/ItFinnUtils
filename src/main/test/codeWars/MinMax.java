package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-25 17:43
 */
public class MinMax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
        int min = arr[0];
        int max = arr[0];
        int[] res = new int[2];

        for (int i = 0; i < arr.length; i++) {
            min = min < arr[i] ? min : arr[i];
            max = max > arr[i] ? max : arr[i];
        }
        res[0] = min;
        res[1] = max;

        return res;
    }

    public static void main(String[] args) {
        Print.print(minMax(new int[]{1,2,3,4,5}));
        Print.print(minMax(new int[]{2334454,5}));
        Print.print(minMax(new int[]{1}));
    }
}
