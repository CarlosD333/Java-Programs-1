package com.carlosdegollado;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this.length = 2.0d;
        this.width = 1.0d;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, boolean isFilled, String color) {
        super(isFilled, color);
        if (length > width) {
            this.width = width;
            this.length = length;
        } else if (length < width) {
            this.width = length;
            this.length = width;
        }
    }

    public void setLW(double x, double y) {

    }

    public double getArea() {
        double area = 0.0d;

        area = this.length * this.width;

        return area;
    }

    @Override
    public String toString() {
        String result = "Width: " + this.width + "\nLength: " + this.length + "\nArea: " +
                        this.getArea() + "\n" + super.toString();

        return result;
    }
}
