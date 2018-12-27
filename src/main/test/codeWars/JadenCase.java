package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-19 16:48
 */
public class JadenCase {
    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
//        String s = phrase.replaceAll(" [a-z]", " [A-Z]");

        if (phrase == null || phrase.isEmpty()) return null;

        StringBuffer sb = new StringBuffer(phrase);
        sb.replace(0, 1, String.valueOf(phrase.charAt(0)).toUpperCase());

        for (int i = 0; i < phrase.length(); i++) {

            if (" ".equals(String.valueOf(phrase.charAt(i)))) {
                sb.replace(i + 1, i + 2, String.valueOf(phrase.charAt(i + 1)).toUpperCase());
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Print.print(toJadenCase("most trees are blue"));
        Print.print(toJadenCase(null));
        Print.print(toJadenCase(""));
        Print.print(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }


}
