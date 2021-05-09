package com.company.TaskDay10;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N");
        int N = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < N ; i++) {
            result = result * 2;
        }
        System.out.println(result);
    }
}
