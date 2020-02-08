package com.company;

public class Student {
    public int id;
    public String name;
    public String major;
    public double gpa;

    public Student(int id, String name, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public void studentInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("Major: " + this.major);
        System.out.println("GPA: " + this.gpa);
    }
}
