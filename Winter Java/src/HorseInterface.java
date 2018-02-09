public class HorseInterface implements AnimalInterface {
	private String food = "Hay";
	HorseInterface () {

	}
	HorseInterface (String s1) {
		food = s1;
	}
	void set_food (String s1) {
		food = s1;
	}
	public void Talk () {
		System.out.println("Heeee");
	}
	public void Diet() {
		System.out.println(food);
	}
}