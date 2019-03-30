public class CreateRandomArray
{
   public static void main( String[] args )
   {
      int count = (int)( Math.random() * 20 ) + 1;
      
      int[] array = createRandomArray( count );
      
      for( int i = 0 ; i < count ; i++ )
      {
         System.out.print( array[i] + " " );
      }
   }
   
   public static int[] createRandomArray( int count )
   {
      int[] methodArray = new int [count];
      
      for( int i = 0 ; i < count ; i++ )
      {
         methodArray[i] = (int)( Math.random() * 10 ) + 1;
      }
      
      return methodArray;
   }
}
