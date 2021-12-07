package sec04_awt_event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventExam extends Frame implements WindowListener {
	public WindowEventExam() {
		super("종료 버튼을 눌러 주세요");
		setSize(300, 100);
		setVisible(true);
		addWindowListener(this);
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	@Override
	public void windowClosed(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	

	public static void main(String[] args) {
		new WindowEventExam();

	}

}
