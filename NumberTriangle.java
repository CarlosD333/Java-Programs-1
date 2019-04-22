import java.util.Scanner;
public class NumberTriangle
{
   public static void main( String [] args )
   {
      Scanner input = new Scanner( System.in );
      
      System.out.print( "Enter integer n: " );
      int n = input.nextInt();
      
      System.out.print( "Enter integer k: " );
      int k = input.nextInt();
      
      System.out.println();
      
      int count = 0;
      int it = 0;
      int value = n;
      int out = 0;
      
      while( out < k )
      {
         System.out.print( value + " " );
      
         while( count < it )
         {
            System.out.print( value + " " );
            count++;
         }
         
         System.out.println();
         value += 1;
         count = 0;
         it++;
         out++;
      }
   }
}