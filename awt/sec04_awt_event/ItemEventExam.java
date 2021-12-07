package sec04_awt_event;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventExam extends Frame implements ItemListener {
	Panel p1 = new Panel();
	TextArea ta = new TextArea(7, 15);
	Checkbox cb1 = new Checkbox("Å°À§", false);
	Checkbox cb2 = new Checkbox("»ç°ú", false);
	Checkbox cb3 = new Checkbox("µþ±â", false);
	
	public ItemEventExam() {
		super("ItemEvent");
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		add(p1, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie) {
		if(ie.getStateChange() == ItemEvent.SELECTED)
			ta.append(ie.getItem() + "°¡ ¼±ÅÃµÊ\n\n");
		else if(ie.getStateChange() == ItemEvent.DESELECTED)
			ta.append(ie.getItem() + "°¡ Ãë¼ÒµÊ\n\n");
	}
	public static void main(String[] args) {
		new ItemEventExam();
	}
}
