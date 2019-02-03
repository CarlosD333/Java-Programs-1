import java.util.Scanner;
public class Carlos3c
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      //var declare 1- random number generator
      int num1 = (int)(Math.random() * 10 );
      int num2 = (int)(Math.random() * 10 );
      
      //var declare 2- answer
      double product = num1 * num2;
      
      //output question- multiplication
      System.out.print( "What is " + num1 + " * " + num2 + "? " );
      
      //input request 1- user response
      int user = input.nextInt();
      
      //output result
      if( user == (int)product )
      {
         System.out.print( user + " is correct!" );
      }
      else
      {
         System.out.print( user + " is incorrect!" );
      }
      
   }
}
