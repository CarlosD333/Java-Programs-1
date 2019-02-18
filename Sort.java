import java.util.Scanner;
public class Sort
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner ( System.in );
      
      System.out.print( "Enter a: " );
      int a = input.nextInt();
      
      System.out.print( "Enter b: " );
      int b = input.nextInt();
      
      System.out.print( "Enter c: " );
      int c = input.nextInt();
      
      System.out.println();
      
      // High Number
      if( a >= b && a >= c )
         {
         System.out.print( a + " " );
         }
      else if( b >= a && b >= c )
         {
         System.out.print( b + " " );
         }
      else if( c >= b && c >= a )
         {
         System.out.print( c + " " );
         }
     // Middle Number
      if( b >= a && a >= c || c >= a && a >= b )
         {
         System.out.print( a + " " );
         }
      else if( a >= b && b >= c || c >= b && b >= a )
         {
         System.out.print( b + " " );
         }
      else if( a >= c && c >= b || b >= c && c >= a )
         {
         System.out.print( c + " " );
         }
      
      // Low Number
      if( b >= a && c >= a )
         {
         System.out.print( a );
         }
      else if( a >= b && c >= b )
         {
         System.out.print( b );
         }
      else if( a >= c && b >= c )
         {
         System.out.print( c );
         }
           
   }
}