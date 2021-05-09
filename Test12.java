package com.company.TaskDay10;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N");
        int n = scanner.nextInt();
        System.out.println("enter M");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = num;
                    num++;
                }
                if (i % 2 == 1) {
                    num = num + m;
                    for (int k = 0; k < m; k++) {
                        num--;
                        matrix[i][k] = num;
                    }
                    j = m;
                    num = num + m;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
