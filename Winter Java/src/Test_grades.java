import java.util.*;
public class Test_grades {
	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);
		double grade1, grade2, grade3;
		String name;
		Student obj;
		obj = new Student();
		System.out.println("Current Average: " +obj.getAverage());
		System.out.println("Enter 3 grades to see their average.");
		grade1 = derp.nextDouble();
	//	obj.settest1(grade1);
		obj  = new Student(grade1);
		System.out.println("Current Average: " +obj.getAverage());
		grade2 = derp.nextDouble();
	//	obj.settest2(grade2);
		obj = new Student(grade1, grade2);
		System.out.println("Current Average: " +obj.getAverage());
		grade3 = derp.nextDouble();
	//	obj.settest3(grade3);
	//	obj = new Student(grade1, grade2, grade3);
	//	System.out.println("Final Average: " +obj.getAverage());
		System.out.println(obj.get_String1());
		System.out.println("Enter the Student's name");
		name = derp.next();
		obj = new Student (grade1, grade2, grade3, name);
		System.out.println(obj.get_String1()+"'s average is " +obj.getAverage());
		System.out.println(obj.get_String1());
		obj.setname("Jo");
		System.out.println(obj.get_String1());
		//System.out.println(obj.get_double1()+" ");
		//System.out.println(obj.get_double1()+" "+obj.get_double2());
		//System.out.println(obj.get_double1()+" "+obj.get_double2()+" "+obj.get_double3());

	}

}
