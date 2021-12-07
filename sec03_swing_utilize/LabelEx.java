package sec03_swing_utilize;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout() );
		
		// ���� ���̺� ����
		JLabel textLabel = new JLabel("����մϴ�.");
		
		// �̹��� ���̺� ����
		ImageIcon beauty = new ImageIcon("images/hodong.jpg");// �̹��� �ε�
		JLabel imageLabel = new JLabel(beauty); // �̹��� ���̺� ����
		
		// ���ڿ��� �̹����� ��� ���� ���̺� ����
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.jpg"); // �̹��� �ε�
		JLabel label = new JLabel("���� ������ ��ȭ �ϼ���.", 
				normalIcon, SwingConstants.CENTER); // ���̺� ����
		// �ؽ�Ʈ �̹��� ��� ����ϰ��� �ϴ� ��� �������� ���� �����Ͽ��� �� 

		// ����Ʈ �濡 3���� ���̺� ����
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LabelEx();
	}
}
