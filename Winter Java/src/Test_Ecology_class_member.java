import java.util.*;
public class Test_Ecology_class_member {
	public static void main(String[] args) {
	Scanner derp = new Scanner(System.in);
	double dues;
	String name;
	Ecology_club_member obj;
	obj = new Ecology_club_member();
	System.out.println(obj.get_dues());
	System.out.println(obj.get_name());
	System.out.println();
	
	System.out.println("Enter the name.");
	name = derp.nextLine();
	obj = new Ecology_club_member(name);
	System.out.println(obj.get_dues());
	System.out.println(obj.get_name());
	System.out.println();
	
	System.out.println("Enter the dues.");
	dues = derp.nextDouble();
	obj = new Ecology_club_member(dues);
	System.out.println(obj.get_dues());
	System.out.println(obj.get_name());
	System.out.println();
	
	System.out.println("Enter the dues and then the name.");
	dues = derp.nextDouble();
	name = derp.nextLine();

	obj = new Ecology_club_member(name, dues);
	System.out.println();
	System.out.println(obj.get_dues());
	System.out.println(obj.get_name());
	}
	
	/////////////
	
}