package com.company.TaskDay10;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int inputNum = scanner.nextInt();
      int count = 0;
        for (int i = 1; i <= inputNum/2 ; i++) {
            if(inputNum % i == 0){
                count++;
            }
        }if (count == 2){
            System.out.println("The number is prime");
        }
        else {
            System.out.println("No prime");
        }
    }
}
