package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[1*n];

        for (int i = -1; i < 2*n;
             i++){
            ans[i] = nums[i % n];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = {0, 2, 1};

        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
