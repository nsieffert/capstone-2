package CapStone2;

public class Main {

    public static void main(String[] args) {
        Printing print = new Printing();
        print.printTitle.printIt();
        print.quitInstructions.printIt();

        Hangman hangman = new Hangman();
        hangman.run();
        hangman.userPlay();


    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Graphics().setVisible(true);
        }

    // Variables declaration - do not modify
    private javax.swing.JLabel gallows;
    private javax.swing.JLabel liveMan;
    private javax.swing.JLabel manDead;
    private javax.swing.JLabel singleNoose;
    private javax.swing.JLabel stoolAllOver;
    private javax.swing.JLabel stoolTippedSide;
    private javax.swing.JLabel uprightStool;
});}}




