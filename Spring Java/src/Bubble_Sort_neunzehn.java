
public class Bubble_Sort_neunzehn {

	public static void main(String[] args) {
	double[] List = new double[10]; 
		for (double i = 0; i < 10; i++) {
			List[(int)i] = (int)(10*Math.random());
	}
		for (int k = 0; k < 10; k++) {
			System.out.print((int)List[(int)k] + " ");
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			int j = 9;
				while (j >= i) {
					if (List[j - 1] < List[j]) { //determine whether going up or down w/ < or >
						double temp = List[(int)j];
						List[j] = List[j - 1];
						List[j - 1] = temp;
					}
					j--;
				}
		}
		for (int k = 0; k < 10; k++) {
			System.out.print((int)List[(int)k] + " ");
		}
	}

}
