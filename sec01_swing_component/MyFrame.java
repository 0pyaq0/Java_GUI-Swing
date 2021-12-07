package sec01_swing_component;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame() {
		setTitle("첫번째 프레임");
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}
