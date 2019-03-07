import java.util.Scanner;
public class Carlos4b
{
   
   public static void main( String[] args )
   {
      int num = getInput();
      
      int sum = sumAllEvens( num );
      
      System.out.print( "Sum of all even numbers between 2 and " + num + " is: " + sum );
   
   }
   
   public static int getInput()
   {
      Scanner input = new Scanner ( System.in );
      
      
      int num = 0;
      int count = 0;
      while( count <= 1 )
      {
         if( num % 2 == 0 )
         {
            count++;
         }
         
         System.out.print( "Enter an even integer: " );
         num = input.nextInt();
         
         if( num % 2 == 0 )
         {
            count++;
         }
      }
      
      return num;

   }
   
   public static int sumAllEvens( int x )
   {  
      int dig = 0;
      int sum = 2;
      int count = 2;
      while( count != x )
      {
         dig = count + 2;
         
         sum = sum + dig; 
         
         count = count + 2;
      }
      
      return sum;
      
   }
   
}