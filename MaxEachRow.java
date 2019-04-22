public class MaxEachRow
{
   public static void main( String[] args )
   {
      int[][] arr1 = {{23, 8, 12, 9, 6},
                      {-5, 0, 1, -3, -4},
                      {4, 17, 23, 88, 91},
                      {2, 14, 9, 4, 0}};
      
      int[] result = maxEachRow( arr1 );
      
      System.out.print( "Returned array is: {" );
      
      for( int i = 0; i < result.length; i++ )
      {
         if( i < result.length - 1)
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
   public static int[] maxEachRow( int[][] table )
   {
      int[] highs = new int[table.length];
      int high = 0;
      int i = 0;
      
      for( int outer = 0; outer < table.length; outer++ )
      {
         for( int inner = 0; inner < table[outer].length; inner++ )
         {
            if( table[outer][inner] > high ) 
            {
               high = table[outer][inner];
            }
         }
  
      highs[i] = high;
      i++;
      
      high = 0;
      }
      
      return highs;
   }     
}