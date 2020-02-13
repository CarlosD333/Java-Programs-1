package com.CarlosDegollado;

public class ImaginaryNumber {

    private int real;
    private int imaginary;

    public ImaginaryNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return this.real;
    }

    public int getImaginary() {
        return this.imaginary;
    }

    public void displayImaginaryNumber() {
        if(this.imaginary < 0) {
            System.out.println(this.real + " - " + Math.abs(this.imaginary) + "i");
        } else {
            System.out.println(this.real + " + " + this.imaginary + "i");
        }
    }

    public boolean isIdentical(ImaginaryNumber x) {
        if (this.real == x.getReal() && this.imaginary == x.getImaginary()) {
            return true;
        } else {
            return false;
        }
    }
}
