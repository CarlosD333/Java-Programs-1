public class RowWithMostZeros
{
   public static void main( String [] args )
   {
      int[][] arr1 = {{3, 1, -3, 0},
                      {0, -5, 0, 0},
                      {6, 0, 0, 9}};
                   
      int result = rowWithMostZeros( arr1 );
      
      System.out.print( "Method returns " + result );
   }
   public static int rowWithMostZeros( int[][] table )
   {
      int count = 0;
      int row = 0;
      int high = 0;
      
      for( int outer = 0; outer < table.length; outer++ )
      {
         for( int inner = 0; inner < table[outer].length; inner++ )
         {
            if( table[outer][inner] == 0 )
            {
               count++;
            }
         }
      
         if( count > high )
         {
            row = outer;
            high = count;
         }
         
         count = 0;
      }
      
      return row;
   }
}