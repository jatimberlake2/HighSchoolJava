public class Product {
	
	private String name = "";
	private double price = 0.0;
	private double change = 5.0;
	 
	Product(){
		name = "";
		price = 0.0;
		change = 0.0;
	}
	Product(String s1){
		name = s1;
		price = 0.0;
		change = 0.0;
	}
	Product(double d1){
		name = "";
		price = d1;
		change = 0.0;
	}

	
	String getName(){
		return name;
	}
	double getPrice(){
		return price;
	}
	void setPrice(double p1){
		price = p1;
	}
	void changePrice(){
		price = price + change;
	}
}
