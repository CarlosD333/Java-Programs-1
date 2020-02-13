package com.CarlosDegollado;

public class Employee {
    private String name;

    public Employee(String n) {
        this.name = n;
    }
    @Override
    public String toString() {
        return this.name;
    }
}
