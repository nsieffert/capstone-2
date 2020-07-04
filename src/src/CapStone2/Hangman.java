package CapStone2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hangman {
    public static final int maxErrors = 6;
    private String wordToFind;
    private char[] wordFound;
    private int remainingErrors;
    private ArrayList<String> letters = new ArrayList<String>();


    public void startGame() {
        remainingErrors = 0;
        letters.clear();
        wordToFind = Random.nextWordToFind();
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
                Pattern p = Pattern.compile("[\\d]");
                if (p.matcher(str).matches()) {
                    System.out.println("Please enter a single letter.");
                    // str = input.next().toUpperCase();
                } else {
                    if (str.length() > 1) {
                        str = str.substring(0, 1);
                    }
                    enter(str);
                    System.out.println("Your entry: " + wordFoundContent());
                    if (wordFound()) {
                        System.out.println("You Win!");
                        break;
                    } else {
                        System.out.println("Number of Tries Remaining: " + (maxErrors - remainingErrors));
                    }
                }
            }
            if (remainingErrors == maxErrors) {
                System.out.println("You Lose!");
                System.out.println("The Secret Word was " + wordToFind);
            }
        }
    }

            Scanner inputNew = new Scanner(System.in);
            public boolean playAgain () {
                boolean play = true;
                int check = 0;
                while (check == 0)
                    System.out.println("Play again [Y/N]?:");
                String str = inputNew.next().toUpperCase();
                System.out.println(inputNew);
                if (inputNew.equals("Y")) {
                    play = true;
                    startGame();
                } else if (inputNew.equals("N")) {
                    play = false;
                    check++;
                    System.out.println("Thanks for playing.");
                } else {
                    System.out.println("ERROR! Please enter either 'y' or 'n'.");
                }
                return play;
            }
        }
