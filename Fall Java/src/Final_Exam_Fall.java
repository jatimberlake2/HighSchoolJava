import java.util.Scanner;
public class Final_Exam_Fall {
	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);
		while (true) 
		{
			int num1, num2, i, sum = 0, evensum = 0, oddsum = 0, numeven = 0, numodd = 0;
			boolean evens = true;
			System.out.println("Enter two positive integers or -1 to quit.");
		 num1 = derp.nextInt();
		 	if (num1 == -1)
		 		break;
		 num2 = derp.nextInt();
		 if (num1 < num2) {
		 	for (i = num1; i <= num2; i++) {
			  	sum = sum + i;
			  		if (i%2 == 0)
			  		{
			  			numeven++;
			  			evensum = evensum + i;
			  		}
			  		else
			  		{
			  			numodd++;
			  			oddsum = oddsum + i;
			  		}
				 }
		 }
		 if (num1 == num2) {
			 sum = num1 + num2;
	  		if (num1%2 == 0)
	  			evens = true;
	  		else
	  			evens = false;
		 }
		 else
		 { 
			 for (i = num1; i >= num2; i--) {
				 sum = sum + i;
			  		if (i%2 == 0)
			  		{
			  			numeven++;
			  			evensum = evensum + i;
			  		}
			  		else
			  		{
			  			numodd++;
			  			oddsum = oddsum + i;
			  		}
				}
		 	}
	System.out.println("The sum of the numbers between " +num1+ " and " +num2+ " is " +sum+ ".");
if (num1 != num2) {
	System.out.println("The average of even numbers is " +evensum/numeven+ " and the average of odd numbers is " +oddsum/numodd+ ".");
}
else
{
	if (evens == true)
	System.out.println("The average of even numbers is " +num1+ " and the average of odd numbers is 0.");
	else
	System.out.println("The average of even numbers is 0 and the average of odd numbers is " +num1+ ".");
}	
}
		 System.out.println("Goodbye.");
	}
}
