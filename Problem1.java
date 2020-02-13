package com.carlosdegollado;

public class Problem1 {

    private char[][] ch;
    private String str;

    public Problem1(char[][] ch) {
        this.ch = ch;
    }

    public Problem1(String str) {
        this.str = str;
    }

    public String createAstring() {
        String result = "";

        for (int row = 0; row < this.ch.length; row++) {
            for (int col = 0; col < this.ch[row].length; col++) {
                result += ch[row][col];
            }
        }

        return result;
    }

    public char[][] createCharArray() {
        char[][] result = new char[4][10];

        int i = 0;

        for (int row = 0; row < str.length(); row++) {
            for (int col = 0; col < 4; col++) {
                result[row][col] = str.charAt(i);
                i++;
            }
        }

        return result;
    }
}
