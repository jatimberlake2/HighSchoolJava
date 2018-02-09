public class  My_class {
	private String str = null; 	// data should be private
        private int num;		// data should be private
        My_class() { str = new String(""); num = 0; } 	// a constructor
        
        My_class(String s) { str = s; num = 0; } 		// a constructor 
        
        My_class(int i) { str = new String(""); num = i; } 	// a constructor 
        
        My_class(String s, int i) {			// a constructor
		str = s; 
		num = i; 
	} 
	String get_str () { return str; }  // an accessor method to get the value of str
	int get_num() { return num; }  // an accessor method to get the value of num	
}
