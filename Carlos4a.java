import java.util.Scanner;
public class Carlos4a
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner ( System.in );
      
      int num = 0;
      int count = 0;           
      while( count <= 1 )
      {
         if( num % 3 == 0 )
         {
            count++;
         }
         
         System.out.print( "Enter an odd integer: " );
         num = input.nextInt();
         
         if( num % 3 == 0 )
         {
            count++;
         }
      }
      
      int prod = 3;
      while( prod <= num )
      {
         System.out.println( "3 is a multiple of " + prod );
         prod = prod + 6;
      }
  
   }
}