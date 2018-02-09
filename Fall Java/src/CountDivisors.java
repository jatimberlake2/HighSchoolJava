public class CountDivisors {	
	public static void main(String[] args) {
		int most_divisors = 1;
		int answer = 1;
		for (int i = 1; i <= 10000; i++) {
		int divisors = 0;
		for (int j = 1; j <= i; j++) {
		if (i%j==0) divisors++;	
		}
		if (most_divisors < divisors) {
			most_divisors = divisors;
			answer = i;
		}   }
        System.out.println("The number with the most divisors is: "+ answer);
}  }
