public class CatInterface implements AnimalInterface {
	private String food = "Fish";
		CatInterface () {

		}
		CatInterface (String s1) {
			food = s1;
		}
		void set_food (String s1) {
			food = s1;
		}
		public void Talk () {
			System.out.println("Meow");
		}
		public void Diet() {
			System.out.println(food);
		}
	}
