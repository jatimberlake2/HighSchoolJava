import java.util.*;
public class Palindrome {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	while (true) {	
				boolean palindrome = true;
				System.out.println("Enter a string to test: ");
				String line = scan.nextLine();
		for (int i = 0; i < line.length()/2;i++)
			if (line.charAt(i)!= line.charAt(line.length()- 1 - i))
				palindrome = false;
		if (palindrome) System.out.println(line+" is a palindrome.");
		else System.out.println(line+" is not a palindrome.");
					}
	}	
}
