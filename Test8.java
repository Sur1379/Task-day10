package com.company.TaskDay10;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number of geometric progression");
        double firstNum = scanner.nextDouble();
        System.out.println("Input < q >");
        double q = scanner.nextDouble();
        System.out.println("Input < N >");
        int N = scanner.nextInt();
        double numN = 0;
        for (int i = 1; i < N; i++) {
            numN = firstNum * q;
            firstNum = numN;
        }
        double result = numN - (int) numN;
        result = result * 100;
        result = (int) result;
        numN = (int) numN + (double) result / 100;
        System.out.println(numN);
    }
}
