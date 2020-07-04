//package CapStone2;
//
//import java.util.ArrayList;
//
//public class StartGame {
//    StartGame startGame = new StartGame();
//    public String wordToFind;
//    public char[] wordFound;
//    public int remainingErrors;
//    public ArrayList<String> letters = new ArrayList<String>();
//
//    public void startGame() {
//        remainingErrors = 0;
//        letters.clear();
//        wordToFind = Random.nextWordToFind();
//        wordFound = new char[wordToFind.length()];
//        for (int i = 0; i < wordFound.length; i++) {
//
//        }
//    }
//
//    public boolean wordFound() {
//        return wordToFind.contentEquals(new String(wordFound));
//    }
//    public void enter(String c) {
//        if (!letters.contains(c)) {
//            if (wordToFind.contains(c + "")) {
//                int index = wordToFind.indexOf(c);
//
//                while (index >= 0) {
//                    wordFound[index] = c.charAt(0);
//                    index = wordToFind.indexOf(c, index + 1);
//                }
//            } else {
//                remainingErrors++;
//            }
//            letters.add(c);
//        }
//    }
//}
