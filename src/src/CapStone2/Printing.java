package CapStone2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Printing {
    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_BRIGHT_MAGENTA = "\u001b[35;1m";
    private final String ANSI_RED = "\u001B[31m";
    private final String ANSI_PURPLE = "\u001B[35m";


    noFunction printTitle = () -> {
        String title = "hangman";
        IntStream intStream = title.chars();
        Stream<Character> characterStream = title.chars()
                .mapToObj(c -> (char) c);
        System.out.println(ANSI_RED + "++++++++++++++++" + title.toUpperCase() + "++++++++++++++++" + ANSI_RESET);
    };
    noFunction quitInstructions = () -> {
        System.out.println(ANSI_BRIGHT_MAGENTA + "+++++++++GUESS THE SECRET FRUIT+++++++++" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "Type 'quit' at any time to end the game." + ANSI_RESET);
    };
}
