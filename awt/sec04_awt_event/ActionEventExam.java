package sec04_awt_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExam extends Frame implements ActionListener {
	Button b1 = new Button("¹öÆ°");
	Panel p = new Panel();
	
	public ActionEventExam() {
		super("ActionEvent");
		p.add(b1);
		add(p);
		setSize(300, 150);
		setVisible(true);
		b1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new ActionEventExam();
	}
}






