import java.util.Scanner;
public class Carlos2c
   {
      public static void main( String[] args )
         {
         // Scanner Object/Variable
            System.out.println();
            Scanner input = new Scanner ( System.in );
            
            System.out.print( "Enter your earth age in years: " );
            double age = input.nextDouble();
            
         // Variable Declarations
            double merc = ( age * 365 ) / 88;
            double ven = ( age * 365 ) / 225;
            double jup = ( age * 365 ) / 4380;
            double sat = ( age * 365 ) / 10767;
            
         // User Display
            System.out.println( "You are " + merc + " years old on Mercury" );
            System.out.println( "You are " + ven + " years old on Venus" );
            System.out.println( "You are " + jup + " years old on Jupiter" );
            System.out.print( "You are " + sat + " years old on Saturn");
         }        
   }