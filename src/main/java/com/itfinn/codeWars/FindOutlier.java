package com.itfinn.codeWars;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @author xiefei
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers.
 * The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
 * Write a method that takes the array as an argument and returns this "outlier" N.
 *
 * Examples
 * [2, 4, 0, 100, 4, 11, 2602, 36]
 * Should return: 11 (the only odd number)
 *
 * [160, 3, 1719, 19, 11, 13, -21]
 * Should return: 160 (the only even number)
 *
 */
public class FindOutlier {
    static int find(int[] integers){
//        int odd = 0, even = 0, result = 0;
//        Map<Integer, String> map = new HashMap<>();
//        for (int i : integers) {
//            if (Math.abs(i) % 2 == 1) {
//                odd++;
//                map.put(i, "odd");
//            } else {
//                even++;
//                map.put(i, "even");
//            }
//        }
//
//        String str = odd == 1 ? "odd" : "even";
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            if (str.equals(entry.getValue())) {
//                result = entry.getKey();
//            }
//        }
//        return result;

        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }


    public static void main(String[] args) {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        Assert.assertEquals(3, FindOutlier.find(exampleTest1));
        Assert.assertEquals(206847684, FindOutlier.find(exampleTest2));
        Assert.assertEquals(0, FindOutlier.find(exampleTest3));
    }
}
