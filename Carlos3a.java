import java.util.Scanner;
public class Carlos3a
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      //input request
      System.out.print( "Enter the sales amount: " );
      double sales = input.nextDouble();
      
      //var declare 1- base pay
      double base = 2000;
      
      //var declare 2- commissions
      double com1 = .03;
      double com2 = .06;
      double com3 = .09;
      
      //ouput result
      //commission
      if ( sales < 1000 )
      {
         System.out.println( "Sales commission was: $0" );
      }

      if ( sales >= 1000 && sales <= 5000 )
      {
         System.out.println( "Sales commission was: $" + ( sales * com1 ));
      }
      
      if ( sales >= 5000.01 && sales <= 10000 )
      {
         System.out.println( "Sales commission was: $" + ( sales * com2 ));
      }
      
      if ( sales >= 10000.01 )
      {
         System.out.println( "Sales commission was: $" + ( sales * com3 ));
      }

      //total pay
      if ( sales < 1000 )
      {
         System.out.println( "Total pay is: $" + base );
      }
      
      if ( sales >= 1000 && sales <= 5000 )
      {
         System.out.println( "Total pay is: $" + ( base + ( sales * com1 )));
      }
      
      if ( sales >= 5000.01 && sales <= 10000 )
      {
         System.out.println( "Total pay is: $" + ( base + ( sales * com2 )));
      }
      
      if( sales >= 10000.01 )
      {
         System.out.println( "Total pay is: $" + ( base + ( sales * com3 )));
      }
      

      //stars
      if( sales >= 4000 && sales < 8000 )
      {
         System.out.print( "You've gained a bronze star!" );
      }
      
      if( sales >= 8000 && sales < 12000 )
      {
         System.out.println( "You've gained a bronze star!" );
         System.out.print( "You've gained a silver star!" );
      }
      
      if( sales >= 12000 )
      {
         System.out.println( "You've gained a bronze star!" );
         System.out.println( "You've gained a silver star!" );
         System.out.print( "You've gained a gold star!" );
      }
      
   }
}