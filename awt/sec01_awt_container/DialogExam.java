package sec01_awt_container;

import java.awt.*;

public class DialogExam extends Frame {
	public DialogExam() {
		super("Dialog");
		Dialog d = new Dialog(this,"���̾�α�");
		setSize(300,100);
		setVisible(true);
		d.setSize(200, 50);
		d.setVisible(true);
	}
	public static void main(String[] args) {
		new DialogExam();
	}
}