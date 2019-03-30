import java.util.Scanner;
public class HowManyOdd
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
      
      int count = 0;
      
      if( a % 2 != 0 )
      {
         count = count + 1;
      }
      
      if( b % 2 != 0 )
      {
         count++;
      }
      
      if( c % 2 != 0 )
      {
         count = count + 1;
      }
      
      if( count == 0 )
      {
         System.out.print( "No integers were odd" );
      }
      
      if( count == 1 )
      {
         System.out.print( "One int was odd" );
      }
      
      if( count == 2 )
      {
         System.out.print( "Two ints were odd" );
      }
      
      if( count == 3 )
      {
         System.out.print( "Three ints were odd" );
      }
      
   }
}
