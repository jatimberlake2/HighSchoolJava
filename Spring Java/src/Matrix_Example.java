public class Matrix_Example {

	public static void main(String[] args) {
		int[][] myMat = { {1, 2, 3, 4},
						  {5, 6, 7, 8},
		                  {9,10,11,12} };
		for (int i = 0; i < myMat.length; i++) {
			for (int j = 0; j < myMat[0].length; j++) {
				System.out.print(myMat[i][j]+" ");
			}
			System.out.println();
		}
	}

} 
