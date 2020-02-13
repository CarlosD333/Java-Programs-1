package com.carlosdegollado;

public class Shape {
    private boolean isFilled;
    private String color;

    public Shape() {
        this.isFilled = true;
        this.color = "Green";
    }

    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }

    @Override
    public String toString() {
        String result = "Filled: " + this.isFilled + "\nColor: " + this.color;

        return result;
    }
}
