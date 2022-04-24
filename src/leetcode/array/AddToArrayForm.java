package leetcode.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int k = 34;
        addToArrayForm(num, k);
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr = new ArrayList<>();
        int numValue = 0;

        // convert num-array to num
        for (int i = 0; i < num.length; i++) {
            numValue += num[i] * Math.pow(10, num.length-1-i);
        }

        // add k to num
        numValue += k;


        return arr;
    }
}
