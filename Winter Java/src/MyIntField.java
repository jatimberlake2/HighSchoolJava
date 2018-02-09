import javax.swing.*;
public class MyIntField extends JTextField{
	MyIntField (String text){
		super(text);
	}	
	int getInt() {
		String str = super.getText();
		return (int)(Integer.parseInt(str.trim()));
	}
	
}
