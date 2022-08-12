package com.package2;

public class Umpire {
    int numFromGuesser;
    int numFromPlayer;

    public void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.randomNumGuesser();
    }

    void compare() {
        Player p = new Player();

        while (true) {
            numFromPlayer = p.numGuessedByPlayer();

            if (numFromGuesser == numFromPlayer) {
                System.out.println("Correct Guess, YOU WIN");
                break;
            }
            else if (numFromGuesser > numFromPlayer)
                System.out.println("The Number is Higher than you guessed");
            else
                System.out.println("The Number is Lower than you guessed");

        }
    }
}
