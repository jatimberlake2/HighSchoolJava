import java.util.*;
import java.util.ArrayList;
public class Enter_ArrayZwei {
	public static void main(String[] args) {
	Scanner derp = new Scanner(System.in);
	//for (int k = 0; k > -1; k++) {
	int length = 0;
			System.out.println("Enter the length of the array.");
			 length = derp.nextInt();
		//	 if (length < 0)
			//	 break; 
	ArrayList my_array = new ArrayList();
			System.out.println("Enter integers into the array.");
			for (int i = 0; i < length; i++) {
			int stuff = derp.nextInt();
			my_array.add(new Integer (stuff));
		}
		for(int j = 0; j < my_array.size(); j++) {
			System.out.println(my_array.get(j));	
		}
		//}
	}
}
