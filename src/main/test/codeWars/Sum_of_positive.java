package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-19 14:39
 *
 * Sum of positive
 * You get an array of numbers, return the sum of all of the positives ones.
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * Note: if there is nothing to sum, the sum is default to 0.
 */
public class Sum_of_positive {
    public static int sum(int[] arr){

        int sum = 0;
        if (arr != null && arr.length > 0) {
            for (int i : arr) {
                sum += i > 0 ? i : 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Print.print(sum(new int[]{1,2,3,4,5}));  //15
        Print.print(sum(new int[]{1,-2,3,4,5}));  //13
        Print.print(sum(new int[]{}));  //0
        Print.print(sum(new int[]{-1,-2,-3,-4,-5}));  //0
        Print.print(sum(new int[]{-1,2,3,4,-5}));  //9
    }
}
