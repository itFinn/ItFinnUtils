package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-22 10:01
 */
public class Complementary_DNA {
    public static String makeComplement(String dna) {
        //Your code
        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'A':
                    chars[i] = 'T';
                    break;
                case 'T':
                    chars[i] = 'A';
                    break;
                case 'G':
                    chars[i] = 'C';
                    break;
                case 'C':
                    chars[i] = 'G';
                    break;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Print.print(makeComplement("AAAA")); // TTTT
        Print.print(makeComplement("ATTGC")); // TAACG
        Print.print(makeComplement("GTAT")); // CATA
        Print.print(makeComplement("ATTGC")); // TAACG
    }
}
