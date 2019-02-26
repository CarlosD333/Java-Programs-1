import java.util.Scanner;
public class RightTriangle
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
      double as = Math.pow( a , 2 );
      double bs = Math.pow( b , 2 );
      double cs = Math.pow( c , 2 );
      
      /*
      System.out.println( as );
      System.out.println( bs );
      System.out.println( cs );
      */
      
      if( a <= 0 || b <= 0 || c <= 0 )
      {
         System.out.print( "Cannot form a right triangle" );
      }
      else if( as ==  bs + cs  || bs ==  as + cs  || cs ==  as + bs )
      {
         System.out.print( "Can form a right triangle" ); 
      }
      else 
      {
         System.out.print( "Cannot form a right triangle" );
      }
      
   }
}