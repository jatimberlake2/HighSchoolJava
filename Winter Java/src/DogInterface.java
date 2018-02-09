public class DogInterface implements AnimalInterface, Possessions {
	private int total_cost;
	private String food = "Meat";
	DogInterface () {
		total_cost = 0;
	}
	DogInterface (int tc1) {
		total_cost = tc1;
	}
	DogInterface (String s1) {
		food = s1;
	}
	DogInterface (int tc1, String s1) {
		total_cost = tc1;
		food = s1;
	}
	void set_total_cost (int tc1) {
		total_cost = tc1;
	}
	void set_food (String s1) {
		food = s1;
	}

	public void Talk () {
		System.out.println("Bark");
	}
	public void Cost() {
		System.out.println(total_cost);
	}
	public void Diet() {
		System.out.println(food);
	}
}