package sec02_awt_component;
import java.awt.*;
public class ListExam extends Frame {
	public ListExam() {
		super("리스트");
		Panel p = new Panel();
		List list1 = new List(4, true);
		list1.add("월");
		list1.add("화");
		list1.add("수");
		list1.add("목");
		list1.add("금");
		list1.add("토");
		list1.add("일");
		p.add(list1);
		add(p);
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListExam();
	}
}
