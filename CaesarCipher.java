package com.CarlosDegollado;

public class CaesarCipher {

    public static String encrypt(String s, int d) {

        String code = "";
        int letter;
        char ch = 'x';
        int first = 'a';
        int last = 'z';
        int shift = d;
        int move = 0;
        int diff = 0;


        for (int i = 0; i < s.length(); i++) {

            letter = s.charAt(i);
            System.out.println("letter is " + letter);

            if ((letter + shift) >= 97 && (letter + shift) <= 122) {
                letter = (char) (letter + shift);
                ch = (char) letter;
                System.out.println("ch is " + ch);
            } else if ((letter + shift) > 122) {

                diff = (char)(letter - 'a');
                System.out.println("diff is " + diff);
                ch = (char)('a' + diff - 1);

                System.out.println("new ch is " + ch);

            }

                code += ch;

                System.out.println("code is " + code);
            }

            return "Shift: " + d + "\n" + s + " encrypted is " + code;
        }


        public static String decrypt (String s,int d){

            String message = "";
            String result = "Shift: " + d + "\n" + s + " decrypted is " + message;

            return result;
        }
    }

