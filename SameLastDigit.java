import java.util.Scanner;
public class SameLastDigit
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      System.out.print( "First number: " );
      int num1 = input.nextInt();
      
      System.out.print( "Second number: " );
      int num2 = input.nextInt();
      
      int last1 = num1 % 10;
      int last2 = num2 % 10;
      
      
      if( last1 == last2 )
      {
         System.out.print( "Same last digit" );
      }
      else
      {
         System.out.print( "Different last digits" );
      }
      
      
   }
}
