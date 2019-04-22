public class ArrayAverage
{
   public static void main( String[] args )
   {
      double[] arr = {1.5, 2.0, 1.0, 9.0, 1.5, 9.5, 2.5};
      
      double[] result = seperate( arr );
      
      System.out.print( "The returned array is: {" );
      
      for( int i = 0; i < result.length; i++ )
      {
         if( i != result.length - 1)
         {
            System.out.print( result[i] + ", " );
         }
         else
         {
            System.out.print( result[i] );
         }   
      }
      
      System.out.print( "}" );
   }
   public static double[] seperate( double[] myArray )
   {
      double[] arr = new double[myArray.length + 1];
      
      double avg = 0;
      
      for( int i = 0; i < myArray.length; i++ )
      {
         avg = avg + myArray[i];
      } 
      
      avg = avg / myArray.length;
      double roundoff = Math.round( avg * 100.0 ) / 100.0;

      int index = 0;
      
      for( int i = 0; i < myArray.length; i++ )
      {
         if( myArray[i] < roundoff )
         {
            arr[index] = myArray[i];
            index++;
         }
         else
         {
            continue;
         }
      }
      
      arr[index] = roundoff;
      index++;
      
      for( int i = 0; i < myArray.length; i++ )
      {
         if( myArray[i] > roundoff )
         {
            arr[index] = myArray[i];
            index++;
         }   
      }
      
      return arr;
   }
}
