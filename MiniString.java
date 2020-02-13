package com.CarlosDegollado;

public class MiniString {

     private String str;

     public MiniString(String str) {
         this.str = str;
     }

     public String makeSubstring(int beginIndex) {
         String str = this.str;

         String result = str.substring(beginIndex);

         return result;
     }

     public String makeSubstring(int beginIndex, int endIndex ) {
         String str = this.str;

         String result = str.substring(beginIndex, endIndex);

         return result;
     }

     public int findIndexOf(int ch) {
         String string = this.str;

         int result = string.indexOf(ch);

         return result;
     }

     public int findIndexOf(int ch, int fromIndex) {
         String string = this.str;

         int result = string.indexOf(ch, fromIndex);

         return result;
     }

     public int findIndexOf(String str) {
         String string = this.str;

         int result = string.indexOf(str);

         return result;
     }

     public int findIndexOf(String str, int fromIndex) {
         String string = this.str;

         int result = string.indexOf(str, fromIndex);

         return result;
     }
}
