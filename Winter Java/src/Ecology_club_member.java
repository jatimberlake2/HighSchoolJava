public class Ecology_club_member {
	private double dues;
	private String name;

Ecology_club_member () { 
	name = "";
	dues = 0;
}
Ecology_club_member (String s1) { 
	name = s1;
	dues = 0;
}
Ecology_club_member (double d1) { 
	name = "";
	dues = d1;
}
Ecology_club_member (String s1, double d1) { 
	name = s1;
	dues = d1;
}
double get_dues() {
	return dues;
}
String get_name() {
	return name;
}

void setdues(double d1) {
	dues = d1;
}
void setname (String s1) {
	name = s1;
}

}