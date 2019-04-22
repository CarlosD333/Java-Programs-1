public class Carlos6b
{
   public static void main( String[] args )
   {
      char[] arrayX = {'E', 'Q', 'A', 'F', 'G', 'O', 'C', 'C', 'U', 'U', 'M', 'M'};
      char[] arrayY = {'B', 'Z', 'B', 'U', 'U', 'H', 'H', 'O', 'A', 'E', 'A', 'E', 'P'};
      
      char[] result = vowelConsonant( arrayX, arrayY );
    
      System.out.print( "The returned array is: {" );
      
      for( int i = 0; i < result.length; i++ )
      {
         if( i != result.length - 1 )
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
   public static char[] vowelConsonant( char[] X, char[] Y )
   {
      int vowels = 0;
      int consonants = 0;
      
      for( int i = 0; i < X.length; i++ )
      {
         if( X[i] == 'A' || X[i] == 'E' || X[i] == 'I' || X[i] == 'O' || X[i] == 'U' )
         {
            vowels++;
         }
      }
      
      for( int i = 0; i < Y.length; i++ )
      {
         if( Y[i] != 'A' && Y[i] != 'E' && Y[i] != 'I' && Y[i] != 'O' && Y[i] != 'U' )
         {
            consonants++;
         }
      }
      
      char[] result = new char[ vowels + consonants ];
      int index = 0;

      for( int i = 0; i < X.length; i++ )
      {
         if( X[i] == 'A' || X[i] == 'E' || X[i] == 'I' || X[i] == 'O' || X[i] == 'U' )
         {
            result[index] = X[i];
            index++;
         }
      }
      
      for( int i = 0; i < Y.length; i++ )
      {
         if( Y[i] != 'A' && Y[i] != 'E' && Y[i] != 'I' && Y[i] != 'O' && Y[i] != 'U' )
         {
            result[index] = Y[i];
            index++;
         }
      }
      
      return result;
   }
}