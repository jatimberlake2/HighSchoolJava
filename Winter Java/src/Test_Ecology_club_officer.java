import java.util.*;
public class Test_Ecology_club_officer {
	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);
		double dues;
		String name;
		int phone_number = 0;
		Ecology_club_officer obj;
		obj = new Ecology_club_officer();
		System.out.println(obj.get_dues());
		System.out.println(obj.get_name());
		System.out.println(obj.get_number());
		System.out.println();
		
		System.out.println("Enter the name.");
		name = derp.nextLine();
		obj = new Ecology_club_officer(name);
		System.out.println(obj.get_dues());
		System.out.println(obj.get_name());
		System.out.println(obj.get_number());
		System.out.println();
		
		System.out.println("Enter the dues.");
		dues = derp.nextDouble();
		obj = new Ecology_club_officer(dues);
		System.out.println(obj.get_dues());
		System.out.println(obj.get_name());
		System.out.println(obj.get_number());
		System.out.println();
		
		System.out.println("Enter the dues and then the name.");
		dues = derp.nextDouble();
		name = derp.nextLine();

		obj = new Ecology_club_officer(name, dues);
		System.out.println();
		System.out.println(obj.get_dues());
		System.out.println(obj.get_name());
		System.out.println(obj.get_number());
		
	
		System.out.println("Change phone number");
	//	phone_number = derp.nextInt();
		obj = new Ecology_club_officer(phone_number);
		obj.setdues(12);
		obj.setname("Bob");
		obj.setnumber(9000);
		System.out.println(obj.get_dues());
		System.out.println(obj.get_name());
		System.out.println(obj.get_number());
		System.out.println();
		
		System.out.println("Change name/number");
		//name = derp.nextLine();
		obj = new Ecology_club_officer(name, phone_number);
		obj.setdues(21);
		obj.setname("Jeff");
		obj.setnumber(800);
		System.out.println(obj.get_dues());
		System.out.println(obj.get_name());
		System.out.println(obj.get_number());
		System.out.println();
		
		System.out.println("Change dues/numer");
		//dues = derp.nextDouble();
		obj = new Ecology_club_officer(dues, phone_number);
		obj.setdues(99);
		obj.setname("Fred");
		obj.setnumber(162);
		System.out.println(obj.get_dues());
		System.out.println(obj.get_name());
		System.out.println(obj.get_number());
		System.out.println();
		
		System.out.println("Change all");
		obj.setdues(93845);
		obj.setname("Jeff");
		obj.setnumber(897);
		//dues = derp.nextDouble();
		//name = derp.nextLine();
	
		obj = new Ecology_club_officer(name, dues, phone_number);
		System.out.println();
		System.out.println(obj.get_dues());
		System.out.println(obj.get_name());
		System.out.println(obj.get_number());
		}
		
}
