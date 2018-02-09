import java.util.*;
public class Chapter3Exercise3WithTwoSubroutines {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = null;
		int i = 0;
		char myOperator = ' ';
		Double leftOperand = 0.0;
		Double rightOperand = 0.0;
		
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
			
			
			String result = getOperand (input, 0, i);

			if (result.compareTo("error")==0) continue;
			
			leftOperand = Double.valueOf(result);
			
			result = getOperand (input, i+1, input.length());

			if (result.compareTo("error")==0) continue;
			
			rightOperand = Double.valueOf(result);
			
			result = calculator (leftOperand, myOperator, rightOperand);
			
			if (result.compareTo("error")==0) continue;
			
			System.out.print("The result of "+ input + " is "+result+" .");
			
			System.out.println();
		}
		System.out.println("Good bye");
	}
	
	public static String calculator (double leftOperand, char myOperator, double rightOperand) {
		String result = new String("error");
		switch (myOperator){
		case '+': result = new String(""+(leftOperand+rightOperand));
				  break;
		case '-': result = new String(""+(leftOperand-rightOperand));
				  break;
		case '*': result = new String(""+(leftOperand*rightOperand));
		          break;
		case '/': result = new String(""+(leftOperand/rightOperand));
		          break;
		default:  System.out.println("Please try again.");
		      
		
		}
		return result;
		}
	
	public static String getOperand (String input, int left_marker, int right_marker) {
		String result = new String("error");
		try {
	//		Double leftOperand = new Double(input.substring(left_marker,right_marker));
		}

		catch (StringIndexOutOfBoundsException e) {
			System.out.println( e + " --- Not a legal expression --- Try again: ");
			return result;
		}

		catch ( NumberFormatException e ) {
			System.out.println( e + " --- Not a legal number --- Try again: ");
			return result;
		}

		return input.substring(left_marker,right_marker);
	}

}