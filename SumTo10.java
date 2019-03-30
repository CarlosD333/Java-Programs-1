import java.util.Scanner;
public class SumTo10
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      double sum = 0;
      int count = 0;
      
      while( sum != 10 )
      {
         System.out.print( "Enter a number: " );
         double num = input.nextDouble();
      
         sum += num;
      
         ++count;
      }
      
      System.out.println();
      
      System.out.print( count + " numbers entered" );
   }
}