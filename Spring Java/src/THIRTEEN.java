import java.util.*;
public class THIRTEEN {
	public static void main(String[] args) {
		double chance = 0, pickle = 1, A, B, C = 0.0, D = 0.0;
		double[] Awesome = new double[365];
		for (double i = 0; i < 365; i++) {
			pickle *= (365 - i)/365;
			chance = 1 - pickle;
			A = (int) (i + 1);
			B = chance;
			Awesome[(int) i] = B;
			if (i > 0) {
				C = Awesome[(int) i] - Awesome[(int) (i - 1)];
			}	
			D = A*C + D;
			System.out.println("(A): " + (int)A + " (B): " + B + " (C): " + C + " (D): " + D);
		}	
	}

}
