package leetcode.string;

public class ReverseWordsInString3 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take Leetcode contest"));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");

        StringBuilder newSentence = new StringBuilder();

        // iterate through the words
        for (int i = 0; i < words.length; i++) {
            // iterate through the characters of the word
            for (int j = words[i].length() - 1; j >= 0 ; j--) {
                newSentence.append(words[i].charAt(j));
            }

            if (i != words.length - 1) {
                newSentence.append(" ");
            }
        }

        return newSentence.toString();
    }
}
