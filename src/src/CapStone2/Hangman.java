package CapStone2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Hangman extends FindWord implements Runnable {
    public static int errorCount;
    private static final ArrayList<String> LETTERS = new ArrayList<>();
    final static int MAXERRORS = 6;

    private boolean foundWord() {
        return newWord.contentEquals(new String(foundNewWord));
    }
    
    public void run () {
        errorCount = 0;
        LETTERS.clear();
        newWord = RandomWord.nextWordToFind();
        foundNewWord = new char[newWord.length()];
        Arrays.fill(foundNewWord, '_');
    }
    public void userPlay() {
        final String ANSI_BRIGHT_RED = "\u001b[31;1m";
        final String ANSI_BRIGHT_YELLOW = "\u001b[33;1m";
        String ANSI_BRIGHT_BLUE = "\u001b[34;1m";
        final String ANSI_RESET = "\u001B[0m";

        try (Scanner input = new Scanner(System.in)) {
            while (errorCount < MAXERRORS) {
                System.out.print("\nEnter a single letter: ");
                String str = input.next().toUpperCase();

                if (str.equals("QUIT")) {
                    System.out.println(ANSI_BRIGHT_RED + "Thanks for Playing!" + ANSI_RESET);
                    break;
                } else {
                    Pattern p = Pattern.compile("[\\d]");
                    if (p.matcher(str).matches()) {
                        System.out.println("Please enter a single letter.");
                    } else {
                        if (str.length() > 1) {
                            str = str.substring(0, 1);
                        }
                        addWord(str);
                        System.out.println("Your entry: " + buildWord());
                        if (foundWord()) {
                            System.out.println(ANSI_BRIGHT_BLUE + "You Win!" + "\uD83D\uDE42" + ANSI_RESET);
                            run();
                            // break;
                        } else {
                            System.out.println(ANSI_BRIGHT_YELLOW + "Number of Tries Remaining: " + (MAXERRORS - errorCount) + ANSI_RESET);
                        }
                    }
                    if (errorCount == MAXERRORS) {
                        System.out.println(ANSI_BRIGHT_RED + "You Lose!" + "\uD83D\uDE26" + ANSI_RESET);
                        System.out.println("The Secret Word was " + ANSI_BRIGHT_BLUE + newWord + ANSI_RESET);
                        errorCount = 0;
                        run();
                    }
                }
            }
        }
    }

    private String buildWord() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < foundNewWord.length; i++) {
            builder.append(foundNewWord[i]);
            if (i < foundNewWord.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    private void addWord(String c) {
        if (!LETTERS.contains(c)) {
            if (newWord.contains(c)) {
                int index = newWord.indexOf(c);
                while (index >= 0) {
                    foundNewWord[index] = c.charAt(0);
                    index = newWord.indexOf(c, index + 1);
                }
            } else {
                errorCount++;
            }
            LETTERS.add(c);
        }
    }
        }
