package com.carlosdegollado;

public class Sentence {
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return this.sentence;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = this.sentence.equals(obj);
        return result;
    }
}
