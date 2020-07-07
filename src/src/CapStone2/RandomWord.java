package CapStone2;

import java.util.Random;

public class RandomWord {
    public static final Random RANDOM = new Random();
    public static String nextWordToFind() {
        return Words.WORDS[RANDOM.nextInt(Words.WORDS.length)];
    }
}
