package CapStone2;
//having trouble importing the Random util.
public class Random {
    public static final java.util.Random RANDOM = new java.util.Random();
    public static String nextWordToFind() {
        return Words.WORDS[RANDOM.nextInt(Words.WORDS.length)];
    }
}
