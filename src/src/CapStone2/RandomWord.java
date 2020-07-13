package CapStone2;

import java.util.Random;

public class RandomWord {
    private static final Random RANDOM = new Random();

    public RandomWord() {
    }

    public static String nextWordToFind() {
        return Words.WORDS[RANDOM.nextInt(Words.WORDS.length)];


    }

    public static Random getRANDOM() {
        return RANDOM;
    }
}

