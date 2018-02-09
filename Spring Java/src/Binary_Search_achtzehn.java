import java.util.*;
public class Binary_Search_achtzehn {

	public static void main(String[] args) {
		Scanner derp = new Scanner (System.in);
		int[] search_list = {1, 12, 17, 19, 23};
		int right = search_list.length - 1, left = 0, place = -1;
		boolean found = false;
	System.out.println("Enter an integer to search for in the array.");
			int myInt = derp.nextInt();
		while (right >= left) {
			int middle = (left + right)/2;
				if (myInt == search_list[middle]) {
					found = true;
					place = middle;
					break;
				}
				else
					if (myInt > search_list[middle])
						left = middle + 1;
					else
						right = middle - 1;
		}
			if (found)
				System.out.println("The integer " + myInt + " was found at place " + (place) + ".");
			else
				System.out.println("The integer " + myInt + " could not be found.");
		
	}

}
