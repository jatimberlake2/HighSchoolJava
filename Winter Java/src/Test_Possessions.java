public class Test_Possessions {
	public static void main(String[] args) {
		DogInterface p = new DogInterface();
		p.Cost();
		House q = new House();
		q.Cost();
		Boat r = new Boat();
		r.Cost();
		p.set_total_cost(4);
		q.set_total_cost(5);
		r.set_total_cost(6);
		p.Cost();
		q.Cost();
		r.Cost();
	}
}
