package sec01_swing_component;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); // 컨텐트 팬의 배치관리자 제거
		
		// JLabel 컴포넌트를 생성하고위치와 크기를 직접지정한다.
		JLabel la = new JLabel("hello, Press Buttons!");
		la.setLocation(130,  50);
		la.setSize(200,  20);
		c.add(la);
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼 생성
			b.setLocation(i*15,  i*15);
			b.setSize(50, 20);
			c.add(b);
		}
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NullContainerEx();

	}

}
