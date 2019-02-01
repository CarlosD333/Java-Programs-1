import java.util.Scanner;
public class January29Practice1
{
   public static void main( String[] args )
   {
      Scanner kbd = new Scanner(System.in);
      double gpa;
      
      System.out.print("Enter your gpa: ");
      gpa = kbd.nextDouble();
      
      System.out.println("Hi!");
      if(gpa > 2.1)
      {
         System.out.println("Good enough");
      }
      
      System.out.println("What are you doing?");
      System.out.println("Don't fall asleep.");
      
      if(gpa >= 3.8)
      {
         System.out.println("Great job!!");
         System.out.println("Keep it up");
      }
      
      System.out.println("Good Bye!");
   }
}