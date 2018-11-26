package com.itfinn.codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiefei
 * @date 2018-10-25 16:44
 */
public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        String binaryStr = "";
        for (Integer i : binary) {
            binaryStr += String.valueOf(i);
        }
        return Integer.parseInt(binaryStr, 2);
    }

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
    }
}
