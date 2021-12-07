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
	private JLabel la = new JLabel("No Mouse Event"); // 메세지 출력 레이블 컴포넌트
	
	public MouseListenerAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout() );
		
		MyMouseListener listener = new MyMouseListener(); // 리스너 객체 생성
		c.addMouseListener(listener); // MouseListener 리스너 등록
		c.addMouseMotionListener(listener); // MouseMotionListener 리스너 등록
		// MyMouseListener를 Mouse 리스너와 MouseListener 리스너로 따로등록 해야 한다.
		c.add(la);
		setSize(300, 200);
		setVisible(true);
	}
	
	// Mouse 리스너와 MouseMotion 리스너를 모두 가진 리스너 작성
	class MyMouseListener implements MouseListener, MouseMotionListener {
		// MouseListener 의 5개 메소드 구현
		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed (" + e.getX() + ","+e.getY() + ")");
			// 마우스가 눌러진 위치 (x, y)점을 출력
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased (" + e.getX() + ","+e.getY() + ")");
			// 마우스가 떼어진 위치 (x, y)점을 출력
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {}
		
		@Override
		public void mouseEntered(MouseEvent e) { // 마우스가 올라간 컴포넌트를 알아낸다.
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		
		@Override
		public void mouseExited(MouseEvent e) { // 마우스가 내려간 컴포넌트를 알아낸다.
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		
		// MouseMotionListener의 2개 매소드 구현
		@Override
		public void mouseDragged(MouseEvent e) { // 마우스가 드래깅 되는 동안
			la.setText("mouseDragged (" + e.getX() + ","+e.getY() + ")");
		}
		
		@Override
		public void mouseMoved(MouseEvent e) { // 마우스가 움직이는 동안 계속호출
			la.setText("mouseMoved (" + e.getX() + ","+e.getY() + ")");	
		}
	}
	
	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
}
