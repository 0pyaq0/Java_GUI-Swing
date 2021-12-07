package sec02_swing_event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event"); // �޼��� ��� ���̺� ������Ʈ
	
	public MouseListenerAllEx() {
		setTitle("MouseListener�� MouseMotionListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout() );
		
		MyMouseListener listener = new MyMouseListener(); // ������ ��ü ����
		c.addMouseListener(listener); // MouseListener ������ ���
		c.addMouseMotionListener(listener); // MouseMotionListener ������ ���
		// MyMouseListener�� Mouse �����ʿ� MouseListener �����ʷ� ���ε�� �ؾ� �Ѵ�.
		c.add(la);
		setSize(300, 200);
		setVisible(true);
	}
	
	// Mouse �����ʿ� MouseMotion �����ʸ� ��� ���� ������ �ۼ�
	class MyMouseListener implements MouseListener, MouseMotionListener {
		// MouseListener �� 5�� �޼ҵ� ����
		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed (" + e.getX() + ","+e.getY() + ")");
			// ���콺�� ������ ��ġ (x, y)���� ���
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased (" + e.getX() + ","+e.getY() + ")");
			// ���콺�� ������ ��ġ (x, y)���� ���
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {}
		
		@Override
		public void mouseEntered(MouseEvent e) { // ���콺�� �ö� ������Ʈ�� �˾Ƴ���.
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		
		@Override
		public void mouseExited(MouseEvent e) { // ���콺�� ������ ������Ʈ�� �˾Ƴ���.
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		
		// MouseMotionListener�� 2�� �żҵ� ����
		@Override
		public void mouseDragged(MouseEvent e) { // ���콺�� �巡�� �Ǵ� ����
			la.setText("mouseDragged (" + e.getX() + ","+e.getY() + ")");
		}
		
		@Override
		public void mouseMoved(MouseEvent e) { // ���콺�� �����̴� ���� ���ȣ��
			la.setText("mouseMoved (" + e.getX() + ","+e.getY() + ")");	
		}
	}
	
	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
}
