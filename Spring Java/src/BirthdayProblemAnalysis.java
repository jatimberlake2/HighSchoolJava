
public class BirthdayProblemAnalysis {

	public static void main(String[] args) {
		double value = 0; // outside the loop
		int N = 3;
		for (int i = 0; i < 4; i++) {
		value = (1 - value) * ( i /(1.0* N) ) + value; 			// inside the loop 
        	System.out.println("Try "+ (i+1) + " : " + value);		// value should be a double
		}												// multiply 1.0 times N to create a double
        	int k = 0, pointer = 0;
    		int[] myArray = {1, 1, 1};
    		double[] myOtherArray = new double[3];
    	/*	while (k < myArray.length) {
    			myArray[k] = 1;
    			k++;
    		} */
    		pointer = myArray.length - 1;
    		//System.out.println(pointer);			
    			for (k = 0; k < Math.pow(myArray.length, myArray.length); k++) {
    				for (int j = 0; j < myArray.length; j++) {
    				//	System.out.print(myArray[j] + " ");
    				}
    				//System.out.println();
    				for (; myArray[pointer] == myArray.length;) {
    					myArray[pointer] = 1;
    					pointer--;
    					if (pointer < 0)
    						break;
    					}
    						if (pointer < 0)
    							break;
    						else if (pointer >= 0) {
    							myArray[pointer]++;
    							pointer = myArray.length - 1;
    						}
    						if (myArray[0] == myArray[1])
    							myOtherArray[0]++;
    						else if (myArray[0] == myArray[2] || myArray[1] == myArray[2])
    							myOtherArray[1]++;
    						else
    							myOtherArray[2]++;
    					}
    				System.out.println("Percentage after 1 draw : 0.0");
    				System.out.println("Percentage after 2 draws: " + ((myOtherArray[0] + 1)/27));
    				System.out.println("Percentage after 3 draws: " + (myOtherArray[1]/27));
    				System.out.println("Percentage after 4 draws: " + (myOtherArray[2]/27));
    			}
		}


