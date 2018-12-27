package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-25 17:34
 */
public class Triangular {
    public static int triangular(int n) {
        if (n > 0) {
            int sum = n;
            for (int i = 1; i < n; i++) {
                sum += i;
            }
            return sum;
        }
        return 0;
    }

    public static void main(String[] args) {
        Print.print(triangular(2)); // 3
        Print.print(triangular(3)); // 6
        Print.print(triangular(4)); // 10
        Print.print(triangular(100)); // 10
        Print.print(triangular(-10)); // 0

    }
}
