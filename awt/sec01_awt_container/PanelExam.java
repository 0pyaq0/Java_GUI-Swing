package sec01_awt_container;
import java.awt.*;
public class PanelExam extends Frame {
	public PanelExam() {
		super("Panel");
		Panel p = new Panel();
		p.setBackground(Color.YELLOW);
		add(p);
		setSize(300, 80);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PanelExam();
	}
}
