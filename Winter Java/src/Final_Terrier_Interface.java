public class Final_Terrier_Interface implements Final_Dog_Interface {
	private int age;   // default is age = 0;
	private char has_been_trained;   // default is has_been_trained = '';
	
	private String breed_of_Terrier; // default is breed_of_Terrier = "";
		Final_Terrier_Interface () {
			breed_of_Terrier = "";
		}
		Final_Terrier_Interface (int i) {
			age = i;
		}
		Final_Terrier_Interface (String s1) {
			breed_of_Terrier = s1;
		}
		Final_Terrier_Interface (int i, String s1) {
			age = i;	
			breed_of_Terrier = s1;
		}
		Final_Terrier_Interface (char c1) {
			has_been_trained = c1;
			breed_of_Terrier = "";
		}
		Final_Terrier_Interface (int i, char c1) {
			age = i;
			has_been_trained = c1;
		}
		Final_Terrier_Interface (String s1, char c1) {
			breed_of_Terrier = s1;
			has_been_trained = c1;
		}
		Final_Terrier_Interface (int i, char c1, String s1) {
			age = i;
			has_been_trained = c1;
			breed_of_Terrier = s1;
		}
		public int getage () {
			return age;
		}
		public void setage (int i) {
			age = i;
		}
		public String getbreed_of_Terrier () {
			return breed_of_Terrier;
		}
		public void setbreed_of_Terrier (String s1) {
			breed_of_Terrier = s1;
		}
		public char gethas_been_trained () {
			return has_been_trained;
		}
		public void sethas_been_trained (char c1) {
			has_been_trained = c1;
		}

}
