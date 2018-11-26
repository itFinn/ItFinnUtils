package com.itfinn.codeWars;

import com.itfinn.utils.base.Print;

import java.util.Arrays;

/**
 * @author xiefei
 * @date 2018-10-18 17:04
 */
public class InvertValues {
    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i] * -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {-1, 2, -3, -4, 5};
        Print.print(Arrays.toString(invert(array)));
    }
}
