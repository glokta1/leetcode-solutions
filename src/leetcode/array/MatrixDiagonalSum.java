package leetcode.array;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            if (n-1-i != i) {
                sum += mat[n-1-i][i];
            }
        }

        return sum;
    }
}
