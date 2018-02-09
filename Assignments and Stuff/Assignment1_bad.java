import java.util.Scanner;
public class Assignment1 {
	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);		
		int width, line_width, blanks_width;
		String letter;
		line_width = 3;
		blanks_width = 3;
		width = 4;
		System.out.println("Enter X, Y, Z, or V to see it printed out in asterisks.");
		letter = derp.next();
			Print_letters(letter.charAt(0), width, line_width, blanks_width);
	}
	
public static void Print_letters(char ch, int width, int line_width, int blanks_width)
	{
	if (ch == 'x' || ch == 'X') {
		int i, j, k;
		if (width/2*2 == width) {
			width++;
		}
			for (i = 0; i < width; i++) {
				for (j = 0; j < 2*(width/2 - Math.abs(width/2 - i)); j = j + 2)
				{
					for (k = 0; k < blanks_width; k++) {
							System.out.print(" ");
					}
				}
					for (k = 0; k < line_width; k++) {
							System.out.print("*");
				}
				for (j = 0; j < 4*(Math.abs(width/2 - i)) - 2; j = j + 2) {
					for (k = 0; k < blanks_width; k++) {
							System.out.print(" ");
					}
				}
				if (i == width/2)
					System.out.println(" ");
				String h = "*";
				String o = "*";
				for (k = 1; k < line_width; k++) {
					h = h+o;
				}
				if (i != width/2)
					System.out.println(h);		
			}
	}
	if (ch == 'v' || ch == 'V') {
		int i, j, k;
		if (width/2*2 == width) {
			width++;
		}
			for (i = 0; i < (width/2) + 1; i++) {
				for (j = 0; j < 2*(width/2 - Math.abs(width/2 - i)); j = j + 2)
				{
					for (k = 0; k < blanks_width; k++) {
							System.out.print(" ");
					}
				}
					for (k = 0; k < line_width; k++) {
							System.out.print("*");
				}
				for (j = 0; j < 4*(Math.abs(width/2 - i)) - 2; j = j + 2) {
					for (k = 0; k < blanks_width; k++) {
							System.out.print(" ");
					}
				}
				if (i == width/2)
					System.out.println(" ");
				String h = "*";
				String o = "*";
				for (k = 1; k < line_width; k++) {
					h = h+o;
				}
				if (i != width/2)
					System.out.println(h);		
			}
}
	if (ch == 'y' || ch == 'Y') {
		int i, j, k;
		if (width/2*2 == width) {
			width++;
		}
			for (i = 0; i < (width/2) + 1; i++) {
				for (j = 0; j < 2*(width/2 - Math.abs(width/2 - i)); j = j + 2)
				{
					for (k = 0; k < blanks_width; k++) {
							System.out.print(" ");
					}
				}
					for (k = 0; k < line_width; k++) {
							System.out.print("*");
				}
				for (j = 0; j < 4*(Math.abs(width/2 - i)) - 2; j = j + 2) {
					for (k = 0; k < blanks_width; k++) {
							System.out.print(" ");
					}
				}
				if (i == width/2)
					System.out.println(" ");
				String h = "*";
				String o = "*";
				for (k = 1; k < line_width; k++) {
					h = h+o;
				}
				if (i != width/2)
					System.out.println(h);
			}
		for (j = 0; j < width/2; j++) {
			for (i = 0; i < width/2; i++)
			{
				for (k = 0; k < blanks_width; k++) {
						System.out.print(" ");
				}
			}
				for (k = 0; k < line_width; k++) {
						System.out.print("*");
			}
			System.out.println();
		}
	} 
	if (ch == 'z' || ch == 'Z') {
		int i, j, k, m, not_spaces;
		if (width/2*2 == width) {
			for (i = 0; i < (width*line_width); i++) {
				System.out.print("*");
			}
		}
		else
			for (i = 0; i < (width*line_width) - line_width; i++) {
				System.out.print("*");
				}
			System.out.println();
			  if (width/2*2 == width) 
					width++;
			for (m = line_width; m < width; m++) {
				not_spaces = m;
			for (j = 0; j < width - not_spaces; j++) { 
				for (k = 0; k < blanks_width; k++) {
					System.out.print(" ");
			}
			}
			for (k = 0; k < line_width; k++) {
					System.out.print("*");
			}
			System.out.println();
			}
		if (width/2*2 == width) 
			for (i = 0; i < width; i++) {
				for (k = 0; k < line_width; k++) {
					System.out.print("*");
				}
			}
		
		else
			for (i = 0; i < width - 1; i++) {
				for (k = 0; k < line_width; k++) {
					System.out.print("*");
		}
				}
			}
		}
	}