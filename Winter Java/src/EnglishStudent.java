
public class EnglishStudent extends Student {
	private double score = 45;
	private double test4 = 0;
	
	
	EnglishStudent(double test1, double test2, double test3, String name) {
		super(test1, test2, test3, name);
	}
	EnglishStudent(double test1) {
		super(test1);
	}
	EnglishStudent(double test1, double test2) {
		super(test1, test2);
	}
	EnglishStudent(double test1, double test2, double test3) {
		super(test1, test2, test3);
	}
	EnglishStudent(double test1, double test2, double test3, double t4) {
		super(test1, test2, test3);
		test4 = t4;
	}
/*	double get_double4 () {
		return test4;
	} */
	double get_score() {
		return score;
	}
	double get_grade1() {
		return super.get_double1();
	}
	double get_grade2() {
		return super.get_double2();
	}
	double get_grade3() {
		return super.get_double3();
	}
	double get_grade4() {
		return test4;
	} 
	String get_name() {
		return super.get_String1();
	}
	double get_English_score() {
		return get_score();
	}
	void settest4(double t4) {
		test4 = t4;
	}
	
	double average_grades() {
		return (super.get_double1() + super.get_double2() + super.get_double3() + get_grade4() )/ 4;
	}
}
