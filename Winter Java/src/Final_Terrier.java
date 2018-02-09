public class Final_Terrier extends Final_Dog {
	private String breed_of_Terrier; // default is breed_of_Terrier = "";
		Final_Terrier () {
			breed_of_Terrier = "";
		}
		Final_Terrier (int age) {
			super(age);
		}
		Final_Terrier (String s1) {
			breed_of_Terrier = s1;
		}
		Final_Terrier (int age, String s1) {
			super(age);	
			breed_of_Terrier = s1;
		}
		Final_Terrier (char has_been_trained) {
			super(has_been_trained);
			breed_of_Terrier = "";
		}
		Final_Terrier (int age, char has_been_trained) {
			super(age, has_been_trained);
		}
		Final_Terrier (String s1, char has_been_trained) {
			super(has_been_trained);
			breed_of_Terrier = s1;
		}
		Final_Terrier (int age, char has_been_trained, String s1) {
			super(age, has_been_trained);	
			breed_of_Terrier = s1;
		}
		String getbreed_of_Terrier () {
			return breed_of_Terrier;
		}
		void setbreed_of_Terrier (String s1) {
			breed_of_Terrier = s1;
		}
		char gethas_been_trained () {
			return super.gethas_been_trained();
		}
		void sethas_been_trained (char c1) {
			super.sethas_been_trained(c1);
		}

}
