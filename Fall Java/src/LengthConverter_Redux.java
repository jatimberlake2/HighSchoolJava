import java.util.Scanner;
public class LengthConverter_Redux {
	public static void main(String[] args) {
	/* Get the user's input, and convert units to lower case. */    
	Scanner derp = new Scanner(System.in);
	int optionNumber;
		// Option number from menu, selected by user.
	double measurement;
		// A numerical measurement, input by the user.
		// The unit of measurement depends on which
		// option the user has selected.
	double inches;	
		// The same measurement, converted into inches.
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
	System.out.println(inches + " inches");
	break;
case 2:
	System.out.println ("Enter the number of feet: ");
	measurement = derp.nextDouble();
	inches = measurement * 12;
	System.out.println(inches + " inches");
	
case 3:
	System.out.println ("Enter the number of yards: ");
	measurement = derp.nextDouble();
	inches = measurement * 36;
	System.out.println(inches + " inches");
	break;
case 4:
	System.out.println ("Enter the number of miles: ");
	measurement = derp.nextDouble();
	inches = measurement * 12 * 5280;
	System.out.println(inches + " inches");
	break;
default:
	System.out.println ("Error! Illegal option number! I quit!");
	System.exit(1);
		}
	
	// end switch
	/* Now go on to convert inches to feet, yards, and miles... */

	}
}
