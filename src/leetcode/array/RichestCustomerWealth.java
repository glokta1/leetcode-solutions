package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] accounts = {{1,2,3}, {1,2,3}};

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int richest = 0;
        int totalWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                // sum money of ith customer in all j banks
                totalWealth += accounts[i][j];
            }

            if (totalWealth > richest) {
                richest = totalWealth;
            }

            // reset counter
            totalWealth = 0;
        }

        return richest;
    }
}
