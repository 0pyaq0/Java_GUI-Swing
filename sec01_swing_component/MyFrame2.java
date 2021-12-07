package sec01_swing_component;

import javax.swing.JFrame;

public class MyFrame2 extends JFrame {
	MyFrame2() {
		setTitle("첫번째 프레임");
		setSize(300, 300);
		setVisible(true);
	}
}
class MyApp {
	public static void main(String[] args) {
		MyFrame2 mf = new MyFrame2();
	}
}
