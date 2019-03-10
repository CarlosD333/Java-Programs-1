import java.util.Scanner;
public class DivisibleByFive
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      int user = 0;
      boolean loop = true;
      int div = 0;
      
      do
      {
         System.out.print( "Enter an int greater than 10: " );
         user = input.nextInt();
         
         if( user > 10 )
         {
            loop = false;
         } 
      }while( loop ); 
      
      int count = 0;
      while ( count <= user )
      {
         count++; 
         
         if( count % 5 == 0 )
         {
            div = div + count; 
         }
      }
      
      System.out.println();
      
      System.out.print( "The sum of numbers divisible by 5 from 1 to " 
      + user + " is " + div );
   }
}