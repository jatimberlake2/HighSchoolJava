public class Break_Example{
		public static void main(String[] args) {
			int PowerLevel = 0;
			while (true) {
					System.out.println("The scouter says: "+PowerLevel); 
					if (PowerLevel > 9000) break;
					PowerLevel++;
			}
			System.out.println("IT'S OVER NINE THOUSAND!!!!");
	  	}
	}