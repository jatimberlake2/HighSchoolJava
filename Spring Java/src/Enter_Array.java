import java.util.*;
public class Enter_Array {
	public static void main(String[] args) {
	Scanner derp = new Scanner(System.in);
	for (int k = 0; k > -1; k++) {
	int length = 0;
			System.out.println("Enter the length of the array.");
			 length = derp.nextInt();
			 if (length < 0)
				 break;
		double[] my_array = new double[length];
			System.out.println("Enter values into the array.");
			for (int i = 0; i < my_array.length; i++) {
			my_array[i] = derp.nextDouble();
		}
		for(int j = 0; j < my_array.length; j++) {
			System.out.println(my_array[j]);	
		}
		}
	}
}
