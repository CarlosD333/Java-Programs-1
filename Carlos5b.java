public class Carlos5b
{
   public static void main( String[] args )
   {
      int[] A = {6, -17, 22, -9, 0};
      int[] B = reversePolarity( A );
      
      for( int i = 0; i < B.length ; i++ )
      {
         System.out.print( B[i] + " " );
      }
   }
  
   public static int[] reversePolarity( int[] A )
   {
      int[] newArray = new int[A.length];
      
      for( int index = 0; index < A.length; index++ )
      {
         newArray[index] = A[index] * -1;
      }
        
      return newArray;
   }
}