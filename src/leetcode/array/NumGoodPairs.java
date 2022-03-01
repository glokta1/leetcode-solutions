package leetcode.array;

import java.util.Scanner;

public class NumGoodPairs {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        System.out.println(numIdenticalPairs(nums));

    }

    public static int numIdenticalPairs(int[] nums) {
        int identical = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == nums[i])  {
                    identical++;
                }
            }
        }

        return identical;
    }
}
