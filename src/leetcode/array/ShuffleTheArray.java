package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];

        int j = 0;

        for (int i = 0; i < n; i++) {
            // why can't we use i to fill in the resultant array?
            // Why do we need a new variable?

            // for i = n - 1, the last element of the array, below will execute
            ans[j++] = nums[i];

            // but this one won't because now i = n which is OUTSIDE the array
            ans[j++] = nums[i + n];
        }

        return ans;
    }
}
