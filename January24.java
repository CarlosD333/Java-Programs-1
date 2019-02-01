public class January24
{
   public static void main( String[] args )
   {
      int radius = 5;
      boolean result = radius != 0;
      
      /*
      boolean r1 = 5 < 10;
      boolean r2 = 10 > 5;
      boolean r3 = 7 >= 5;
      
      System.out.println( r1 );
      System.out.println( r2 );
      System.out.println( r3 );
      */
      
      boolean r1 = !result ;
      
      System.out.println( r1 );
      
      /*
      boolean r1 = 5 < 10;
      boolean r2 = 10 > 5;
      boolean r3 = 7 >= 5;
      
      System.out.println( r1 && r2 );
      System.out.println( r4 && r2 );
      System.out.println( r4 || r2 );
      System.out.println( r4 ^ r3 );
      System.out.println( !r5 );      
      */
      
      boolean a1 = ( 5 <  10 ) && ( 5 > 2 ) && ( 5 != 0 );
      boolean b2 = ( 5 < 2 ) && ( 5 > 2 ) || ( 5 != 0 );
      
      System.out.println( a1 );
      System.out.println( b2 );
      
      int x = 3;
      System.out.println( "x is 3" );
      
      if ( x > 5 ) // False, so it wont print
      {
         System.out.println( "x is strictly greater than 5" );
      }
      
      if ( x > 2 ) // True, so it prints
      {
         System.out.println( "x is strictly greater than 2" );
      }
      
      int y = 7;
      System.out.println( "y is 7" );
      
      if ( y > 4 ) // True, so it prints
      {
         System.out.println( "y is greater than 4" );
      }
      
      if ( y > 16 ) // False, so it won't print
      {
         System.out.println( "y is greater than 16" );
      }
      
      if ( y == 7 ) // True, so it prints
      {
         System.out.println( "y is equal to 7" );
      }
      
      if ( y != 4 ) // True, so it prints
      {
         System.out.println( "y is not equal to 4" );
      }
      
      System.out.println( "End of program" );
      
   }
}