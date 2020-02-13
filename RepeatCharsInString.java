package com.carlosdegollado;

public class RepeatCharsInString {

    private String freq;
    private String text;

    public Problem3(String freq, String text) {
        this.freq = freq;
        this.text = text;
    }

    public String repeatChars() {
        String result = "";
        String str = this.text;
        String numString = this.freq;
        boolean flag = true;


        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            char digit = numString.charAt(i);
            int num = Character.getNumericValue(digit);

            for (int j = 0; j < num; j++) {
                result += letter;
            }
        }

        return result;
    }

    public void displayRepeatChars() {
        System.out.println(repeatChars());
    }
}
