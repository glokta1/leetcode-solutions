package leetcode.array;

import java.util.Scanner;

public class Pasta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] A = new int[N];
        int[] B = new int[M];

        for (int i = 0; i < N; i++) {
            int input = scanner.nextInt();
            A[i] = input;
        }

        for (int i = 0; i < M; i++) {
            int input = scanner.nextInt();
            B[i] = input;
        }

        boolean found = false;
        boolean success = true;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (A[j] == B[i]) {
                    A[j] = 0;
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No");
                success = false;
                break;
            }

            found = false;

        }

        if (success) {
            System.out.println("Yes");
        }



    }
}
