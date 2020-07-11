package CapStone2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Printing {
    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_RED = "\u001B[31m";
    private final String ANSI_PURPLE = "\u001B[35m";


    printFunction printTitle = () -> {
        String title = "hangman: guess the hanging fruit!";
        IntStream intStream = title.chars();
        Stream<Character> characterStream = title.chars()
                .mapToObj(c -> (char) c);
        System.out.println(ANSI_RED + "++++" + title.toUpperCase() + "++++" + ANSI_RESET);
    };
    printFunction quitInstructions = () -> {
        System.out.println(ANSI_PURPLE + "Type 'quit' at any time to end the game." + ANSI_RESET);
    };

    public void playMessage(String message1) {
        for (int i = 0; i < message1.length(); i++) {
            System.out.print(message1.charAt(i));
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void playMessage(String message1, String message2) {
                System.out.println(ANSI_RED + "++++++++++++++" + message1 + "++++++++++++++" + ANSI_RESET);
                for (int i = 0; i < message2.length(); i++) {
                    System.out.print(message2.charAt(i));
                    try {
                        Thread.sleep(80);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
