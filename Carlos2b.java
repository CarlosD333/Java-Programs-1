import java.util.Scanner;
public class Carlos2b
   {
      public static void main( String[] args )
         {
         // Scanner Object/Variable
            Scanner input = new Scanner ( System.in );
            
            System.out.print( "Enter the radius: " );
            double r = input.nextDouble();
            
         // Variable Declarations
            double a = 3.14159 * Math.pow( r,2 );
            double d = 2 * r;
            double c = 2 * 3.14159 * r;
            
         // User Display   
            System.out.println( "The area is " + a );
            System.out.println( "The circumference is " + c );
            System.out.print( "The diameter is " + d );
         }
   }