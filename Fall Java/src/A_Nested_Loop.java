public class A_Nested_Loop{
		public static void main(String[] args) {
			int i = 0, j = 0;
			while (i < 3)  {
				j = 0;
				while (j < 3) { 
					System.out.println("i = "+i+" j = "+j);
					j++;
				}
				i++;	
			}
			System.out.println("Bye");
	  	}
	} // output on the next slide
