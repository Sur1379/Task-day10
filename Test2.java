package com.company.TaskDay10;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input minutes");
        int inputMinutes = scanner.nextInt();
        int hour = 0;
        int minute = 0;
        if (inputMinutes % 60 > 0){
            minute = inputMinutes % 60;
        }
        hour = (inputMinutes - minute) /60;
        while (hour > 23){
            hour = hour - 24;
        }
        System.out.println(hour +" " + minute);
    }
}
