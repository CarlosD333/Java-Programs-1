import java.util.Scanner;
public class Carlos3b
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      //input request- 4 integers
      System.out.print( "Enter a four digit integer: " );
      int userNum = input.nextInt();
      
      //var declare 1- number reversal
      int dig1 = userNum % 10;
      int dig2 = userNum % 100;
      int num2 = dig2 / 10;
      int dig3 = userNum % 1000;
      int num3 = dig3 / 100;
      int dig4 = userNum / 1000;
     
      //output result
      System.out.print( userNum + " reversed is: " );
      System.out.print( dig1 );
      System.out.print( num2 );
      System.out.print( num3 );
      System.out.print( dig4 );
 
   }
}