package sec02_swing_event;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx1 extends JFrame {
	private JLabel la = new JLabel("Hello");// "Hello"�� ����ϱ� ���� ���̺�
	
	public MouseAdapterEx1() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter()); // ����Ʈ �濡 �̺�Ʈ ������ �ޱ�
		
		c.setLayout(null); // ����Ʈ �濡 ��ġ������ ���� 
		la.setSize(50, 20); // ���̺��� ũ��
		la.setLocation(30, 30); // ���̺��� ��ġ
		c.add(la); // ���̺� ������Ʈ ����
		
		setSize(250, 250);
		setVisible(true);
	}
	
	// Mouse ������ ����
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // ���콺 Ŭ�� ��ǥ x
			int y = e.getY(); // ���콺 Ŭ�� ��ǥ y
			la.setLocation(x, y); // ���̺��� ��ġ�� (x, y)�� �̵�
		}
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
