package com.carlosdegollado;
import javax.sound.midi.Soundbank;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(check());
    }

    public static String check() {
        Scanner input = new Scanner(System.in);


        //Input
        System.out.println("Enter number a: ");
        String strA = input.nextLine();

        System.out.println("Enter number b: ");
        String strB = input.nextLine();

        System.out.println("Enter number c: ");
        String strC = input.nextLine();


        //Get last int
        char charA = strA.charAt(strA.length() - 1);
        String lastAstring = charA + "";
        int intA = Integer.parseInt(lastAstring);

        char charB = strB.charAt(strB.length() - 1);
        String lastBstring = charB + "";
        int intB = Integer.parseInt(lastBstring);

        char charC = strC.charAt(strC.length() - 1);
        String lastCstring = charC + "";
        int intC = Integer.parseInt(lastCstring);


        //Odd check
        int count = 0;
        if (intA % 2 != 0 || intA == 1) {
            count++;
        }
        if (intB % 2 != 0 || intB == 1) {
            count++;
        }
        if (intC % 2 != 0 || intC == 1) {
            count++;
        }


        //Output
        String result = "";
        if (count == 0) {
            result = "No integers were odd";
        } else if (count == 1) {
            result = "One integer was odd";
        } else if (count == 2) {
            result = "Two integers were odd";
        } else {
            result = "Three integers were odd";
        }

        System.out.println();

        return result;
    }
}
