package sec01_swing_component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame"); // ������ Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ������ �����츦 ������ ���α׷��� �Բ� ����ȴ�. 

		Container contentPane = getContentPane();
		// 
		
		contentPane.setBackground(Color.ORANGE);
		// ����Ʈ ���� ���� ������������
		
		contentPane.setLayout(new FlowLayout());
		// ����Ʈ�ҿ� FlowLayout ��ġ������ �ޱ�
		// FlowLayout�� ���ʿ��� ���������� 

		contentPane.add(new JButton("OK")); // OK ��ư �ޱ�
		contentPane.add(new JButton("Cancel"));// Cancel ��ư �ޱ�
		contentPane.add(new JButton("Ignore"));// Ignore ��ư �ޱ�

		setSize(300, 150); // ������ ũ�� 300*150
		setVisible(true); // ȭ�鿡 ������ ���
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
