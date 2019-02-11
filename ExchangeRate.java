import java.util.Scanner;
public class ExchangeRate
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      System.out.print( "Enter the dollar/RMB exchange rate: " );
      double rate = input.nextDouble();
      
      System.out.print( "Enter 0 to convert dollars to RMB, or 1 to convert RMB to dollars: " );
      int curcheck = input.nextInt();
      
      
      if( curcheck == 0 )
      {
         System.out.print( "Enter the dollar amount: " );
         int amount = input.nextInt();
         
         System.out.println();
         
         double con = amount * rate;
         
         System.out.print( "$" + (int)amount + " is " + con + " yuan" ); 
      }
      else if( curcheck == 1 )
      {
         System.out.print( "Enter the RMB amount: " );
         int amount = input.nextInt();
         
         System.out.println();
         
         double con = (double)amount / rate;
         
         System.out.print( amount + " yuan is $" + con );  
      }
      else
      {
         System.out.println();
         System.out.print( "Invalid input" );
      }

      
      /*
      System.out.println();
      
      if( curcheck == 0 )
      {
         double con = amount * rate;
      }
      else if( curcheck == 1 )
      {
         double con = (double)amount / rate;
      }
      
      
      
      if( curcheck == 0 )
      {
         System.out.print( "$" + (int)amount + " is " + con + " yuan" ); 
      }
      else if( curcheck == 1 )
      {
         System.out.print( amount + " yuan is $" + con );  
      }
      else
      {
         System.out.print( "Invalid input" );
      }
      */

      
   }
}