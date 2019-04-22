public class Carlos7a 
{
   public static void main( String[] args )
   {
      boolean[] arr1 = {true, false, false, false, false, true, false, 
                        true, true, true};
      
      boolean result = longerTF( arr1 );
      
      System.out.print( "Longest run is " + result );
   }
   public static boolean longerTF( boolean[] guess )
   {
      boolean result = false;
      int t = 0;
      int f = 0;
      
      for( int i = 0; i < guess.length - 1; i++ )
      {
         if( guess[i] == true && guess[i] == guess[i + 1] )
         {
            t++;
            
         }
         if( guess[i] == false && guess[i] == guess[i + 1] )
         {
            f++;
         }
      }
      
      if( t > f )
      {
         result = true;
      }
      
      return result;
   }
}