package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-25 16:29
 */
public class Solution {
    public static boolean validatePin(String pin) {
        // Your code here...

        if (pin.length() == 4 || pin.length() == 6) {
            for (int i = pin.length(); --i >= 0;) {
                if (!Character.isDigit(pin.charAt(i))) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Print.print(validatePin("1234"));
        Print.print(validatePin("0000"));
        Print.print(validatePin("1111"));
        Print.print(validatePin("123456"));
        Print.print(validatePin("098765"));
        Print.print(validatePin("000000"));
        Print.print(validatePin("090909"));
        Print.print(validatePin("a234"));
        Print.print(validatePin("a234"));
        Print.print(validatePin("1"));
        Print.print(validatePin("12"));
        Print.print(validatePin("123"));
        Print.print(validatePin("12345"));
        Print.print(validatePin("1234567"));
        Print.print(validatePin("-1234"));
        Print.print(validatePin("1.234"));
        Print.print(validatePin("00000000"));
    }

}
