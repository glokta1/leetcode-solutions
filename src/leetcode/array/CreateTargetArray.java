package leetcode.array;

import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(ans));

            if (ans[index[i]] == 0) {
                ans[index[i]] = nums[i];
                continue;
            }

            // shifting all elements to the right of i by 1 place
            for (int j = ans.length-1; j > i; j--) {
                ans[j] = ans[j-1];
            }

            // inserting the required element in the now freed up space
            ans[index[i]] = nums[i];
        }

        return ans;
    }
}
