public class Flag_Example{
		public static void main(String[] args) {
			boolean flag; int i = 0;
			while (i < 10) {
				if (i%3==0) flag = true;  else flag = false; // set
					if (flag) System.out.println("i = "+i); // tested
					i++;
			}
			System.out.println("Bye");
	  	}
	}
