public class HowManyOdds
{
   public static void main( String[] args )
   {
      int[] arr1 = {0, 5, 9};
      int[] arr2 = {4, 12, 0, 16, 32, 8};
      int[] arr3 = {1, 5, 7, 3};
      int[] arr4 = {17};
      
      int result = howManyOdds( arr4 );
      
      System.out.print( result );
   }
   
   public static int howManyOdds( int[] arr )
   {
      int count = 0;
      
      for( int i = 0; i < arr.length; i++ )
      {
         if( arr[i] % 2 != 0 )
         {
            count++;
         }
      }
      
      return count;
   }
}
