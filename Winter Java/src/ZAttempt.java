import java.util.Scanner;
public class ZAttempt {

	public static void main(String[] args) {
		char zee = 'z';
		int width;
		int line_width;
		int blanks_width;
		Scanner scan = new Scanner(System.in);
		System.out.println("Width =");
		width = scan.nextInt();
		System.out.println("Line width =");
		line_width = scan.nextInt();
		System.out.println("Blanks width =");
		blanks_width = scan.nextInt();
		Print_Letters_Z(zee, width, line_width, blanks_width);
	}
	public static void Print_Letters_Z(char ch, int width, int line_width, int blanks_width) {
		for (int i = 0; i < (width * line_width); i++) {
			System.out.print("*");
		}
		System.out.println();
			for (int j = width - 2; j > 0; j--) {
				for (int k = 0; k < j * blanks_width; k++) {
					System.out.print(" ");
				}
				for (int k = 0; k < line_width; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		for (int i = 0; i < (width * line_width); i++) {
			System.out.print("*");
		}
	}

}
