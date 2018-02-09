public class SEVENTEEN {

	public static void main(String[] args) {
		int[][] myMat = { {1, 2, 3},
				          {4, 5, 6},
		                  {7, 8, 9} };
		
			System.out.println("#1");
		for (int i = 2; i >= 0; /* myMat.length; */ i--) {
			for (int j = 0; j < myMat[0].length; j++) {
				System.out.print(myMat[j][i]+" ");
					}
			System.out.println();
		}
		
		
		System.out.println("#2");
		for (int i = 2; i >= 0; /* myMat.length; */ i--) {
			for (int j = 2; j >= 0; /* myMat[0].length; */ j--) {
				System.out.print(myMat[i][j]+" ");
			}
			System.out.println();
		}	
		
		
			System.out.println("#3");
		for (int i = 0; i < myMat.length; i++) {
			for (int j = 2; j >= 0; /* myMat[0].length; */ j--) {
				System.out.print(myMat[j][i]+" ");
			}
			System.out.println();
		}
		
		
		
			System.out.println("#4");
		for (int i = 0; i < myMat.length;  i++) {
			for (int j = 2; j >= 0; /* myMat[0].length; */ j--) {
				System.out.print(myMat[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("#5");
		for (int i = 0; i < myMat.length;  i++) {
			for (int j = 0; j < myMat[0].length;  j++) {
				System.out.print(myMat[j][i]+" ");
			}
			System.out.println();
		}

		
		
		
		System.out.println("#6");
		for (int i = 2; i >= 0; /* myMat.length; */ i--) {
			for (int j = 0; j < myMat[0].length; j++) {
				System.out.print(myMat[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("#7");
		for (int i = 2; i >= 0; /* myMat.length; */ i--) {
			for (int j = 2; j >= 0; /* myMat[0].length; */ j--) {
				System.out.print(myMat[j][i]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Original");
		for (int i = 0; i < myMat.length;  i++) {
			for (int j = 0; j < myMat[0].length;  j++) {
				System.out.print(myMat[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

} 
