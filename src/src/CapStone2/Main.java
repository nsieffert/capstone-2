package CapStone2;

public class Main {

    public static void main(String[] args) {

        Printing print = new Printing();
        print.printTitle.printIt();
        print.quitInstructions.printIt();
        print.playMessage("Welcome!", "Enter a single letter to get started!");
        Hangman hangman = new Hangman();
        hangman.run();
        hangman.userPlay();
    }
}


