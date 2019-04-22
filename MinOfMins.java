public class MinOfMins
{
   public static void main( String [] args )
   {
      int[][] arr1 = {{50, 20, 80, 90, 100},
                     {77, 555, 33, 44, 66},
                     {888, 15, 302, 90, 123},
                     {31, 29, 30, 32, 28}};
                     
      int result = minOfMins( arr1 );
      
      System.out.print( "Method returns: " + result );
   }
   public static int minOfMins( int[][] table )
   {
      int min = 999999999;
      int[] mins = new int[table.length];
      int smallest = 999999999;
      int index = 0;
      
      for( int outer = 0; outer < table.length; outer++ )
      {
         for( int inner = 0; inner < table[outer].length; inner++ )
         {
            if( table[outer][inner] < min )
            {
               min = table[outer][inner];
            }
         }  
         
         mins[index] = min;
         index++;          
         
         min = 999999999;
         
      }
      
      for( int i = 0; i < mins.length - 1; i++ )
      {     
         if( mins[i] < mins[i + 1] && mins[i] < smallest )
         {
            smallest = mins[i];
         } 
      }
     
      return smallest;
   }
}
