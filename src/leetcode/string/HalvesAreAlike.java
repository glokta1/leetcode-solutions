package leetcode.string;

public class HalvesAreAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("textbook"));
    }

    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();

        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2, s.length());

        int numVowelsA = 0;
        int numVowelsB = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                numVowelsA++;
            }

            if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u') {
                numVowelsB++;
            }
        }

        if (numVowelsA == numVowelsB) {
            return true;
        }

        return false;
    }
}
