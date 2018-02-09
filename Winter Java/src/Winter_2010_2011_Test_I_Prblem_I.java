import java.util.*;
public class Winter_2010_2011_Test_I_Prblem_I {
	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);		
		System.out.println("Enter a string: ");
		String input = derp.nextLine();
		System.out.println(Reverse_Words(input));
		}
	public static String Reverse_Words(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++)
			output = input.charAt(i) + output;
		return output;
	}

}
