
public class ChemistryStudent extends Student {
	private double score = 45;
	private double test4 = 0, test5 = 0;
	
	
	ChemistryStudent(double test1, double test2, double test3, String name) {
		super(test1, test2, test3, name);
	}
	ChemistryStudent(double test1) {
		super(test1);
	}
	ChemistryStudent(double test1, double test2) {
		super(test1, test2);
	}
	ChemistryStudent(double test1, double test2, double test3) {
		super(test1, test2, test3);
	}
	ChemistryStudent(double test1, double test2, double test3, double t4) {
		super(test1, test2, test3);
		test4 = t4;
	}
	ChemistryStudent(double test1, double test2, double test3, double t4, double t5) {
		super(test1, test2, test3);
		test4 = t4;
		test5 = t5;
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
	double get_grade5() {
		return test5;
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
	void settest5(double t5) {
		test5 = t5;
	}
	double average_grades() {
		return (super.get_double1() + super.get_double2() + super.get_double3() + get_grade4() + get_grade5() )/ 5;
	}
}
