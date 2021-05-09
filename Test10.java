package com.company.TaskDay10;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input N");
        int n = scanner.nextInt();
        System.out.println("input M");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int i = 0;
        for (int j = 0; j < n; j++) {
            matrix[i][j] = i * j;
            System.out.print(matrix[i][j] + "   ");
            if (j == n - 1 && i != m - 1 ) {
                System.out.println();
                j = -1;
                i++;
            }
        }
    }
}

