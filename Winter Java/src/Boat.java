public class Boat implements Possessions {
	private int total_cost;
	Boat () {
		total_cost = 0;
	}
	Boat (int tc1) {
		total_cost = tc1;
	}
	void set_total_cost (int tc1) {
		total_cost = tc1;
	}
	public void Cost () {
		System.out.println(total_cost);
	}

}
