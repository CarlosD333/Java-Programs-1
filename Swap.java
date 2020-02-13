package com.CarlosDegollado;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Swap {

    public static void main(String[] args) {
//	String firstName, lastName;
//	int age;
//	Scanner kbd = new Scanner(System.in);
//
//        System.out.print("Enter your first name: ");
//        firstName = kbd.nextLine();
//
//        System.out.print("Enter your last name: ");
//        lastName = kbd.nextLine();
//
//        System.out.print("Enter your age: ");
//        age = kbd.nextInt();
//
//        File f1 = new File("myFile.csv");
//
//        try {
//            FileWriter writerObject = new FileWriter(f1, true);
//            writerObject.write(firstName);
//            writerObject.write(",");
//            writerObject.write(lastName);
//            writerObject.write(",");
//            writerObject.write(age + "\n");
//            writerObject.flush();
//        }
//        catch (IOException ioe) {
//            System.out.println("Something wrong with the file" + ioe);
//        }
//    }

        final int a = 3;
        final int b = 4;
        int c = 5;

        System.out.println(a + " " + b);

        swap(a, b);

        System.out.print(a + " " + b);

    }


    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;

        System.out.println(a + " " + b);
    }
}
