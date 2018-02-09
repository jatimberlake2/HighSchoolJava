public class Array_Example {	
	public static void main(String[] args) {
		double[] my_array = {3.4, 2.7, 5.4};
		int add_pos = (int)(Math.random()*3);
		System.out.println("add_pos = "+add_pos);
		for(int i = 0; i < my_array.length; i++)
			System.out.println(my_array[i]);
		add_ten(my_array, add_pos);
		System.out.println("add_pos = "+add_pos);
		for(int i = 0; i < my_array.length; i++)
			System.out.println(my_array[i]);
	}
public static void add_ten(double[] array, int add_pos){
	array[add_pos] = array[add_pos]+10;
//	add_pos = add_pos+99;
//	System.out.println(add_pos);
	}
}
