package CapStone2;

abstract class FindWord {
    public String wordToFind;
    public char[] wordFound;

    private boolean foundWord() {
        return wordToFind.contentEquals(new String(wordFound));
    }
}
