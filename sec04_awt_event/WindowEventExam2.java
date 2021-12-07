package sec04_awt_event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventExam2 extends Frame {
	public WindowEventExam2() {
		super("종료 버튼을 눌러 주세요");
		setSize(300, 100);
		setVisible(true);
		addWindowListener(new MyClass());
	}
	public static void main(String[] args) {
		new WindowEventExam2();
	}
}

class MyClass extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}





