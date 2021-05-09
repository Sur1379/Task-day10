package com.company.TaskDay10;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N");
        int n = scanner.nextInt();
        System.out.println("enter M");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int num = 0;
        int count = 0;
        while (count != n + m - 2) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i + j == count) {
                        matrix[i][j] = num;
                        num++;
                    }
                }
            }
            count++;
        }
        matrix[n - 1][m - 1] = num;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}