package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-25 16:04
 *
 * Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
 * Your task is to write a function maskify, which changes all but the last four characters into '#'.
 * Examples
 * Maskify.Maskify("4556364607935616"); // should return "############5616"
 * Maskify.Maskify("64607935616");      // should return "#######5616"
 * Maskify.Maskify("1");                // should return "1"
 * Maskify.Maskify("");                 // should return ""
 *
 * // "What was the name of your first pet?"
 * Maskify.Maskify("Skippy");                                   // should return "##ippy"
 * Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
 */
public class Maskify {
    public static String maskify(String str) {
        int strLength = str.length();
        if (strLength > 4) {
            int encrypt = strLength - 4;
            String encryptStr = "";
            for (int i = 1; i <= encrypt; i ++) {
                encryptStr += "#";
            }
            String result = encryptStr + str.substring(encrypt, strLength);
//        throw new UnsupportedOperationException("Unimplemented");
            return result;
        }
        return str;
    }


    public static void main(String[] args) {
        Print.print(maskify("4556364607935616"));
        Print.print(maskify(     "64607935616"));
        Print.print(maskify(               "1"));
        Print.print(maskify(                ""));
        Print.print(maskify("Skippy"));
        Print.print(maskify("Nananananananananananananananana Batman!"));
    }
}
