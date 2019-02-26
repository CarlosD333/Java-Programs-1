import java.util.Scanner;
public class LastDigits
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner ( System.in );
      
      System.out.print( "Enter the first int: " );
      int a = input.nextInt();
      
      System.out.print( "Enter the second int: " );
      int b = input.nextInt();
      
      System.out.print( "Enter the third int: " );
      int c = input.nextInt();
      
      System.out.println();
      
      boolean result = sameLastDigits( a , b , c );
      
      System.out.print( "They have the same last digit? " + result );
      
      
   }
   public static boolean sameLastDigits( int x , int y , int z )
   {
      int lastx = x % 10;
      int lasty = y % 10;
      int lastz = z % 10;
      
      if( lastx == lasty && lasty == lastz )
      {
         return true;
      }  
      else 
      {
         return false;
      }
   }
}