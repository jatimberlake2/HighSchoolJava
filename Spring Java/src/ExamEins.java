import java.util.*;
public class ExamEins {
	public static void main(String[] args) {
		Scanner derp = new Scanner (System.in);
		int value = 0;
		int[] derpaherp = new int[10];
		for (int j = 0; j < derpaherp.length; j++) {	
			derpaherp[j] = (int) (Math.random()*10+1);
		}
		for (int k = 0; k < derpaherp.length; k++) {
				System.out.print(derpaherp[k] + " ");
				}
		System.out.println();
		for (int i = 0; i < derpaherp.length; i++) {
			if (derpaherp[i]%5 == 0)
				System.out.print(derpaherp[i] + " ");
		}
		
		ArrayList herpaderp = new ArrayList();
		System.out.println();
		System.out.println("Enter the size of the Array list: ");
		int size = 0;
		size = derp.nextInt();
			for (int m = 0; m < size; m++) {
				herpaderp.add((int)Math.random()*10+1);
				System.out.print(herpaderp.get(m) + " ");
		}
			System.out.println();
			for (int q = 0; q < size; q++) {

				if ((Integer) herpaderp.get(q)%2 != 0)
					value = q;

			}
			System.out.print(value + " ");
	}
}
