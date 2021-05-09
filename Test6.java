package com.company.TaskDay10;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a three-letter word ");
        String word = scanner.next();
        String word1 = "";
        for (int i = 0; i < word.length(); i++) {
            if (i == 0) {
                if (word.charAt(i) < 91 ) {
                    word1 = word1 + (char) ((word.charAt(i) ));
                   continue;
                }
                if ((word.charAt(i)) > 96) {
                    word1 = word1 + (char) ((word.charAt(i) - 32));
                    continue;
                }
            }
            if ((word.charAt(i)) > 96) {
                word1 = word1 + (char) ((word.charAt(i)));
                continue;
            }
            if( (word.charAt(i)) < 91) {
                word1 = word1 + (char) ((word.charAt(i) + 32));
            }
        }
        System.out.println(word1);
    }
}

