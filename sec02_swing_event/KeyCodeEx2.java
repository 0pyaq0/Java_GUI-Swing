package sec02_swing_event;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx2 extends JFrame {
	private JLabel la = new JLabel(); // 빈 레이블 컴포넌트 생성
	
	public KeyCodeEx2() {
		setTitle("Key code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener() );
		c.add(la);
		setSize(300, 150);
		setVisible(true);
		
		// 컨텐트 펜에 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
	}
	
	// Key 리스너 구현
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			// la에 입력된 키의 키 이름 문자열을 출력하여 사용자에게 보고함
			la.setText(KeyEvent.getKeyText(e.getKeyCode()) + "키가 입력되었음");
			
			if(e.getKeyChar() == '%') // 입력된 키가 %인 경우
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
		}
	}
	public static void main(String [] args) {
		new KeyCodeEx2();
	}
}
