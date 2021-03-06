package sec02_awt_component;

import java.awt.*;

public class TextFieldExam extends Frame {
	public TextFieldExam() {
		super("텍스트 필드");
		Panel p = new Panel();
		TextField tf1 = new TextField("주민등록번호앞자리");
		TextField tf2 = new TextField(15);
		tf1.selectAll();
		tf2.setEchoChar('*');
		p.add(tf1);
		p.add(tf2);
		add(p);
		setSize(400, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldExam();
	}
}