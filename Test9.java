package com.company.TaskDay10;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int inputNum = scanner.nextInt();
        System.out.print("120 = ");
        for (int i = 2; i <= inputNum; i++) {
            while (inputNum % i == 0) {
                System.out.print(i);
                if (inputNum != i) {
                    System.out.print(" * ");
                }
                inputNum = inputNum / i;
            }
        }
    }
}
