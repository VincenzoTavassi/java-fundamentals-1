package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Inserisci un numero da 1 a 1000");
        Scanner Scanner = new Scanner(System.in);
        int userNumber = Scanner.nextInt();
        while (userNumber < 1 || userNumber > 1000) {
            System.out.println("Il numero inserito deve essere maggiore di zero e minore di 1000");
            userNumber = Scanner.nextInt();
        }

        for (int i = 1; i < userNumber; i++) {
            if (i % 5 == 0 && i % 3 == 0) System.out.println("FizzBuzz");
             else if (i % 3 == 0) System.out.println("Fizz");
             else if(i % 5 == 0) System.out.println("Buzz");
             else System.out.println(i);
        }

    }
}
