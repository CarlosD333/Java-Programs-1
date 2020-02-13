package com.carlosdegollado;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximumOfEachLine {
    public static void main(String[] args) {

        File f1 = new File("G:\\My Drive\\Coding\\IdeaProjectStorage\\MaximumOfEachLine\\src\\com\\carlosdegollado\\data.txt");

        try {
            Scanner scanF = new Scanner(f1);

            while(scanF.hasNext()) {
                int max = 0;
                String strLine = scanF.nextLine();
                String[] strArr = strLine.split(" ");
                for (int i = 0; i < strArr.length; i++) {
                    if (i > 1) {
                        int num = Integer.parseInt(strArr[i]);
                        if (num > max) {
                            max = num;
                        }
                    }
                }
                System.out.println(strArr[0] + " " + strArr[1] + "\tMax: " + max);
            }
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found");
        }

    }
}
