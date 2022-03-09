package leetcode.array;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        int smallerThanCurrent = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    smallerThanCurrent++;
                }
            }

            ans[i] = smallerThanCurrent;
            smallerThanCurrent = 0;
        }

        return ans;
    }
}

