import java.util.Scanner;
public class ArrayProblem4
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      System.out.print( "Enter size: " );
      int size = input.nextInt();
      
      System.out.print( "Enter start: " );
      int start = input.nextInt();
      
      System.out.print( "Enter increment: " );
      int increment = input.nextInt();
      
      int[] arr = new int[size];
      
      arr[0] = start;
      int sum = start;
      
      System.out.print( "The array is: {" + start + ", " );
      
      for( int i = 1; i < arr.length; i++ )
      {  
         arr[i] = sum + increment;
         
         sum = arr[i];
         if( i != arr.length - 1 )
         {
            System.out.print( arr[i] + ", " );
         }
         else
         {
            System.out.print( arr[i] );
         }   
      }
      
      System.out.print( "}" );
   }
}