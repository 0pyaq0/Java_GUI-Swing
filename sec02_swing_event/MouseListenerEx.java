package sec02_swing_event;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello");// "Hello"를 출력하기 위한 레이블
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener()); // 컨텐트 펜에 이벤트 리스너 달기
		
		c.setLayout(null); // 컨텐트 펜에 배치관리자 삭제 
		la.setSize(50, 20); // 레이블의 크기
		la.setLocation(30, 30); // 레이블의 위치
		c.add(la); // 레이블 컴포넌트 삽입
		
		setSize(250, 250);
		setVisible(true);
	}
	
	// Mouse 리스너 구현
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // 마우스 클릭 좌표 x
			int y = e.getY(); // 마우스 클릭 좌표 y
			la.setLocation(x, y); // 레이블의 위치를 (x, y)로 이동
		}
		
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
