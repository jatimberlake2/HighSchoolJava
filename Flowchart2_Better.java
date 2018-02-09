import java.util.Scanner;
public class Flowchart2_Better {

	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);
	while (true) {
		boolean prime = true;
		boolean prime2 = false;
		int number = 0;
		int i, n, j, GPF = 2;
		System.out.println("Enter a positive integer to test to see if it is prime or -1 to quit.");
		System.out.println("If the number is not prime, the prime factors will be displayed.");
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
		for (n = 2; n <= number; n++) {
			if (number%n == 0) { 
			//System.out.print(number);
			//System.out.print("n is " +n+ ". ");
				for (j = 2 ; j < (int)Math.sqrt(n) + 1; j++)
					if (n%j == 0)
						prime2 = true;
					if (prime2 == false)
								GPF = n;
			//System.out.print("j is " +j+ ". ");
			//System.out.print("GPF is " +GPF+ ". ");
			}
		}
		System.out.print("The greatest prime factor of " +number+ " is " +GPF+ ".");
		System.out.println();
	  }
	}
	System.out.println("Goodbye then.");
}
}
