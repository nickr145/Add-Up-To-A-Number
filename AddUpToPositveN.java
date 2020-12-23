//importing all java packages that are needed for this program
import java.util.*;

public class AddUpToPositveN
{
  public static void main(String [] args)
  {
    //setting up the Scanner variable so that the user can input values
    Scanner input = new Scanner(System.in);
    
    //Asking the user for a positive number and storing it in an integer variable
    System.out.print("Enter a positive number:\t\t\t");
    int n = input.nextInt();
    
    //if the user is silly and does not input a positive number, the while loop will continue to ask them to input a positive number until the condition is true
    while (n < 1) {
      System.out.println("PLEASE ENTER A POSTIVE NUMBER");
      n = input.nextInt();
    }
    
    //setting new variables to use for finding the sum of 1 -> n
    int a = 1;
    int sum = 0;
   
    //if a=1 is less than inputted number, the sum updates itself by adding 1 to it's previous sum value. Every time the loop finishes "a" increases by one
    while (a <= n) {
      sum = sum + a;
      a++;
    }
    //Here, the sum after the "while" loop is printed out.
    System.out.println(sum);
  }
}
    