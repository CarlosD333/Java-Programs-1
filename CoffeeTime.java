import java.util.Scanner;
public class CoffeeTime
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner ( System.in );
      
      System.out.print( "Enter the hours worked: " );
      int hours = input.nextInt();
      
      System.out.print( "Enter the total sales: ");
      double sales = input.nextDouble();
   
   
      double com1 = .05;
      double com2 = .10;
      
      double pay1 =  7.25 * hours + ( sales * com1 );
      double pay2 =  7.25 * hours + ( sales * com2 );   
     
      
      if ( 1.00 <= sales && sales <= 99.00 )   
      {
         System.out.println( "Total pay is " + pay1 );
      }
      
      if ( sales >= 100.00 )
      {
         System.out.println( "Total Pay is " + pay2 );
      }
      
   }
}