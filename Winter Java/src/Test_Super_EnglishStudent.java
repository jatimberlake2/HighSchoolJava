public class Test_Super_EnglishStudent {
	public static void main(String[] args) {
	EnglishStudent obj1 = new EnglishStudent(1);
	EnglishStudent obj2 = new EnglishStudent(2, 3);	
	EnglishStudent obj3 = new EnglishStudent(4, 5, 6);
	EnglishStudent obj = new EnglishStudent(7, 8, 9, null);
	
	EnglishStudent obj4 = new EnglishStudent(10, 11, 12, 13);
	
	System.out.println("obj: 0, 0, 0, null");
	System.out.println(obj.get_grade1() );
	System.out.println(obj.get_grade2() );
	System.out.println(obj.get_grade3() );
	System.out.println(obj.get_name() );
//	System.out.println(obj.get_English_score() );
	System.out.println();
	obj.setname("Fred");
	obj.settest1(23.5);
	obj.settest2(88);
	obj.settest3(99);
	
	System.out.println(obj.get_grade1() );
	System.out.println(obj.get_grade2() );
	System.out.println(obj.get_grade3() );
	System.out.println(obj.get_name() );
	
	//SPACE :D:D:D//
	
	System.out.println();
	System.out.println("obj1: 0");
	System.out.println(obj1.get_grade1() );
	System.out.println(obj1.get_grade2() );
	System.out.println(obj1.get_grade3() );
	System.out.println(obj1.get_name() );
//	System.out.println(obj.get_English_score() );
	System.out.println();
	obj1.setname("Fred");
	obj1.settest1(3);
	obj1.settest2(44);
	obj1.settest3(56);
	
	System.out.println(obj1.get_grade1() );
	System.out.println(obj1.get_grade2() );
	System.out.println(obj1.get_grade3() );
	System.out.println(obj1.get_name() );
	
	//SPACE:D:D:D//
	
	System.out.println();
	System.out.println("obj2: 0, 0");
	System.out.println(obj2.get_grade1() );
	System.out.println(obj2.get_grade2() );
	System.out.println(obj2.get_grade3() );
	System.out.println(obj2.get_name() );
//	System.out.println(obj.get_English_score() );
	System.out.println();
	obj2.setname("Fred");
	obj2.settest1(7);
	obj2.settest2(98);
	obj2.settest3(12);
	
	System.out.println(obj2.get_grade1() );
	System.out.println(obj2.get_grade2() );
	System.out.println(obj2.get_grade3() );
	System.out.println(obj2.get_name() ); 
	
	//SPACE:D:D:D//
	
	System.out.println();
	System.out.println("obj3: 0, 0, 0");
	System.out.println(obj3.get_grade1() );
	System.out.println(obj3.get_grade2() );
	System.out.println(obj3.get_grade3() );
	System.out.println(obj3.get_name() );
//	System.out.println(obj.get_English_score() );
	System.out.println();
	obj3.setname("Fred");
	obj3.settest1(14);
	obj3.settest2(25);
	obj3.settest3(11);
	
	System.out.println(obj3.get_grade1() );
	System.out.println(obj3.get_grade2() );
	System.out.println(obj3.get_grade3() );
	System.out.println(obj3.get_name() );
	
	//SPACE:D:D:D//
	
	System.out.println();
	System.out.println("obj: 0, 0, 0, 0");
	System.out.println(obj4.get_grade1() );
	System.out.println(obj4.get_grade2() );
	System.out.println(obj4.get_grade3() );
	System.out.println(obj4.get_grade4() );
	obj4.settest1(42);
	obj4.settest2(24);
	obj4.settest3(69);
	obj4.settest4(14);
	
	System.out.println();
	System.out.println(obj4.get_grade1() );
	System.out.println(obj4.get_grade2() );
	System.out.println(obj4.get_grade3() );
	System.out.println(obj4.get_grade4() );
	
	//SPACE:D:D:D//
	
	System.out.println();
	System.out.println("Average: (0 + 0 + 0 + 0)/4");
	System.out.println(obj4.average_grades());
		} 
	}
