import java.util.Scanner;
public class Carlos2a
	{
		public static void main( String[] args )
			{
         // Scanner Object/Variable
            Scanner input = new Scanner ( System.in );
            
            System.out.print( "Enter temperature in Fahrenheit: ");
				double f = input.nextDouble();
				
         // Variable Declarations
            double cel = ( f - 32 ) * 5/9;
				
         // User Display
				System.out.print( "That is " + cel + " degrees Celsius" );
			}
	}
