public class SIXTEEN {

	public static void main(String[] args) {
		int[][] myMat = { {1, 2, 3},
				          {4, 5, 6},
		                  {7, 8, 9} };
		for (int i = 2; i >= 0; /* myMat.length; */ i--) {
			for (int j = 2; j >= 0; /* myMat[0].length; */ j--) {
				System.out.print(myMat[j][i]+" ");
			}
			System.out.println();
		}
	}

} 
