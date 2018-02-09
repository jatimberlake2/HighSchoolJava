import java.util.InputMismatchException;
import java.util.Scanner;
public class Flowchart2_Better {
	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);
	while (true) {
		boolean prime = true;
		int number = 0;
		int i, n, j, GPF = 2;
		System.out.println("Enter a positive integer to test to see if it is prime or -1 to quit.");
		System.out.println("If the number is not prime, the greatest prime factor will be displayed.");
		//number = derp.nextInt();
		while (true) {
		      try {  // put input statement here
		    	  number = derp.nextInt();
		    	  if (number < 0 && number != -1) {
			    	System.out.println(" --- Not a legal number ---  Enter a positive number or -1 to quit.");
		    		System.out.println("Try again: " );
		    	    derp.nextLine(); // clear the buffer
		    	    continue;
		    	  		}
		    	  }
		    	  catch ( InputMismatchException e ){
		    		System.out.println(" --- Not a legal number ---  Enter a positive number or -1 to quit.");
		    		System.out.println("Try again: " );
		    	    derp.nextLine(); // clear the buffer
		    	    continue;
		    	  }
		    	  break;
		      }
			for (i = 2 ; i < (int)Math.sqrt(number) +1; i++) 
			if (number%i == 0)
				prime = false;
			if (number == -1)
					break;		
	if (prime == true)
		{
		System.out.println("The number " +number+ " is prime.");
		}
	else
		{
		for (n = 2; n <= number; n++) {
			boolean prime2 = false;
			if (number%n == 0) { 
			//System.out.print("number is " +number+ ". ");
			//System.out.print("n is " +n+ ". ");
				for (j = 2; j < n; j++)
			//System.out.print("j is " +j+ ". ");
					if (n%j == 0)
						prime2 = true;
					if (prime2 == false)
			//System.out.print("Prime factor is " +n+ ". ");
					GPF = n;
			//System.out.print("Final j is " +j+ ". ");
			//System.out.print("GPF is " +GPF+ ". ");
			}
		}
		System.out.print("The greatest prime factor of " +number+ " is " +GPF+ ".");
		System.out.println();
	  }
	}
	System.out.println("Goodbye then.");
}
}
