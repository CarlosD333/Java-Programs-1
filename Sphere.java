import java.util.Scanner;
public class Sphere
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner ( System.in );
      
      
      System.out.print( "Enter a double value for the radius: " );
      double r = input.nextDouble();
      
      
      double vol = 1.3333333 * 3.14159 * Math.pow( r,3 );
      
      
      System.out.println( "A sphere with the radius of " + r + " is " + vol );
      
   }
}