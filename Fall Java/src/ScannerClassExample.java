	import java.util.Scanner;
public class ScannerClassExample {
	public static void main(String[] args) {
	Scanner myScanner = new Scanner (System.in);
		String myString = null;
	System.out.println("Enter a line of text:");
		myString = myScanner.nextLine(); // type a line
		System.out.println(myString);	  // print the line
	}
}


