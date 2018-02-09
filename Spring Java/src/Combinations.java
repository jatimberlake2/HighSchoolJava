import java.util.*;
public class Combinations {
	public static void main(String[] args) {
		int dimension, i = 0, pointer = 0;
		Scanner derp = new Scanner (System.in);
		System.out.println("Enter the dimension.");
		dimension = derp.nextInt();
		int[] myArray = new int[dimension];
		while (i < myArray.length) {
			myArray[i] = 1;
			i++;
		}
		pointer = myArray.length - 1;
		System.out.println(pointer);			
			for (i = 0; i < Math.pow(myArray.length, myArray.length); i++) {
				for (int j = 0; j < myArray.length; j++) {
					System.out.print(myArray[j] + " ");
				}
				System.out.println();
				for (; myArray[pointer] == myArray.length;) {
					myArray[pointer] = 1;
					pointer--;
					if (pointer < 0)
						break;
					}
						if (pointer < 0)
							break;
						else if (pointer >= 0) {
							myArray[pointer]++;
							pointer = myArray.length - 1;
						}
					}				
	}
}
