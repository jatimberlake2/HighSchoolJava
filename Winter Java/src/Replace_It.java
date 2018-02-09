import java.util.Scanner;
public class Replace_It {
		public static void main(String[] args) {
			Scanner derp = new Scanner(System.in);
		while (true) {
			String letter;
			char letter1 = 'e';
			char letter2 = 'r';
			System.out.println("Enter a string or type \"quit\" to quit.");
			letter = derp.nextLine();
			if (letter.equalsIgnoreCase("quit"))
				break;
			else
			System.out.println(Replace_Letters(letter1, letter2, letter));
			System.out.println();
			}
		System.out.println("Goodbye.");
		}
		public static String Replace_Letters(char letter1, char letter2, String letter) {
			int i;
			String dif_letter = "";
			boolean replace = true;
			for (i = 0; i < letter.length(); i++) {
				if (letter.charAt(i) == letter1)
					replace = true;
				else
					break;
			}
		if (replace == true)
			for (i = 0; i < letter.length(); i++) {
				if (letter.charAt(i) != letter1) {
					 dif_letter = dif_letter + letter.charAt(i);
				}
			else
				dif_letter = dif_letter + letter2;
				}
			return dif_letter;
		}
}
