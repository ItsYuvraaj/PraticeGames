package com.package2;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    int pGuess;

    public int numGuessedByPlayer() {
        System.out.println("Please Guess the number between 1 to 100");

        while (true) {
            pGuess = scanner.nextInt();
            if (pGuess > 0 && pGuess < 101) {
                break;
            }
            System.out.println("Please enter the valid number between 1 to 100");
        }
        return pGuess;
    }

}
