public class ExactReverseTF
{
   public static void main( String[] args )
   {
      char[] arr1a = {'x', 'f', 'q'};
      char[] arr1b = {'q', 'f', 'x'};
      char[] arr2a = {'m', 's', 't', 'r'};
      char[] arr2b = {'r', 's', 't', 'm'};
      char[] arr3a = {'a', 'b', 'c', 'd'};
      char[] arr3b = {'f', 'e', 'd', 'c', 'b', 'a'};
      char[] arr4a = {'e', 'i', 'r'};
      char[] arr4b = {'r', 'i','e'};
      char[] arr5a = {'x', 'y', 'z'};
      char[] arr5c = {'z', 'k', 'x'};
      
      boolean result = areReversed( arr1a, arr1b );
      
      System.out.print( "Return value is " + result );
   }
   public static boolean areReversed( char[] a, char[] b )
   {
      int out = 0;
      boolean result = false;
      
      char[] temp = new char[a.length];
      
      for( int i = 0; i < a.length; i++ )
      {
         temp[i] = a[i];
         
         System.out.println( temp[i] );
      }
     
      for( int i = 0; i < a.length; i++ )
      {
         
         if( b[i] == temp[i] )
         {
            result = true;
            break;
         }
         if( b[i] != temp[i] )
         {
            result = false;
         }
      }
      
      return result;
   }
}
