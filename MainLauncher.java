package com.package2;

import java.util.Scanner;

public class MainLauncher {

    public static void main(String[] args) {
        Umpire u = new Umpire();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            u.collectNumFromGuesser();
            u.compare();

            System.out.println("Wanna Play Again?? press 'y' to continue or press any key to quit the game");

            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                System.out.println("Have a nice day!! BYE!!");
                break;
            }
        }
        scanner.close();
    }
}
