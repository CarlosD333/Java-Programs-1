import java.util.Scanner;
public class MaxOf4
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
      
      System.out.print( "Enter d: " );
      int d = input.nextInt();
      
      System.out.println();
      
      int result = maxOf4( a , b , c , d );
      
      System.out.print( "Maximum is " + result );
      
   }
   public static int maxOf4( int w , int x , int y , int z )
   {
      if( w >= x && w >= y && w >= z )
      {
         return w;
      }
      else if( x >= w && x >= y && x >= z )
      {
         return x;
      }
      else if( y >= w && y >= x && y >= z )
      {
         return y;
      }
      else
      {
         return z;
      }
   }
}