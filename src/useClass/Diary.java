package useClass;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class Diary {
	private static JTextField id;
	private static JTextField pw;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(148, 195, 255));
		f.getContentPane().setLayout(null);
		
		JButton Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			String s1 = id.getText();
			String s2 = pw.getText();
			
			if(s1.equals("root") && s2.equals("1234")) {
				WriteDiary diary = new WriteDiary();
				diary.open();
			}else {
			JOptionPane.showMessageDialog(f,"Wrong input.");	
			}
			
			}
		});
		Login.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		Login.setBounds(96, 540, 193, 97);
		f.getContentPane().add(Login);
		
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				pw.setText("");
			}
		});
		reset.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		reset.setBounds(418, 540, 184, 97);
		f.getContentPane().add(reset);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("/Library/eclipqse_WorkSpace/java04/unnamed.png"));
		lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcon.setBounds(96, 6, 525, 434);
		f.getContentPane().add(lblIcon);
		
		id = new JTextField();
		id.setBounds(188, 452, 340, 32);
		f.getContentPane().add(id);
		id.setColumns(10);
		
		pw = new JTextField();
		pw.setBounds(188, 496, 340, 32);
		f.getContentPane().add(pw);
		pw.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setBounds(139, 460, 45, 24);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblPw.setBounds(139, 496, 45, 24);
		f.getContentPane().add(lblPw);
		f.setSize(700,700);
		
		
		f.setVisible(true);
	}
}
