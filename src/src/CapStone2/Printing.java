package CapStone2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Printing {
    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_RED = "\u001B[31m";
    private final String ANSI_PURPLE = "\u001B[35m";


    printFunction printTitle = () -> {
        String title = "hangman: guess the secret fruit!";
        IntStream intStream = title.chars();
        Stream<Character> characterStream = title.chars()
                .mapToObj(c -> (char) c);
        System.out.println(ANSI_RED + "++++" + title.toUpperCase() + "++++" + ANSI_RESET);
    };
    printFunction quitInstructions = () -> {
        System.out.println(ANSI_PURPLE + "Type 'quit' at any time to end the game." + ANSI_RESET);
    };
}
