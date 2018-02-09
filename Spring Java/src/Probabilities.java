
public class Probabilities {
	public static void main(String[] args) {
		double chance = 0, pickle = 1;
		for (double i = 0; i < 365; i++) {
			pickle *= (365 - i)/365;
			chance = 1 - pickle;
			System.out.println("Birthday " + (int)(i + 1) + " : " + chance);
		}	
	}

}
