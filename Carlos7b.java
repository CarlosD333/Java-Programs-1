public class Carlos7b
{
   public static void main( String [] args )
   {
      int[][] arrayA = {{75, 65, 55, 61},
                        {10, 0, 5, 30},
                        {35, 80, 20, 44}};
      
      int[][] arrayB = {{6, -10, 15, 5},
                        {27, 8, -5, 2}};
                        
      int result = maximumRowRange( arrayA );
      
      System.out.print( "Maxuimum row range is in Row " + result );                  
   }
   public static int maximumRowRange( int[][] grid )
   {
      int[] ranges = new int[grid.length];
      int max = 0;
      int min = 999999999;
      int range = 0;
      int indexOfRow = 0;
      int i = 0; 
      int high = 0;
       
      for( int outer = 0; outer < grid.length; outer++ )
      {
         for( int inner = 0; inner < grid[outer].length; inner++ )
         {
            if( grid[outer][inner] > max )
            {
               max = grid[outer][inner];
            }
            if( grid[outer][inner] < min )
            {
               min = grid[outer][inner];
            }   
         }
   
         ranges[i] = max - min;
         
         max = 0;
         min = 999999999;
         
         i++;
      }
      
      for( int index = 0; index < ranges.length; index++ )
      {
         if( ranges[index] > high )
         {
            high = ranges[index]; 
            indexOfRow = index;
         }
      }
      
      return indexOfRow;
   }
}