import java.util.Scanner;
public class Second_Exam {
	public static void main(String[] args) {
			Scanner derp = new Scanner(System.in);
		int first, second, i;
		while (true) {
		System.out.println("Enter two positive integers or -1 to quit.");
		first = derp.nextInt();
		if (first == -1)
			break;
		second = derp.nextInt();
		for (i = first; i <= second; i++)
			System.out.print(i+ " ");
			System.out.println();
		}
		System.out.println("Goodbye");
	}

}
