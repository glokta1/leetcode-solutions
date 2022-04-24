package leetcode.string;

public class ArrayStringsAreEqual {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }


    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String ch :
                word1) {
            sb1.append(ch);
        }

        for (String ch : word2) {
            sb2.append(ch);
        }

        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }

        return false;
    }
}
