
public class August30_2010 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("num1 = "+ num1+ " num2 = "+ num2);
		int temp = 0; // temp must be declared
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = "+num1+" num2 = "+num2);
		num1 = num1^num2;
		num2 = num1^num2;
		num1 = num1^num2;
		System.out.println("num1 = "+num1+" num2 = "+num2);
		}
	}