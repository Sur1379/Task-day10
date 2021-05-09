package com.company.TaskDay10;

import java.util.Random;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("enter N");
        int n = scanner.nextInt();
        System.out.println("enter M");
        int m = scanner.nextInt();
        System.out.println("choice 1 or 2 (rotate 90 or 180)");
        int num = scanner.nextInt();
        while (num != 1 && num != 2) {
            System.out.println("invalid choice press 1 or 2");
            num = scanner.nextInt();
        }
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        if (num == 1) {
            if (n == m) {
                int[][] matrix2 = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        matrix2[i][j] = matrix[j][m - 1 - i];
                    }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(matrix2[i][j] + " ");
                    }
                    System.out.println("");
                }
            } else {
                int[][] matrix2 = new int[m][n];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        matrix2[i][j] = matrix[j][m - 1 - i];
                    }
                }
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(matrix2[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }
        if (num == 2) {
            int[][] matrix2 = new int[n][m];
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < m; j++) {
                    matrix2[n - i - 1][j] = matrix[i][m - 1 - j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
