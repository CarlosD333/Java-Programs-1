import java.util.Scanner;
public class Range
{
   public static void main( String[] args)
   {
      Scanner input = new Scanner( System.in );
      
      System.out.print( "Enter a: " );
      int a = input.nextInt();
      
      System.out.print( "Enter b: " );
      int b = input.nextInt();
      
      int result = rangeProduct( a , b );
      
      System.out.print( result );
      
   }
   public static int rangeProduct( int a , int b )
   {
      int prod = 1;
      int count = a;
      while( count <= b )
      {
         prod = prod * count;
         
         count++;
      }
      
      return prod;
       
   }
}