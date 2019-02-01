import java.util.Scanner;
public class DateCode
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner ( System.in );
      
      System.out.print( "What time am I picking you up?" );      
      String time = input.nextLine();

      String answer1 = "Great, I'll see you at " + time + "." ;       
      System.out.println( answer1 );
      
      System.out.print( "What's your number, though?" );
      String digits = input.nextLine(); 
      
      System.out.print( "Forsure, I'm definitely hitting that line." );     
   }
}