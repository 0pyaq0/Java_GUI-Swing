package sec03_swing_utilize;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class SliderEx extends JFrame {
	public SliderEx() {
		setTitle("슬라이드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		// 수평 슬라이드를 생성한다. 0~200범위에서 선택이 가능하며 현재 선택된 값은 100이다.
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		c.add(slider);
		
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SliderEx();
	}
}
