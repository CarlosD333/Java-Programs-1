public class MostFrequentValue
{
   public static void main( String[] args )
   {
      int[] arr1 = {81, 81, 39, 17, 39, 17, 17, 17, 81, 81, 39, 5, 39, 39};
      int[] arr2 = {83, 1, 1, -7, 1};
      int[] arr3 = {14, 1, 7, 2, 2};
      int[] arr4 = {10, 10, 7, 0, -2, 4};
      
      int result = mostFrequentValue( arr4 );
      
      System.out.print( "Most frequent value is: " + result );
   }
   public static int mostFrequentValue( int[] myArray )
   {
      int count = 0;
      int value = 0;
      int freq = 0;
      
      for( int i = 0; i < myArray.length; i++ )
      {
         for( int index = 0; index < myArray.length; index++ )
         {
            if( myArray[index] == myArray[i] )
            {
               count++;
            }
         }
         
         if( count > freq )
         {
            freq = count;
            value = myArray[i];
         }
         
         count = 0;
      }
      
      return value;
   }
}