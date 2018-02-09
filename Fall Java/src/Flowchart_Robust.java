import java.util.*;
public class Flowchart_Robust {
	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);
		while (true) {
		double base = -1;
		double height = -1;
		double radius = -1;
		double shape = 42;
		System.out.println("Enter 1 to calculate the area of a triangle, 2 to calculate");
		System.out.println("    the area of a circle, or 0 to quit.");
		while (shape == 42) {
			while (true) {
			      try {  // put input statement here
			    	  shape = derp.nextDouble(); // choose shape option 1 or 2.
			    	  }
			    	  catch ( InputMismatchException e ) {
			    		System.out.println(" --- Not a legal number ---  Enter a 1, 2, or 0");
			    		System.out.println("Try again: " );
			    	    derp.nextLine(); // clear the buffer
			    	    continue;
			    	  }
			    	  break;
			      }
			if (shape == 0)
				break;
			if (shape != 1 && shape != 2) {
				System.out.println("--- Not a legal number --- Enter 1, 2, or 0.");
				System.out.println("Try again: ");
			shape = 42;}
			else 
				break;
		}
		if (shape == 0)
			break;
	if (shape == 1) {
		System.out.println("Enter the base of the triangle --- enter 0 to quit.");
		while (base == -1) {
			while (true) {
			      try {  // put input statement here
			    	  base = derp.nextDouble(); // enter base.
			    	  }
			    	  catch ( InputMismatchException e ) {
			    	    System.out.println(" --- Not a legal number --- Try again: " );
			    		System.out.println("Enter the base of the triangle --- enter 0 to quit.");
			    	    derp.nextLine(); // clear the buffer
			    	    continue;
			    	  }
			    	  break;
			      }
			if (base == 0)
				break;
			if (base < 0) {
	    	    System.out.println(" --- Cannot be negative --- Try again: " );
	    		System.out.println("Enter the base of the triangle --- enter 0 to quit.");
			base = -1;}
			else 
				break;
		}		
		if (base == 0)
			break;
		System.out.println("Enter the height of the triangle --- enter 0 to quit.");
		while (height == -1) {
			while (true) {
			      try {  // put input statement here
			    	  height = derp.nextDouble(); // enter height.
			    	  }
			    	  catch ( InputMismatchException e ) {
				    	    System.out.println(" --- Not a legal number --- Try again: " );
				    		System.out.println("Enter the height of the triangle --- enter 0 to quit.");
			    	    derp.nextLine(); // clear the buffer
			    	    continue;
			    	  }
			    	  break;
			      }
			if (height == 0)
				break;
			if (height < 0) {
	    	    System.out.println(" --- Cannot be negative --- Try again: " );
	    		System.out.println("Enter the height of the triangle --- enter 0 to quit.");
			base = -1;}
			else 
				break;
		}		
		if (height == 0)
			break;
		System.out.println("The area of the triangle with the base " +base+
				" and height " +height+ " is " +.5*base*height);} // triangle option end
	if (shape == 2) {
			System.out.println("Enter the radius of the circle --- enter 0 to quit.");
			while (radius == -1) {
				while (true) {
				      try {  // put input statement here
				    	  radius = derp.nextDouble(); // enter radius.
				    	  }
				    	  catch ( InputMismatchException e ) {
					    	    System.out.println(" --- Not a legal number --- Try again: " );
					    		System.out.println("Enter the radius of the circle --- enter 0 to quit.");
				    	    derp.nextLine(); // clear the buffer
				    	    continue;
				    	  }
				    	  break;
				      }
				if (radius == 0)
					break;
				if (radius < 0) {
		    	    System.out.println(" --- Cannot be negative --- Try again: " );
		    		System.out.println("Enter the base of the triangle --- enter 0 to quit.");
				radius = -1;}
				else 
					break;
			}		
		if (radius == 0) {
			break;}
	System.out.println("The area of the circle with the radius " +radius+
				" is " +radius*radius*Math.PI);} // circle option end
			}
		System.out.println("Goodbye then."); // if you quit
	}
}