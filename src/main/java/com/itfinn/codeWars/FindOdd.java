package com.itfinn.codeWars;

import com.itfinn.utils.base.Print;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiefei
 */
public class FindOdd {
    public static int findIt(int[] a) {

        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                result = entry.getKey();
            }
        }
        return a.length == 1 ? a[0] : result;

    }


    public static void main(String[] args) {
        Print.print(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        Print.print(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        Print.print(findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        Print.print(findIt(new int[]{10}));
        Print.print(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        Print.print(findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }

}
