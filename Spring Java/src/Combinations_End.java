//import java.util.*;
public class Combinations_End {
	public static void main(String[] args) {
		int dimension = 3, i = 0, pointer = 0;
		//Scanner derp = new Scanner (System.in);
		//System.out.println("Enter the dimension.");
		//dimension = derp.nextInt();
		int[] myArray = new int[dimension];
		char[] charArray = {'e','n','d'};
		while (i < myArray.length) {
			myArray[i] = 1;
			i++;
		}
		pointer = myArray.length - 1;			
			for (i = 0; i < Math.pow(myArray.length, myArray.length); i++) {
				boolean match = true;
				for (int j = 0; j < myArray.length; j++) {
					for (int k = 0; k < myArray.length; k++) {
						for (int l = 0; l < myArray.length; l++) {
							if (myArray[l] == myArray[k] && k != l)
								match = false;
						}
						if (match == false)
							break;
					}
					if (match == false)
						break;
					System.out.print(charArray[myArray[j] - 1] + " ");
				}
				if (match == true)
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


// Yes. :D