public class Test_Final_Terrier {
	public static void main(String[] args) {
		Final_Terrier_Interface obj1 = new Final_Terrier_Interface();
		Final_Terrier_Interface obj2 = new Final_Terrier_Interface(12);
		Final_Terrier_Interface obj3 = new Final_Terrier_Interface("Boston Terrier");
		Final_Terrier_Interface obj4 = new Final_Terrier_Interface(14, "Fox Terrier");
		
		System.out.println(obj1.getage());
		System.out.println(obj1.getbreed_of_Terrier());
		System.out.println();
		System.out.println();
		
		System.out.println(obj2.getage());
		System.out.println(obj2.getbreed_of_Terrier());
		System.out.println();
		obj2.setage(30);
		obj2.setbreed_of_Terrier("American Terrier");
		System.out.println(obj2.getage());
		System.out.println(obj2.getbreed_of_Terrier());
		System.out.println();
		System.out.println();
		
		System.out.println(obj3.getage());
		System.out.println(obj3.getbreed_of_Terrier());
		System.out.println();
		obj3.setage(8);
		obj3.setbreed_of_Terrier("English Terrier");
		System.out.println(obj3.getage());
		System.out.println(obj3.getbreed_of_Terrier());
		System.out.println();
		System.out.println();
		
		System.out.println(obj4.getage());
		System.out.println(obj4.getbreed_of_Terrier());
		System.out.println();
		obj4.setage(10);
		obj4.setbreed_of_Terrier("Scottish Terrier");
		System.out.println(obj4.getage());
		System.out.println(obj4.getbreed_of_Terrier());
		
		
		Final_Terrier_Interface obj5 = new Final_Terrier_Interface('p');
		Final_Terrier_Interface obj6 = new Final_Terrier_Interface(12, 'q');
		Final_Terrier_Interface obj7 = new Final_Terrier_Interface("Boston Terrier", 'r');
		Final_Terrier_Interface obj8 = new Final_Terrier_Interface(14, 's', "Fox Terrier");
		
		System.out.println(obj5.getage());
		System.out.println(obj5.gethas_been_trained());
		System.out.println(obj5.getbreed_of_Terrier());
		System.out.println();
		System.out.println();
		
		System.out.println(obj6.getage());
		System.out.println(obj6.gethas_been_trained());
		System.out.println(obj6.getbreed_of_Terrier());
		System.out.println();
		obj6.setage(30);
		obj6.sethas_been_trained('n');
		obj6.setbreed_of_Terrier("American Terrier");
		System.out.println(obj6.getage());
		System.out.println(obj6.gethas_been_trained());
		System.out.println(obj6.getbreed_of_Terrier());
		System.out.println();
		System.out.println();
		
		System.out.println(obj7.getage());
		System.out.println(obj7.gethas_been_trained());
		System.out.println(obj7.getbreed_of_Terrier());
		System.out.println();
		obj7.setage(8);
		obj7.sethas_been_trained('m');
		obj7.setbreed_of_Terrier("English Terrier");
		System.out.println(obj7.getage());
		System.out.println(obj7.gethas_been_trained());
		System.out.println(obj7.getbreed_of_Terrier());
		System.out.println();
		System.out.println();
		
		System.out.println(obj8.getage());
		System.out.println(obj6.gethas_been_trained());
		System.out.println(obj8.getbreed_of_Terrier());
		System.out.println();
		obj8.setage(10);
		obj8.sethas_been_trained('t');
		obj8.setbreed_of_Terrier("Scottish Terrier");
		System.out.println(obj8.getage());
		System.out.println(obj6.gethas_been_trained());
		System.out.println(obj8.getbreed_of_Terrier());
		
	}

}
