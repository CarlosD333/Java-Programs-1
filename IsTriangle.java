import java.util.Scanner;
public class IsTriangle
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      System.out.print( "Enter a: " );
      int a = input.nextInt();
      
      System.out.print( "Enter b: " );
      int b = input.nextInt();
      
      System.out.print( "Enter c: " );
      int c = input.nextInt();
      
      int sum = a + b + c;
      
      System.out.println();
      
      if( ( a + b ) < c || ( b + c ) < a || ( a + c ) < b )
      {
         System.out.print( "These cannot make a triangle" );
      }
      else if( sum < 0 )
      {
         System.out.print( "These cannot make a triangle" );
      }
      else
      {
         System.out.print( "These can make a triangle" );
      }
      
   }
}