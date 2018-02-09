import javax.swing.*;
public class Test_MyIntField {

	public static void main(String[] args) {
		JTextField obj = new JTextField("789");
		System.out.println(obj.getText() + 4);
		System.out.println(Integer.parseInt("123") + 4);
		System.out.println(Integer.parseInt(" 456 ".trim()) + 4);
		MyIntField obj2 = new MyIntField(" 120 ");
		System.out.println(obj2.getInt() + 5);

	}

}
