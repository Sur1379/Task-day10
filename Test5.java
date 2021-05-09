package com.company.TaskDay10;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A");
        int a = scanner.nextInt();
        System.out.println("Enter B");
        int b = scanner.nextInt();
        for (int i = a; i <= b ; i++) {
            if ( i % 10 == i/1000 % 10 && i / 100 % 10 == i/10 % 10){
                System.out.print(i +" ");
            }
        }
    }
}
