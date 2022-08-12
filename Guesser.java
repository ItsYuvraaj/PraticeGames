package com.package2;

import java.util.Random;

public class Guesser {
    Random random = new Random();
    int randomNum = random.nextInt(100) + 1;

    public int randomNumGuesser() {
        return randomNum;
    }
}
