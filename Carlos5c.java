public class Carlos5c
{
   public static void main( String[] args )
   {
      int[] A = { 10, 5, 100, 3, 6, 2, 30 };
      int result = evenSumMinusOddProduct( A );
      
      System.out.print( "Result is " + result );
   }
   
   public static int evenSumMinusOddProduct( int[] A )
   {
      int sum = 0; 
      int prod = 1; 
      int diff = 0;
      
      for( int i = 0; i < A.length; i++ )
      {
         if( i % 2 == 0 )
         {
            sum += A[i];
         }
         else
         {
            prod *= A[i];
         }
      }
      
      diff = sum - prod;
      
      return diff;
   }
}