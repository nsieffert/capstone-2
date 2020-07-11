package CapStone2;

    abstract class FindWord {
    public String newWord;
    public char[] foundNewWord;

    private boolean foundWord() {
        return newWord.contentEquals(new String(foundNewWord));
    }
}
