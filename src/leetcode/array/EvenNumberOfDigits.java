package leetcode.array;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int even = 0;

        for (int i = 0; i < nums.length; i++) {
            if (countDigits(nums[i]) % 2 == 0) {
                even++;
            }
        }

        return even;
    }

    public static int countDigits(int num) {
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}
