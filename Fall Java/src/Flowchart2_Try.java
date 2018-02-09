import java.util.Scanner;
public class Flowchart2_Try {
	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);
		while (true) {
			boolean prime = true;
			int number = 0;
			int i;
			System.out.println("Enter a positive integer to test to see if it is prime or -1 to quit.");
			System.out.println("If the number is not prime, the largest prime factor will be displayed.");
			number = derp.nextInt();
			if (number == -1)
				break;
			for (i = 2 ; i < number; i++) {
				if (number%i == 0)
					prime = false;
				{ //highfac = i;
					//for (i = 1 ; i < (int)Math.sqrt(number) +1; i++)
						//if (number%i == 0)
							
				}
						}
			if (prime == true) {
				System.out.println("The number " +number+ " is prime.");
			}
			else
				System.out.println(i);
				}
				System.out.println("Goodbye then.");
	}
		}
