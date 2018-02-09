public abstract class Final_Dog {
	private int age;   // default is age = 0;
	private char has_been_trained;   // default is has_been_trained = '';
	
	Final_Dog () {
		age = 0;
	}
	Final_Dog (int i) {
		age = i;
	}
	Final_Dog (char has_been_trained) {
		has_been_trained = 'y';
	}
	Final_Dog (int i, char has_been_trained) {
		age = i;
		has_been_trained = 'y';
	}
	int getage () {
		return age;
	}
	void setage (int i) {
		age = i;
	}
	char gethas_been_trained () {
		return has_been_trained;
	}
	void sethas_been_trained (char c1) {
		has_been_trained = c1;
	}
}
