package sec02_swing_event;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx1 extends JFrame {
	private JLabel la = new JLabel("Hello");// "Hello"를 출력하기 위한 레이블
	
	public MouseAdapterEx1() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter()); // 컨텐트 펜에 이벤트 리스너 달기
		
		c.setLayout(null); // 컨텐트 펜에 배치관리자 삭제 
		la.setSize(50, 20); // 레이블의 크기
		la.setLocation(30, 30); // 레이블의 위치
		c.add(la); // 레이블 컴포넌트 삽입
		
		setSize(250, 250);
		setVisible(true);
	}
	
	// Mouse 리스너 구현
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // 마우스 클릭 좌표 x
			int y = e.getY(); // 마우스 클릭 좌표 y
			la.setLocation(x, y); // 레이블의 위치를 (x, y)로 이동
		}
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}

}
