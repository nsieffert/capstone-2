package CapStone2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class Hangman {

    public static final String[] words = {"APPLE", "", "GUAVA", "GRAPE", "GRAPEFRUIT", "PEACH", "PEAR", "KIWI", "PLUM", "TOMATO", "PAPAYA",
            "STRAWBERRY", "BLUEBERRY", "HACKBERRY", "RASPBERRY", "APRICOT", "BANANA", "BLACKBERRY", "CANTALOUPE",
            "CHERRY", "DATE"};

    public static final Random random = new Random();
    public static final int maxErrors = 6;
    private String wordToFind;
    private char[] wordFound;
    private int remainingErrors;
    private ArrayList<String> letters = new ArrayList<String>();

    private String nextWordToFind() {
        return words[random.nextInt(words.length)];
    }

    public void newGame() {
        remainingErrors = 0;
        letters.clear();
        wordToFind = nextWordToFind();
        wordFound = new char[wordToFind.length()];

        for (int i = 0; i < wordFound.length; i++) {
            wordFound[i] = '_';

        }
    }

    public boolean wordFound() {
        return wordToFind.contentEquals(new String(wordFound));
    }

    public void enter(String c) {
        if (!letters.contains(c)) {
            if (wordToFind.contains(c + "")) {
                int index = wordToFind.indexOf(c);

                while (index >= 0) {
                    wordFound[index] = c.charAt(0);
                    index = wordToFind.indexOf(c, index + 1);
                }
            } else {
                remainingErrors++;
            }
            letters.add(c);
        }
    }

    private String wordFoundContent() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < wordFound.length; i++) {
            builder.append(wordFound[i]);
            if (i < wordFound.length - 1) {
                builder.append(" ");
            }

        }
        return builder.toString();
    }

    public void play() {
        try (Scanner input = new Scanner(System.in)) {
            while (remainingErrors < maxErrors) {
                System.out.print("Enter a letter: ");
                String str = input.next().toUpperCase();
                if (str.length() > 1) {
                    str = str.substring(0, 1);
                }
                enter(str);
                System.out.println("Not sure " + wordFoundContent());
                if (wordFound()) {
                    System.out.println("You Win!");
                    break;
                } else {
                    System.out.println("Nb Tries Remaining: " + (maxErrors - remainingErrors));
                }
            }
        }
        if (remainingErrors == maxErrors) {
            System.out.println("You Lose!");
            System.out.println("Word was " + wordToFind);
        }
    }


    public static void main(String[] args) {
        System.out.println("HangMan Game with Fruit");
        Hangman hangman = new Hangman();
        hangman.newGame();
        hangman.play();
    }
}
