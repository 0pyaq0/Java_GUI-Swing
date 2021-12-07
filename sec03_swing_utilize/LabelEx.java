package sec03_swing_utilize;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout() );
		
		// 문자 레이블 생성
		JLabel textLabel = new JLabel("사랑합니다.");
		
		// 이미지 레이블 생성
		ImageIcon beauty = new ImageIcon("images/hodong.jpg");// 이미지 로딩
		JLabel imageLabel = new JLabel(beauty); // 이미지 레이블 생성
		
		// 문자열과 이미지를 모두 가진 레이블 생성
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.jpg"); // 이미지 로딩
		JLabel label = new JLabel("보고 싶으면 전화 하세요.", 
				normalIcon, SwingConstants.CENTER); // 레이블 생성
		// 텍스트 이미지 모두 출력하고자 하는 경우 수평정렬 값을 지정하여야 함 

		// 컨텐트 펜에 3개의 레이블 부착
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
