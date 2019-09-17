package com.CarlosDegollado;

public class Point {

    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        String result = "(" + getX() + ", " + getY() + ")";

        return result;
    }

    public double distance(Point point) {

        int x1 = getX();
        int y1 = getY();
        int x2 = point.getX();
        int y2 = point.getY();

        double result = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        return result;
    }
}
