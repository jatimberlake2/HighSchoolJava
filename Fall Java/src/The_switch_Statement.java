public class The_switch_Statement{
	public static void main(String[] args) {
		int i ;
		for (i = 0; i < 3; i = i++) {
			switch(i) {
 			    case 0: System.out.println(i + " is zero"); break;
			    case 1: System.out.println(i + " is one"); break;
			    default: System.out.println(i + " is not zero or one"); 
			}
		}
		System.out.println("Bye");
	}
}
