package leetcode.string;

import java.util.HashMap;

public class FreqAlphabets {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
    }

    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) == '#') {
                char ch = (char) ('a' + ((s.charAt(i-1) - '0') + 10 * (s.charAt(i - 2) - '0'))-1);
                sb.append(ch);
                i = i - 2;
                continue;
            }

            char ch =  (char) ('a' + ((s.charAt(i) - '0') - 1));
            sb.append(ch);
        }

        return sb.reverse().toString();
    }
}
