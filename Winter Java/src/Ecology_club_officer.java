
public class Ecology_club_officer extends Ecology_club_member {
 private int phone_number;
 	Ecology_club_officer () { 
		super();
		phone_number = 0;
	}
	Ecology_club_officer (String s1) { 
		super(s1);
		phone_number = 0;
	}
	Ecology_club_officer (double d1) { 
		super(d1);
		phone_number = 0;
	}
	Ecology_club_officer (String s1, double d1) { 
		super(s1, d1);
		phone_number = 0;
	}
	 Ecology_club_officer (int i1) { 
			super();
			phone_number = i1;
	}
	Ecology_club_officer (String s1, int i1) { 
			super(s1);
			phone_number = i1;
	}
	Ecology_club_officer (double d1, int i1) { 
			super(d1);
			phone_number = i1;
	}
	Ecology_club_officer (String s1, double d1, int i1) { 
			super(s1, d1);
			phone_number = i1;
	}
	double get_dues() {
		return super.get_dues();
	}
	String get_name() {
		return super.get_name();
	}
	int get_number() {
		return phone_number;
	}
	void setnumber (int i1) {
		phone_number = i1;
	}
}
