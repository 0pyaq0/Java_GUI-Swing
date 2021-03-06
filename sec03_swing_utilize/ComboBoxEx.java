package sec03_swing_utilize;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame {
	private String[] fruits = {"apple","banana","kiwi","mango","pear",
			"peach","berry","strawberry","blackberry"};
	private String[] names = {"kitae","jaemoon","hyosoo","namyun"};
	
	public ComboBoxEx() {
		setTitle("?޺??ڽ? ?????? ????");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		// ???ڿ? ?޺??ڽ? ????
		
		c.add(strCombo);
		
		JComboBox<String> nameCombo = new JComboBox<String>();
		// ?? ?޺??ڽ? ????
		
		for(int i=0; i<names.length; i++)
			nameCombo.addItem(names[i]);// ?޺??ڽ??? ???ڿ? ?????? ????
		
		c.add(nameCombo);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboBoxEx();
	}
}
