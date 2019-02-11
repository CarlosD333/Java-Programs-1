import java.util.Scanner;
public class WhatOrder
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );
      
      System.out.print( "Enter value: " );
      double val1 = input.nextDouble();
      
      System.out.print( "Enter value: " );
      double val2 = input.nextDouble();
      
      System.out.print( "Enter value: " );
      double val3 = input.nextDouble();
      
      System.out.println();
      
      if( val1 < val2 && val2 < val3 )
      {
         System.out.print( "INCREASING" );
      }
      else if( val2 > val3 && val1 > val2 )
      {
         System.out.print( "DECREASING" );
      }
      else
      {
         System.out.print( "NEITHER" );
      }
      
   }
}