import java.util.Scanner;
public class RightTriangleFromSquares
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner ( System.in );
      
      System.out.print( "Enter a: " );
      double a = input.nextDouble();
      
      System.out.print( "Enter b: " );
      double b = input.nextDouble();
      
      System.out.print( "Enter c: " );
      double c = input.nextDouble();
      
      rightTriangle( a , b , c );
      
   }
   public static void rightTriangle( double a , double b , double c )
   {  
      if( a <= 0 || b <= 0 || c <= 0 )
      {
         System.out.print( "Cannot form a right triangle" );
      }
      else if( a == ( b + c ) || b == ( a + c ) || c == ( a + b ))
      {
         System.out.print( "Can form a right triangle" ); 
      }
      else 
      {
         System.out.print( "Cannot form a right triangle" );
      }
      
   }
}