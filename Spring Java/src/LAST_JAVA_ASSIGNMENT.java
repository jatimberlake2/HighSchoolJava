
public class LAST_JAVA_ASSIGNMENT {

	public static void main(String[] args) {
		int[][] myMatrix  = new int[10][3];
		int[][] myMatrix2 = new int[10][3];
		int[][] myMatrix3 = new int[10][3];
		//double[] List = new double[10]; 
	//	for (double i = 0; i < 10; i++) {
	//		List[(int)i] = (int)(10*Math.random());
	//}

	for (int i = 0; i < myMatrix.length; i++) {
		for (int j = 0; j < myMatrix[0].length; j++) {
			myMatrix [i][j] = (int)(99*Math.random());
			myMatrix2[i][j] = myMatrix[i][j];
		if (myMatrix[i][j] <= 9)
			System.out.print(myMatrix[i][j]+"  ");
				else
					System.out.print(myMatrix[i][j]+" ");	
		}
		System.out.println();
	}
//		System.out.println();
	for (int i = 0; i < myMatrix2.length; i++) {
		for (int j = 0; j < myMatrix2[0].length; j++) {
			for (int q = 1; q < 10; q++) {
				int m = 9;
					while (m >= q) {
						if (myMatrix2[m - 1][0] > myMatrix2[m][0]) { //determine whether going up or down w/ < or >
							for (int s = 0; s < myMatrix2[0].length; s++) {
							int temp = myMatrix2[(int)m][s];
							myMatrix2[m][s] = myMatrix2[m - 1][s];
							myMatrix2[m - 1][s] = temp;
							}
						}
						m--;
					}
			}

	//		if (myMatrix2[i][j] <= 9)
	//			System.out.print(myMatrix2[i][j]+"  ");
	//				else
	//					System.out.print(myMatrix2[i][j]+" ");	
		}	
	//	System.out.println();
	}
	
//	System.out.println();
	
	for (int i = 0; i < myMatrix2.length; i++) {
		for (int j = 0; j < myMatrix2[1].length; j++) {
			for (int q = 1; q < 10; q++) {
				int m = 9;
					while (m >= q) {
						if (myMatrix2[m - 1][1] > myMatrix2[m][1]) { //determine whether going up or down w/ < or >
							for (int s = 0; s < myMatrix2[0].length; s++) {
							int temp = myMatrix2[(int)m][s];
							myMatrix2[m][s] = myMatrix2[m - 1][s];
							myMatrix2[m - 1][s] = temp;
							}
						}
						m--;
					}
			}
	//		if (myMatrix2[i][j] <= 9)
	//			System.out.print(myMatrix2[i][j]+"  ");
	//				else
	//					System.out.print(myMatrix2[i][j]+" ");	
		}	
	//	System.out.println();
	}
	
//	System.out.println();
	
	for (int i = 0; i < myMatrix2.length; i++) {
		for (int j = 0; j < myMatrix2[2].length; j++) {
			for (int q = 1; q < 10; q++) {
				int m = 9;
					while (m >= q) {
						if (myMatrix2[m - 1][2] > myMatrix2[m][2]) { //determine whether going up or down w/ < or >
							for (int s = 0; s < myMatrix2[0].length; s++) {
								int temp = myMatrix2[(int)m][s];
								myMatrix2[m][s] = myMatrix2[m - 1][s];
								myMatrix2[m - 1][s] = temp;
							}
						}
						m--;
					}
			}
	//		if (myMatrix2[i][j] <= 9)
	//			System.out.print(myMatrix2[i][j]+"  ");
	//				else
	//					System.out.print(myMatrix2[i][j]+" ");	
		}	
	//	System.out.println();
	}
	for (int i = 0; i < myMatrix.length; i++) {
		for (int j = 0; j < myMatrix[0].length; j++) {
			myMatrix2[i][j] = myMatrix[i][j];
			myMatrix3[i][j] = i;
		}
	}
	System.out.println();
	for (int i = 0; i < myMatrix3.length; i++) {
		for (int j = 0; j < myMatrix3[0].length; j++) {
			for (int s = 0; s < 3; s++) {
				for (int q = 1; q < 10; q++) {
					for (int m = 9; m >= q; m--) {
						if (myMatrix2[m - 1][s] > myMatrix2[m][s]) {
								int temp = myMatrix2[m][s];
								myMatrix2[m][s] = myMatrix2[m - 1][s];
								myMatrix2[m - 1][s] = temp;
								int temp2 = myMatrix3[m][s];
								myMatrix3[m][s] = myMatrix3[m - 1][s];
								myMatrix3[m - 1][s] = temp2;
								}
							}						
					}
			}
			System.out.print(myMatrix3[i][j]+" ");
			}
	System.out.println();
		}

	
	//NONSENSE!!! ... wow.
	
	
	for (int shortener = 0; shortener <3; shortener++) {
	System.out.println();
	for (int i = 0; i < myMatrix.length; i++) {
		for (int j = 0; j < myMatrix[0].length; j++) {
			if (myMatrix[myMatrix3[i][shortener]][j] <= 9)
				System.out.print(myMatrix[myMatrix3[i][shortener]][j]+"  ");
				else
					System.out.print(myMatrix[myMatrix3[i][shortener]][j]+" ");	
			}
	System.out.println();
		}
	}
	
	}
}
