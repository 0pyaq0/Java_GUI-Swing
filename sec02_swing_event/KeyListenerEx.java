package sec02_swing_event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame {
	private JLabel [] keyMessage;
	
	public KeyListenerEx() {
		setTitle("keyListene 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		// 레이블 배열을 3개 생성하고 각 레이블 컴포넌트 생성
		keyMessage = new JLabel[3];
		keyMessage[0] =  new JLabel(" getKeyCode()  ");
		keyMessage[1] =  new JLabel(" getKeyChar()  ");
		keyMessage[2] =  new JLabel(" getKeyText()  ");
		
		// 3개의 레이블 컴포넌트를 컨텐트팬에 부착
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		setSize(300, 150);
		setVisible(true);
	
		// 켄텐트펜이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
	}
	
	// key 리스너 구현
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // 키 코드 알아내기
			char keyChar =  e.getKeyChar(); // 키 문자 알아내기
			keyMessage[0].setText(Integer.toString(keyCode)); // 키 코드 출력
			keyMessage[1].setText(Character.toString(keyChar)); // 키 문자 출력
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode)); // 키 이름 문자열 출력
			
			System.out.println("KeyPressed"); // 콘솔창에 메서드 이름 출력
		}
		public void keyReleased(KeyEvent e) {
			System.out.println("KeyReleased");
		}
		
		public void keyTyped(KeyEvent e) {
			System.out.println("KeyTyped");
		}
	}
	
	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
