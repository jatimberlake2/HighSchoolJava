import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList color = new ArrayList();
		System.out.println(color.size());
		color.add("red");
		System.out.println(color.size());
		System.out.println(color.get(0));
		System.out.println(color.indexOf("red"));
		color.set(0, "green");
		System.out.println(color.get(0));
		System.out.println(color.indexOf("red"));
	}
}
