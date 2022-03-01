package leetcode.array;

import java.util.*;

public class KidsWithGreatestNumberOfCandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] candies = {2, 3, 5, 1, 3};
        kidsWithCandies(candies, 3);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;

        List<Boolean> result = new ArrayList<>();
        // instantiate result with false values
        Collections.fill(result, true);

        // find max number of candies before giving extras
        int greatest = 0;
        for (int i = 0; i < n; i++) {
            if (candies[i] > greatest) {
                greatest = candies[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= greatest) {
                result.add(i, true);
            }
        }

        return result;
    }

}
