import java.util.*;
public class Flowchart_correct {
	public static void main(String[] args) {
		Scanner derp = new Scanner(System.in);
		while (true) {
		double base = -1;
		double height = -1;
		double radius = -1;
		double shape = 0;
		System.out.println("Enter 1 to calculate the area of a triangle or 2");
		System.out.println("    to calculate the area of a circle.");
		shape = derp.nextDouble(); // choose shape option 1 or 2.
	if (shape == 1) {
		System.out.println("Enter the base of the triangle --- enter 0 to quit.");
		base = derp.nextDouble();
		if (base == 0)
			break;
		System.out.println("Enter the height of the triangle --- enter 0 to quit.");
		height = derp.nextDouble();
		if (height == 0)
			break;
		System.out.println("The area of the triangle with the base " +base+
				" and height " +height+ " is " +.5*base*height);} // triangle option end
	if (shape == 2) {
			System.out.println("Enter the radius of the circle --- enter 0 to quit.");
			radius = derp.nextDouble();
		if (radius == 0) {
			break;}
	System.out.println("The area of the circle with the radius " +radius+
				" is " +Math.PI*radius*radius);} // circle option end
			}
		System.out.println("Goodbye then."); // if you quit
	}
}