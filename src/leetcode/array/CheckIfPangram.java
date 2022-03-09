package leetcode.array;

import java.util.Arrays;

public class CheckIfPangram {
    public static void main(String[] args) {
        checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
    }

    public static boolean checkIfPangram(String sentence) {
        int[] count = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            count[sentence.charAt(i) - 'a']++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                System.out.println("False");
                return false;
            }
        }

        return true;

    }
}
