import java.util.Scanner;
public class Beluga {
	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);
	while (true) {
		int length;
		String letter;
		System.out.println("Enter a character.");
		letter = derp.next();
		System.out.println("Enter the number of times you want it to repeat.");
		length = derp.nextInt();
		System.out.println(Numbers_Letters(letter.charAt(0), length));
		System.out.println();
		}
	}
	public static String Numbers_Letters(char letter, int length){
		/**
		 * Calculates how many times the string entered is repeated and returns
		 * 	what is to be printed in the main routine.
		 * 
		 * Preconditions: The parameter length is a non-negative integer and the
		 * 	parameter letter is a char.
		 * Postconditions: A string will be returned with the char repeated the number
		 * 	of times desired by the user.
		 *  
		 *  
		 */
		int i;
		String printed_letters = "";
		if (length == 0)
			return ""; 
		for (i = 0; i < length; i++) {
			printed_letters = printed_letters + letter;
		}
		return printed_letters;
	}
}
