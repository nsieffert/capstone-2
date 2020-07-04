package CapStone2;


public class Random {
    public static final java.util.Random random = new java.util.Random();
    public static String nextWordToFind() {
        return Words.words[random.nextInt(Words.words.length)];
    }
}
