package com.carlosdegollado;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {

        return this.firstNumber;
    }

    public double getSecondNumber() {

        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {

        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {

        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double result = 0;

        result = this.firstNumber + this.secondNumber;

        return result;
    }

    public double getSubtractionResult() {
        double result = 0;

        result = this.firstNumber - this.secondNumber;

        return result;
    }

    public double getMultiplicationResult() {
        double result = 1;

        result = this.firstNumber * this.secondNumber;

        return result;
    }

    public double getDivisionResult() {
        double result = 0;

        if(secondNumber == 0) {
            return result;
        }

        result = this.firstNumber / this.secondNumber;

        return result;
    }
}
