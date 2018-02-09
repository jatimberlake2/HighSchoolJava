import java.util.*;
public class THE_RILL_END_OF_ALLTHINGS {

	public static void main(String[] args) {
	
		ArrayList<ArrayList<Integer>> myMatrix  = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> myMatrix2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> myMatrix3 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int storingnum;
			row = new ArrayList<Integer>();
			row2 = new ArrayList<Integer>();
			for (int j = 0; j < 3; j++) {
				storingnum = (int)(99*Math.random());
				row.add(storingnum);
				row2.add(storingnum);
			}
			myMatrix.add(row);
			myMatrix2.add(row2);
			row = new ArrayList<Integer>();
			for (int j = 0; j < 3; j++) {
				row.add(i);
			}
			myMatrix3.add(row);
		}
		
	/*	for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				if (myMatrix.get(i).get(j) < 10) System.out.print(" ");
				System.out.print(myMatrix.get(i).get(j) + " ");
			}
			System.out.print("     ");
			
			for (int j = 0; j < 3; j++) {
				if (myMatrix2.get(i).get(j) < 10) System.out.print(" ");
				System.out.print(myMatrix2.get(i).get(j) + " ");
			}
			System.out.print("     ");
			
			for (int j = 0; j < 3; j++) {
				System.out.print(myMatrix3.get(i).get(j) + " ");
			}
		//	System.out.print("     ");
			
		    System.out.println();
		}
		
		System.out.println();
		
		*/
		
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 3; j++) {
			for (int q = 1; q < 10; q++) {
				int m = 9;
					while (m >= q) {
						if (myMatrix2.get(m - 1).get(j) > myMatrix2.get(m).get(j)) { //determine whether going up or down w/ < or >
							int temp = myMatrix2.get(m).get(j);
							int temp2 = myMatrix3.get(m).get(j);
							myMatrix2.get(m).set(j, myMatrix2.get(m-1).get(j)); 
							myMatrix3.get(m).set(j, myMatrix3.get(m-1).get(j)); 
							myMatrix2.get(m-1).set(j, temp);
							myMatrix3.get(m-1).set(j, temp2);
						}
						m--;
					}
			}
		}
	}
	
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 3; j++) {
			if (myMatrix.get(i).get(j) < 10) System.out.print(" ");
			System.out.print(myMatrix.get(i).get(j) + " ");
		}
		System.out.println();
		
	}
	
	/*	for (int j = 0; j < 3; j++) {
			if (myMatrix2.get(i).get(j) < 10) System.out.print(" ");
			System.out.print(myMatrix2.get(i).get(j) + " ");
		}
		System.out.print("     ");
		
		for (int j = 0; j < 3; j++) {
			System.out.print(myMatrix3.get(i).get(j) + " ");
		}
	//	System.out.print("     ");
		
	    System.out.println();
	}*/
	
	
	
	//NONSENSE!!! ... wow.
	
	
	for (int shortener = 0; shortener <3; shortener++) {
	System.out.println();
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 3; j++) {
				if (myMatrix.get(myMatrix3.get(i).get(shortener)).get(j) <= 9)
				System.out.print(myMatrix.get(myMatrix3.get(i).get(shortener)).get(j)+"  ");
				else
					System.out.print(myMatrix.get(myMatrix3.get(i).get(shortener)).get(j)+" ");
			}
	System.out.println();
		}
	}
	
	}
}
