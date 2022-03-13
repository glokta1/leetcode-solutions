package leetcode.array;

import java.util.Arrays;

public class OddCells {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {
                {0, 1},
                {1, 1}
        };

    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] a = new int[m][n];
        int odd = 0;

        for (int[] row: indices) {
            // row increment
            for (int i = 0; i < n; i++) {
                a[row[0]][i]++;
            }

            // column increment
            for (int i = 0; i < m; i++) {
                a[i][row[1]]++;
            }

        }

        // check for odd
        for (int[] row :
                a) {
            for (int e :
                    row) {
                if (!(e % 2 == 0)) {
                    odd++;
                }
                }
        }

        return odd;
    }
}
