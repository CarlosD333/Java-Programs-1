import java.util.Scanner;
public class Months
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner ( System.in );
      
      System.out.print( "Enter a month (1-12): " );
      int month = input.nextInt();
      
      System.out.println();
      
      if( month == 1 )
         {
            System.out.print( "There are 31 days in January" );
         }
      if( month == 2 )
         {
            System.out.print( "There are 28 days in February" );
         }
      if( month == 3 )
         {
            System.out.print( "There are 31 days in March" );
         }
      if( month == 4 )
         {
            System.out.print( "There are 30 days in April" );
         }
      if( month == 5 )
         {
            System.out.print( "There are 31 days in May" );
         }
      if( month == 6 )
         {
            System.out.print( "There are 30 days in June" );
         }
      if( month == 7 )
         {
            System.out.print( "There are 31 days in July" );
         }
      if( month == 8 )
         {
            System.out.print( "There are 31 days in August" );
         }
      if( month == 9 )
         {
            System.out.print( "There are 30 days in September" );
         }
      if( month == 10 )
         {
            System.out.print( "There are 31 days in October" );
         }
      if( month == 11 )
         {
            System.out.print( "There are 30 days in November" );
         }
      if( month == 12 )
         {
            System.out.print( "There are 31 days in December" );
         }   
   }
}