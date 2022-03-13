package leetcode.array;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        System.out.println(Arrays.deepToString(image));
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int rows = n;
        int cols = n;

        int temp;

        // flipping horizontally
        for (int i = 0; i < (cols+1)/2; i++) {
            for (int j = 0; j < rows; j++) {
                // swap if corresponding element is different
                if (image[j][i] != image[j][n-1-i]) {
                    temp = image[j][i];
                    image[j][i] = image[j][n-1-i] ^ 1;
                    image[j][n-1-i] = temp ^ 1;
                }

                // invert
            }
        }

//        // invert
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (image[i][j] == 0) {
//                    image[i][j] = 1;
//                } else {
//                    image[i][j] = 0;
//                }
//            }
//        }

        return image;
    }
}
