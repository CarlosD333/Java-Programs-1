package com.carlosdegollado;

public class Word extends Sentence {
    private String noVowelsWord;

    public Word(String s, String w) {
        super(s);
        String result = w.replace("a", "");
        result = result.replace("e", "");
        result = result.replace("i", "");
        result = result.replace("o", "");
        result = result.replace("u", "");
        result = result.replace("A", "");
        result = result.replace("E", "");
        result = result.replace("I", "");
        result = result.replace("O", "");
        result = result.replace("U", "");
        this.noVowelsWord = result;
    }

    public String getNoVowelsWord() {
        return this.noVowelsWord;
    }

    public boolean isSubstring() {
        boolean result = super.getSentence().contains(this.noVowelsWord);
        return result;
    }
}
