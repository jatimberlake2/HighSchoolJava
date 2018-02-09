public class Test_AnimalInterface {
	public static void main(String[] args) {
		AnimalInterface a = new DogInterface();
		//a.Talk();
		a.Diet();
		AnimalInterface b = new CatInterface();
		//b.Talk();
		b.Diet();
		AnimalInterface c = new HorseInterface();
		//c.Talk();
		c.Diet();	
		DogInterface d = new DogInterface();
		d.set_food("doggy food");
		d.Diet();
		CatInterface e = new CatInterface();
		e.set_food("kitty food");
		e.Diet();
		HorseInterface f = new HorseInterface();
		f.set_food("horsey food");
		f.Diet();
	}
}
