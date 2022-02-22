package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = {0, 2, 1, 5, 3, 4};

        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] sumArray = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            sumArray[i] = sum;
        }

        return sumArray;
    }
}
