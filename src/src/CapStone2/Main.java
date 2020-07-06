package CapStone2;

public class Main {

    public static void main(String[] args) {
        Printing print = new Printing();
        print.printTitle.printIt();
        print.quitInstructions.printIt();

        Hangman hangman = new Hangman();
        hangman.run();
        hangman.play();
    }
}




