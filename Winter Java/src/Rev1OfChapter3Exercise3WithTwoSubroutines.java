import java.util.*;
//import java.lang.*;
public class Rev1OfChapter3Exercise3WithTwoSubroutines {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = null;
		int i = 0;
		char myOperator = ' ';
		double leftOperand = 0.0;
		double rightOperand = 0.0;
		
		while (true) {
			System.out.println("Enter an expression --- # to stop: ");
			input = scan.nextLine();	
			
			for (i = 0; i < input.length(); i++){
				myOperator = input.charAt(i);
				if (myOperator == '#') break; 
			}
			if (myOperator == '#') break; 	
			
			for (i = 0; i < input.length(); i++){
				myOperator = input.charAt(i);
				if (myOperator == '+' ||
					myOperator == '-' ||
					myOperator == '*' ||
					myOperator == '/') break; 
			}
			double result = 0.0;
			try {
				result = getOperand(input, 0, i);
			}
			catch ( InputMismatchException e ) {
				System.out.println( e + " --- Not a legal number --- Try again: ");
				continue;
			}
		   // if (result == -1) continue;
		 
			leftOperand = result;			
		    
		    try {
		    	result = getOperand(input, i+1, input.length());	
			}
			catch ( InputMismatchException e ) {
				System.out.println( e + " --- Not a legal number --- Try again: ");
				continue;
			}	
			
		    rightOperand = result;		    
		//    if (result == -1) continue;
		    double result2 = 0.0;	
		    
		    try {
			result2 = calculator (leftOperand, myOperator, rightOperand);
		    }
		    catch ( InputMismatchException e ) {
				System.out.println( e + " --- Try again: ");
				continue;
			}	
			System.out.print("The result of "+ input + " is "+result2+" .");
			System.out.println();
		}
		System.out.println("Good bye");
	}
	
	public static double calculator(double leftOperand, char myOperator, double rightOperand) {
		double result = 0.0;
		switch (myOperator){
		case '+': result = (leftOperand+rightOperand);
				  break;
		case '-': result = (leftOperand-rightOperand);
				  break;
		case '*': result = (leftOperand*rightOperand);
		          break;
		case '/': result = (leftOperand/rightOperand);
		          break;
		default:  throw new InputMismatchException("Expression not valid.");      
		}
		return result;
	}
	public static double getOperand (String input, int left_marker, int right_marker){
		double result = 0;	
		try {	
			result = new Double(input.substring(left_marker, right_marker));
		}	
		catch ( NumberFormatException e ) {
			System.out.println( e + " --- Not a legal number --- Try again: ");		
			throw new InputMismatchException("Expression is not valid.");
		}
		return result;
	}
}
