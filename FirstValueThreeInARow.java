public class FirstValueThreeInARow
{
   public static void main( String[] args )
   {
      int[] arr1 = {7, 3, 5, 5, 5, 2, 0, 0};
      int[] arr2 = {0, 0, 1, 0, 12, 4, 2, 2, 2, 6, 8, 8, 1};
      int[] arr3 = {55, 21, 21, 9, 0, 0, 2, 77};
      
      int result = firstValueThreeInARow( arr1 );
      
      System.out.print( "Method returned: " + result );
   }
   public static int firstValueThreeInARow( int[] arr )
   {
      int count = 0;
      int last = -1;
      int out = 0;
      
      int[] methodArray = new int[arr.length + 1];
      
      for( int i = 0; i < arr.length; i++ )
      {
         methodArray[i] = arr[i];
      }
      
      for( int i = 0; i < methodArray.length - 1 && out < 1; i++ )
      {
         if( methodArray[i] == methodArray[i + 1] )
         {
            System.out.println( "i = " + i );
            last = methodArray[i];
            System.out.println( "last is " + last );
            count++;
            System.out.println( "count++" );
         }
         if( count <= 3 )
         {
            last = -1;
            System.out.println( methodArray[i] );
            System.out.println( last );
            System.out.println( "loop" );
            
         }
         else
         {
            last = methodArray[i];
            out++;
         }
      }
  
         return last;
   }
}
