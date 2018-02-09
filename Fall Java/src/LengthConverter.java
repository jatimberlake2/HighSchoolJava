import java.util.Scanner;

/* 
 * This program will convert measurements expressed in inches,
 * feet, yards, or miles into each of the possible units of
 * measure.  The measurement is input by the user, followed by
 * the unit of measure.  For example:  "17 feet", "1 inch",
 * "2.73 mi".  Abbreviations in, ft, yd, and mi are accepted.
 * The program will continue to read and convert measurements
 * until the user enters an input of 0.
 */
 
 public class LengthConverter {
 
    public static void main(String[] args) {
       Scanner derp = new Scanner(System.in);
       double measurement;  // Numerical measurement, input by user.
     //  String units;        // The unit of measure for the input, also
                            //    specified by the user.
       
       double inches=0, feet=0, yards=0, miles=0;  // Measurement expressed in
       //   each possible unit of
       //   measure.

       
       System.out.println("Enter measurements in inches, feet, yards, or miles.");
       System.out.println("For example:  1 inch    17 feet    2.73 miles");
       System.out.println("You can use abbreviations:   in   ft  yd   mi");
       System.out.println("I will convert your input into the other units");
       System.out.println("of measure.");
       System.out.println();
       
       while (true) {
          
    	   int optionNumber; // Option number from menu, selected by user.
    	 //  double measurement; // A numerical measurement, input by the user.
    	   // The unit of measurement depends on which
    	   // option the user has selected.
    	 //  double inches; // The same measurement, converted into inches.
    	   /* Display menu and get user’s selected option number. */
    	   System.out.println("What unit of measurement does your input use?");
    	   System.out.println();
    	   System.out.println(" 1. inches");
    	   System.out.println(" 2. feet");
    	   System.out.println(" 3. yards");
    	   System.out.println(" 4. miles");
    	   System.out.println();
    	   System.out.println("Enter the number of your choice: ");
    	   optionNumber = derp.nextInt();
    	   /* Read user’s measurement and convert to inches. */
    	   switch ( optionNumber ) {
    case 1:
    	   System.out.println("Enter the number of inches: ");
    	   measurement = derp.nextDouble();
    	   inches = measurement;
    	   break;
    case 2:
           System.out.println("Enter the number of feet: ");
    	   measurement = derp.nextDouble();
    	   inches = measurement * 12;
    	   break;
    case 3:
           System.out.println("Enter the number of yards: ");
    	   measurement = derp.nextDouble();
    	   inches = measurement * 36;
    	   break;
    case 4:
    	   System.out.println("Enter the number of miles: ");
    	   measurement = derp.nextDouble();
    	   inches = measurement * 12 * 5280;
    	   break;
    	   default:
    	   System.out.println("Error! Illegal option number! I quit!");
    	   System.exit(1);
    	   } // end switch
    	   break;
    	   /* Now go on to convert inches to feet, yards, and miles... */
          }
          
          /* Convert measurement in inches to feet, yards, and miles. */
          
          feet = inches / 12;
          yards = inches / 36;
          miles = inches / (12*5280);
          
          /* Output measurement in terms of each unit of measure. */
          
          System.out.println();
          System.out.println("That's equivalent to:");
          System.out.printf("%12.5g", inches);
          System.out.println(" inches");
          System.out.printf("%12.5g", feet);
          System.out.println(" feet");
          System.out.printf("%12.5g", yards);
          System.out.println(" yards");
          System.out.printf("%12.5g", miles);
          System.out.println(" miles");
          System.out.println();
       
       } // end while
       
      // System.out.println();
      // System.out.println("OK!  Bye for now.");
       
    } // end main()
    
  // end class LengthConverter
