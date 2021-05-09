package com.company.TaskDay10;

import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N for N*N matrix");
        int N = scanner.nextInt();
        String[][] matrix = new String[N][N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 1 && j % 2 == 0) {
                    matrix[i][j] = "X";
                } else if (i % 2 == 0 && j % 2 == 1) {
                    matrix[i][j] = "X";
                } else {
                    matrix[i][j] = "0";
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] +"  ");
            }
            System.out.println("");
        }
    }
}
