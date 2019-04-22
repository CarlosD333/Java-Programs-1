public class IncreaseOrDecrease
{
   public static void main( String[] args )
   {
      int[] arr1 = {3, 8, 17, 25, 89, 94};
      int[] arr2 = {77, 66, 55, 33, 22, 11};
      int[] arr3 = {20, 30, 50, 40, 10, 5};
      int[] arr4 = {20, 30, 50, 50, 70, 90};
      
      int result = goingWhichWay( arr1 );
      
      System.out.print( result );
   }
   public static int goingWhichWay( int[] A )
   {
      int decrease = 0;
      int increase = 0;
   
      for( int i = 0; i < A.length - 1; i++ )
      {
         if( A[i] < A[i + 1] )
         {
            decrease++;
         } 
         else if( A[i] > A[i + 1] )
         {
            increase++;
         }
      }
      
      int result = 0;
      
      if( decrease == A.length - 1 )
      {
         System.out.println( "Increasing" );
         result = 111;
      }
      if( increase == A.length - 1 )
      {
         System.out.println( "Decreasing" );
         result = 222;
      }
      if( increase != A.length - 1 && decrease != A.length - 1 )
      {
         System.out.println( "Neither" );
         result = 333;
      }

      return result;
   }
}
