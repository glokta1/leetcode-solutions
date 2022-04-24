package leetcode.string;

public class NumOfStringsAppearSubstrings {
    public static void main(String[] args) {

    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                count++;
            }
        }

        return count;
    }
}
