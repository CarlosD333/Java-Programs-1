public class SumOfAllEvens
{
   public static void main( String[] args )
   {
      int[] arr1 = {22, 2, 0};
      int[] arr2 = {1, 4, 6, 5, 0, 1};
      int[] arr3 = {6, 2, 1, 8};
      int[] arr4 = {3, 5, 13, 3, 1, 29};
      
      int result = sumOfAllEvens( arr3 );
      
      System.out.print( result );
   }
   
   public static int sumOfAllEvens( int[] arr )
   {
      int sum = 0;
      
      for( int i = 0; i < arr.length; i++ )
      {
         if( arr[i] % 2 == 0 )
         {
            sum += arr[i];
         }
      }
      
      return sum;
   }
}
