import java.util.Scanner;
public class Flowchart2 {
	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);
	while (true) {
		boolean prime = true;
		int number = 0;
		int i = 2;
		System.out.println("Enter a positive integer to test to see if it is prime or -1 to quit.");
		number = derp.nextInt();
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
		System.out.println("The number " +number+ " is not prime.");
		}
	  }
			System.out.println("Goodbye then.");
	}

}
