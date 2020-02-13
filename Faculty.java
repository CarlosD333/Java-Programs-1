package com.CarlosDegollado;

public class Faculty extends Employee {

    private String department;
    private String payRate;

    public Faculty(String name, String department, String payRate) {
        super(name);
        this.department = department;
        this.payRate = payRate;
    }
    public double payCheck(int hours) {
        double result;
        String payStr = this.payRate.replace("$", "");
        double pay = Double.parseDouble(payStr);
        result = hours * pay;

        return result;
    }
    @Override
    public String toString() {
        String result = "Name: ";
        result += super.toString() + "\nDepartment: " + this.department +
                "\nPay Rate: " + this.payRate + "\n\n";

        return result;
    }
}
