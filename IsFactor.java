import java.util.Scanner;
public class IsFactor
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      System.out.print( "Enter the first number: " );
      int num1 = input.nextInt();
      
      System.out.print( "Enter the second number: " );
      int num2 = input.nextInt();
      
      System.out.println();
      
      
      if( num1 % num2 == 0 || num2 % num1 == 0 )
      {
         if( num1 < num2 )
         {
            System.out.print( num1 + " is a factor of " + num2 );
         }
         else
         {
            System.out.print( num2 + " is a factor of " + num1 );
         }
      }
      else
      {
         if( num1 > num2 )
         {
            System.out.print( num2 + " is not a factor of " + num1 );
         }
         else
         {
            System.out.print( num1 + " is not a factor of " + num2 );
         }
      }
       
            
   }
}
