public class Name extends Student {
	private double num = 5;
	double get_num () {
		return num;
		}
	double get_double1() {
		return 2;
		}
	double get_parent_num () { 
		return super.get_double1();
		}
	double get_child_num () {
		return get_num();
		} 		// or this.getnum()
}