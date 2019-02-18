import java.util.Scanner;
public class LeapYear
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner ( System.in );
      
      System.out.print( "Enter a year: " );
      int year = input.nextInt();
      
      System.out.println();
      
      if( year % 400 == 0 )
         {
            System.out.print( year + " is a leap year? true" );
         }
      else if( year % 100 == 0 )
         {
            System.out.print( year + " is a leap year? false" );
         }
      else if( year % 4 == 0 )
         {
            System.out.print( year + " is a leap year? true" );
         }
      else
         {
            System.out.print( year + " is a leap year? false" );
         }
         
   }
}