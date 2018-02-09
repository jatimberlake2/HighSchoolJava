import java.util.*;
	public class Reject_Negative_Integer {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int num = -1;
			System.out.println("Enter a positive integer: ");
			while (num < 0) {
				while (true) {
				      try {
				    	  		// put input statement here
							num = scan.nextInt();
				    	  }
				    	  catch ( InputMismatchException e ) {
				    	    System.out.println( e + " --- Not a legal number --- Try again: " );
				    	    scan.nextLine(); // clear the buffer
				    	    continue;
				    	  }
				    	  break;
				      }	 
				if (num < 0)
					System.out.println("Try again: ");
			}
			System.out.println("Bye");
	  	}
	}