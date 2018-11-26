package com.itfinn.codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-18 17:21
 *
 *
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 */
public class BraceChecker {
    public static boolean isValid(String braces) {
        // Add code here
        Boolean isOk = false;

        if (braces.length() % 2 != 0) {
            return false;
        }

        String[] strs = braces.split("");
        int num = strs.length;
        for (int i = 0; i < num / 2; i++) {
            if (("{".equals(strs[i]) && "}".equals(strs[num - i - 1])) ||
                    ("[".equals(strs[i]) && "]".equals(strs[num - i - 1])) ||
                    ("(".equals(strs[i]) && ")".equals(strs[num - i - 1]))) {
                isOk = true;
            } else {
                isOk = false;
                break;
            }
        }

        if (!isOk) {
            for (int i = 0; i <= num / 2; i++) {
                if (("{".equals(strs[i]) && "}".equals(strs[i + 1])) ||
                        ("[".equals(strs[i]) && "]".equals(strs[i + 1])) ||
                        ("(".equals(strs[i]) && ")".equals(strs[i + 1]))) {
                    isOk = true;
                } else {
                    isOk = false;
                    break;
                }
                i++;
            }
        }
        return isOk;
    }

    public static void main(String[] args) {
        Print.print(isValid("(({{[]]]}}))"));


    }

}