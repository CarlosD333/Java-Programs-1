import java.util.Scanner;
public class Exponents
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      System.out.print( "Enter a: " );
      int a = input.nextInt();
      
      System.out.print( "Enter b: " );
      int b = input.nextInt();
      
      System.out.println();
      
      exponent( a , b );
            
   }
   public static void exponent( int a , int b )
   { 
      int result = 1;
      
      int count = 0;
      while( count < b )
      {
         result = result * a;
           
         count++;
      }    
      
      System.out.print( a + " to the power of " + b + " is " + result );
      
   }
}