package CapStone2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Hangman implements Runnable {
    private final String ANSI_BRIGHT_RED = "\u001b[31;1m";
    private final String ANSI_BRIGHT_YELLOW = "\u001b[33;1m";
    private final String ANSI_BRIGHT_BLUE = "\u001b[34;1m";
    private final String ANSI_RESET = "\u001B[0m";

    private static final int MAXERRORS = 6;
    private String wordToFind;
    private char[] wordFound;
    private int remainingErrors;
    private final ArrayList<String> LETTERS = new ArrayList<>();
    private boolean quit = false;

    public void run() {
        remainingErrors = 0;
        LETTERS.clear();
        wordToFind = Random.nextWordToFind();
        wordFound = new char[wordToFind.length()];
        Arrays.fill(wordFound, '_'); // this was a for loop. Intellij offered a new fill feature.
    }

    private boolean wordFound() {
        return wordToFind.contentEquals(new String(wordFound));
    }

    private void enter(String c) {
        if (!LETTERS.contains(c)) {
            if (wordToFind.contains(c)) {
                int index = wordToFind.indexOf(c);
                while (index >= 0) {
                    wordFound[index] = c.charAt(0);
                    index = wordToFind.indexOf(c, index + 1);
                }
            } else {
                remainingErrors++;
            }
            LETTERS.add(c);
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
    public void play () {
        try (Scanner input = new Scanner(System.in)) {
            while (remainingErrors < MAXERRORS) {
                System.out.print("Enter a letter: ");
                String str = input.next().toUpperCase();

                if (str.equals("QUIT")) {
                    quit = true;
                    break;
                } else {
                    Pattern p = Pattern.compile("[\\d]");
                    if (p.matcher(str).matches()) {
                        System.out.println("Please enter a single letter.");
                    } else {
                        if (str.length() > 1) {
                            str = str.substring(0, 1);
                        }
                        enter(str);
                        System.out.println("Your entry: " + wordFoundContent());
                        if (wordFound()) {
                            System.out.println(ANSI_BRIGHT_BLUE + "You Win!" + ANSI_RESET);
                            break;
                        } else {
                            System.out.println(ANSI_BRIGHT_YELLOW + "Number of Tries Remaining: " + (MAXERRORS - remainingErrors) + ANSI_RESET);
                        }
                    }
                    if (remainingErrors == MAXERRORS) {
                        System.out.println(ANSI_BRIGHT_RED + "You Lose!" + ANSI_RESET);
                        System.out.println("The Secret Word was " + ANSI_BRIGHT_BLUE + wordToFind + ANSI_RESET);
                        remainingErrors = 0;
                        run();
                    }
                }
            }
        }
    }
}
