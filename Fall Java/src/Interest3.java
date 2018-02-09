import java.util.*;
public class Interest3 {
     
   /*
      This class implements a simple program that will compute the amount of 
      interest that is earned on an investment over a period of 5 years.  The 
      initial amount of the investment and the interest rate are input by the 
      user.  The value of the investment at the end of each year is output.
   */
 
   public static void main(String[] args) {
  
      double principal;  // The value of the investment.
      double rate;       // The annual interest rate.
      Scanner derp = new Scanner(System.in);
      /* Get the initial investment and interest rate from the user. */
      
      System.out.print("Enter the initial investment: ");
      
      
      while (true) {
          try {
        	  principal = derp.nextDouble();
        	  }
        	  catch ( InputMismatchException e ) {
        	  System.out.println( e + " --- Not a legal number --- Try again: " );
        	  derp.nextLine(); // clear the buffer
        	  continue;
        	  }
        	  break;
          }
      System.out.println();
      System.out.println("Enter the annual interest rate.");
      System.out.print("Enter a decimal, not a percentage: ");
      while (true) {
          try {
        	  rate = derp.nextDouble();
        	  }
        	  catch ( InputMismatchException e ) {
        	  System.out.println( e + " --- Not a legal number --- Try again: " );
        	  derp.nextLine(); // clear the buffer
        	  continue;
        	  }
        	  break;
          }
      System.out.println();
      
      /* Simulate the investment for 5 years. */
      
      int years;  // Counts the number of years that have passed.
      years = 0;
      while (years < 5) {
         double interest;  // Interest for this year.
         interest = principal * rate;
         principal = principal + interest;     // Add it to principal.
         years = years + 1;    // Count the current year.
         System.out.print("The value of the investment after ");
         System.out.print(years);
         System.out.print(" years is $");
         System.out.printf("%1.2f", principal);
         System.out.println();
      } // end of while loop
                       
   } // end of main()
        
} // end of class Interest3
