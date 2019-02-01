import java.util.Scanner;
public class Triangle
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner ( System.in );
      
      
      System.out.print( "Enter the base: " );
      int base = input.nextInt();
      
      System.out.print( "Enter the height: ");
      int height = input.nextInt();
      
      
      double area = .5 * base * height;
      
      
      if ( area > 0 )
      {
         System.out.println( "The area of the triangle is: " + area ); 
      }
      
      if ( area <= 0 )
      {
         System.out.println( "Invalid input" );   
      }
      
   }
}