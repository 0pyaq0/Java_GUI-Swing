package Login;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class returnPanel extends Frame implements ActionListener, ItemListener, Runnable{
	DTO dto = new DTO();
	JTextField in_name; // 이름
	JTextField in_num; // 학번
	
	JButton returnbtn = new JButton("");
	JButton backbtn = new JButton("");
	
	public returnPanel(String str) {
		super(str);
		init();
		start();
		
		this.setLocation(0, 0); // 프레임 시작위치
		super.setVisible(true); // 프레임 화면 출력
		super.setSize(1920, 1080); //크기
		super.setResizable(false); // 사이즈 조절
	}
	
	public void init() {
		ImagePanel returnPanel = new ImagePanel(new ImageIcon("C:\\Users\\82108\\OneDrive\\바탕 화면\\Java_Umbrella\\Umbrella\\img\\return.png").getImage());
		setLayout(new BorderLayout());
		Label str_date = new Label("대여날짜");
		
		returnbtn.addActionListener(this); // 버튼 이벤트
		in_name = new JTextField(20);
		in_num = new JTextField(20);
		
		
		// 이름 입력
		in_name.setBounds(745, 417, 452, 61);
		in_name.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		in_name.setColumns(10);
		returnPanel.add(in_name);
		in_name.setBorder(null);
		
		// 학번 입력
		in_num.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		in_num.setColumns(10);
		in_num.setBounds(745, 565, 452, 61);
		returnPanel.add(in_num);
		in_num.setBorder(null);
		
		
		
		returnbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object obj = e.getSource();
				SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
					
				Calendar strTime = Calendar.getInstance(); // 대여 날짜, 시간
				String format_str = format.format(strTime.getTime());
				
				// 오늘 날짜
				String format_today = format.format(strTime.getTime());
				
				
				Date now = new Date();
				strTime.add(Calendar.DATE, 7); //7일 더하기
				String format_end = format.format(strTime.getTime());
				
				if((JButton)obj == returnbtn) {
					dto.setNum(in_num.getText()); // 입력된 학번을 dto에 저장
					dto.setName(in_name.getText());
					dto.setstrDate(format_str);
					dto.setstrDate(format_today);
					dto.setendDate(format_end); //인트형이 문제?
					
					try {
						insertDAO.create(dto); // dto를 DAO에 넘김
					} catch (Exception ex) {
						ex.printStackTrace();
					} finally {
						new returnfinish();
					}
				}
			}
		});
		returnbtn.setBounds(841, 791, 234, 207);
		returnbtn.setIcon(new ImageIcon("C:\\Users\\82108\\OneDrive\\바탕 화면\\Java_Umbrella\\Umbrella\\img\\returnbtn1.png"));
		returnbtn.setBackground(Color.white);
		returnbtn.setOpaque(false);
		returnbtn.setBorderPainted(false);
		returnbtn.setContentAreaFilled(false);
		returnbtn.setFocusPainted(false);
		returnPanel.add(returnbtn);
		
		backbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new homePanel("홈");
			}
		});
		backbtn.setBounds(60, 90, 122, 30);
		backbtn.setIcon(new ImageIcon("C:\\Users\\82108\\OneDrive\\바탕 화면\\Java_Umbrella\\Umbrella\\img\\back.png"));
		backbtn.setBackground(Color.white);
		backbtn.setOpaque(false);
		backbtn.setBorderPainted(false);
		backbtn.setContentAreaFilled(false);
		backbtn.setFocusPainted(false);
		returnPanel.add(backbtn);
		
		add("Center", returnPanel);
	}
	
	public void start() {
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	
	
	public void run() {
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) { // 체크 상태 확인
		
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 액션 이벤트
		
		
	}
	public static void main(String args[]) {
		returnPanel exam = new returnPanel("기본 프레임");
	}
}
