package sec02_swing_event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx2 extends JFrame {
	private JLabel [] keyMessage; // 3���� �޽����� ����� ���̺� ������Ʈ �迭
	
	public KeyListenerEx2() {
		setTitle("keyListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); // ����Ʈ �濡 ��ġ������ 
		c.addKeyListener(new MyKeyListener()); // ����Ʈ �濡 �̺�Ʈ ������ �ޱ�
		
		// ���̺� �迭�� 3�� �����ϰ� �� ���̺� ������Ʈ ����
		keyMessage = new JLabel[3]; // ���̺� �迭 ����
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		// 3���� ������Ʈ�� ����Ʈ�濡 ����
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); // ������ ���̷� ������ �Ӽ� ����
			keyMessage[i].setBackground(Color.YELLOW); // ������ CYAN ������ ����
		}
		
		setSize(300, 150);
		setVisible(true);
		
		// ����Ʈ ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		c.setFocusable(true);
		c.requestFocus();
	}
	
	// key ������ ����
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // Ű �ڵ� �˾� ����
			char keyChar = e.getKeyChar(); // Ű ���� �� �˾� ����
			keyMessage[0].setText(Integer.toString(keyCode)); // Ű �ڵ� ���
			keyMessage[1].setText(Character.toString(keyChar)); // Ű ���� ���
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode)); // Ű �̸� ���ڿ� ���
			
			System.out.println("KeyPressed"); // �ܼ�â�� �޼ҵ� �̸� ���
		}
		
		public void keyReleased(KeyEvent e) { // �ܼ�â�� �޼ҵ� �̸� ���
			System.out.println("KeyReleased");
		}
		
		public void keyTyped(KeyEvent e) { // �ܼ�â�� �޼ҵ� �̸� ���
			System.out.println("KeyTyped");
		}
	}
	public static void main(String[] args) {
		new KeyListenerEx2();
	}
}
