
/**
 *  How many random people do you have to select before you find
 *  a duplicate birthday (that is, two peole who were born on the
 *  same day of the same month, but not necessarily in the same
 *  year).  This program simulates the process.  (It ignores the
 *  possibility of people born on leap day.)
 */
import java.util.*;

public class BirthdayProblemDemo2 {

   public static void main(String[] args) {
	   Scanner derp = new Scanner(System.in);
       System.out.println("This program simulates taking people at random");
       System.out.println("until two have been found who were born on the");
       System.out.println("same day of the year.\n");
      int[] matches = new int[365];
      for (int p = 0; p < 365; p++) {
    	  matches[p] = 0;
      }
       do {      		  
    	   double sum = 0;
    	   double sum2 = 0;
    	      for (int i = 0; i < 100000; i++) { 
    	    	  int temp = birthdayProblem();
    	    	  matches[temp - 2]++;
    	        }
    	      for (int j = 0; j < 365; j++) {
    	    	  sum2 = matches[j]*birthdayProblem() + sum2;
    	      }
    	  System.out.println(sum2/100000);
    	      for (int k = 0; k < 22; k++) {
    	    	  sum = matches[k] + sum;
      		  }
    	  System.out.println(sum/100000);

          System.out.println("\nAgain? (Y/N):  ");
       } while ( derp.nextBoolean() );
       
       System.out.println("\n\nOK.  Goodbye.");
       
   } // end main()
   
   
   /**
    * Simulate choosing people at random and checking the day of the year they 
    * were born on.  If the birthday is the same as one that was seen previously, 
    * stop, and output the number of people who were checked.
    */
   private static int birthdayProblem() {

      boolean[] used;  // For recording the possible birthdays
                       //   that have been seen so far.  A value
                       //   of true in used[i] means that a person
                       //   whose birthday is the i-th day of the
                       //   year has been found.

      int count;       // The number of people who have been checked.

      used = new boolean[365];  // Initially, all entries are false.
      
      count = 0;

      while (true) {
             // Select a birthday at random, from 0 to 364.
             // If the birthday has already been used, quit.
             // Otherwise, record the birthday as used.
         int birthday;  // The selected birthday.
         birthday = (int)(Math.random()*365);
         count++;
         if ( used[birthday] )  // This day was found before; It's a duplicate.
            break;
         used[birthday] = true;
      }
      return count;
   } // end birthdayProblem()
 
   
} // end class BirthdayProblemDemo
