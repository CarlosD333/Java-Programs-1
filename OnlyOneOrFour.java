public class OnlyOneOrFour
{
   public static void main( String[] args )
   {
      int[] arr1 = {1, 4};
      int[] arr2 = {1, 1, 1, 1, 1, 1};
      int[] arr3 = {1, 5, 4};
      int[] arr4 = {4};
      int[] arr5 = {1, 0, 4, 5, 3};
      
      boolean result = onlyOneOrFour( arr3 );
      
      System.out.print( result );
   }
   
   public static boolean onlyOneOrFour( int[] arr )
   {
      boolean result = true;
      
      for( int i = 0; i < arr.length; i++ )
      {
         if( arr[i] == 1 || arr[i] == 4 )
         {
            result = true;
         }
         else
         {
            result = false;
            i = arr.length;
         }
      }
      
      return result;
   }
}
