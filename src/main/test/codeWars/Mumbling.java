package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-19 15:29
 *
 * Mumbling
 *
 * This time no story, no theory. The examples below show you how to write function accum:
 *
 * Examples:
 * Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
 * Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
 *
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 *
 * Note:
 * this kata was recently attributed to @mclean, which is false (see his comment). Gosts at Codewars or bad joke? // g964
 */
public class Mumbling {
    public static String accum(String s) {
        // your code
        StringBuffer str = new StringBuffer();
        String[] ss = s.split("");

        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int n = 0; n <= i; n++) {
                if (n == 0) {
                    str.append(ss[i].toUpperCase());
                } else {
                    str.append(ss[i].toLowerCase());
                }
            }
            if (i != length - 1) {
                str.append("-");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        //Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu
        Print.print(accum("ZpglnRxqenU"));
        //N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb
        Print.print(accum("NyffsGeyylB"));
        //M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu
        Print.print(accum("MjtkuBovqrU"));
        //E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm
        Print.print(accum("EvidjUnokmM"));
        //H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc
        Print.print(accum("HbideVbxncC"));
    }
}
