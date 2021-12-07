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
	JTextField in_name; // �̸�
	JTextField in_num; // �й�
	
	JButton returnbtn = new JButton("");
	JButton backbtn = new JButton("");
	
	public returnPanel(String str) {
		super(str);
		init();
		start();
		
		this.setLocation(0, 0); // ������ ������ġ
		super.setVisible(true); // ������ ȭ�� ���
		super.setSize(1920, 1080); //ũ��
		super.setResizable(false); // ������ ����
	}
	
	public void init() {
		ImagePanel returnPanel = new ImagePanel(new ImageIcon("C:\\Users\\82108\\OneDrive\\���� ȭ��\\Java_Umbrella\\Umbrella\\img\\return.png").getImage());
		setLayout(new BorderLayout());
		Label str_date = new Label("�뿩��¥");
		
		returnbtn.addActionListener(this); // ��ư �̺�Ʈ
		in_name = new JTextField(20);
		in_num = new JTextField(20);
		
		
		// �̸� �Է�
		in_name.setBounds(745, 417, 452, 61);
		in_name.setFont(new Font("���� ���", Font.BOLD, 15));
		in_name.setColumns(10);
		returnPanel.add(in_name);
		in_name.setBorder(null);
		
		// �й� �Է�
		in_num.setFont(new Font("���� ���", Font.BOLD, 15));
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
					
				Calendar strTime = Calendar.getInstance(); // �뿩 ��¥, �ð�
				String format_str = format.format(strTime.getTime());
				
				// ���� ��¥
				String format_today = format.format(strTime.getTime());
				
				
				Date now = new Date();
				strTime.add(Calendar.DATE, 7); //7�� ���ϱ�
				String format_end = format.format(strTime.getTime());
				
				if((JButton)obj == returnbtn) {
					dto.setNum(in_num.getText()); // �Էµ� �й��� dto�� ����
					dto.setName(in_name.getText());
					dto.setstrDate(format_str);
					dto.setstrDate(format_today);
					dto.setendDate(format_end); //��Ʈ���� ����?
					
					try {
						insertDAO.create(dto); // dto�� DAO�� �ѱ�
					} catch (Exception ex) {
						ex.printStackTrace();
					} finally {
						new returnfinish();
					}
				}
			}
		});
		returnbtn.setBounds(841, 791, 234, 207);
		returnbtn.setIcon(new ImageIcon("C:\\Users\\82108\\OneDrive\\���� ȭ��\\Java_Umbrella\\Umbrella\\img\\returnbtn1.png"));
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
				new homePanel("Ȩ");
			}
		});
		backbtn.setBounds(60, 90, 122, 30);
		backbtn.setIcon(new ImageIcon("C:\\Users\\82108\\OneDrive\\���� ȭ��\\Java_Umbrella\\Umbrella\\img\\back.png"));
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
	public void itemStateChanged(ItemEvent e) { // üũ ���� Ȯ��
		
	}

	@Override
	public void actionPerformed(ActionEvent e) { // �׼� �̺�Ʈ
		
		
	}
	public static void main(String args[]) {
		returnPanel exam = new returnPanel("�⺻ ������");
	}
}
