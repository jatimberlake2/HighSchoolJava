public class Student {
private String name; 		// Student’s name.
private double test1, test2, test3;		 // Grades on three tests.
Student() {test1 = 0; test2 = 0; test3 = 0; name = null;};		//These were constructors. Not needed for this assignment. Oops.
	void settest1 (double t1) {
		test1 = t1;
	}
	void settest2 (double t2) {
		test2 = t2;
	}
	void settest3 (double t3) {
		test3 = t3;
	}
	void setname (String name) {
		this.name = name;
	}
Student(double t1) {test1 = t1; test2 = 0; test3 = 0;};					//same thing here as before; this assignment
Student(double t1, double t2) {test1 = t1; test2 = t2; test3 = 0;};			//was supposed to be for setter methods...
Student(double t1, double t2, double t3) {test1 = t1; test2 = t2; test3 = t3;};
Student(double t1, double t2, double t3, String n1) {test1 = t1; test2 = t2; test3 = t3; name = n1;};
public double getAverage() {				 // compute average test grade
		return (test1 + test2 + test3) / 3;
}
double get_double1 () {
	return test1;
	};
double get_double2 () {
	return test2;
	};
double get_double3 () {
	return test3;
	};
String get_String1 () {
	return name;
	};
} // end of class Student
