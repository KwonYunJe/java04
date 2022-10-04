package useClass;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class WriteDiary {
	private static JTextField date;
	private static JTextField title;
	

	
	//public static void main(String[] args)
	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(233, 255, 241));
		f.setSize(700,700);
		f.getContentPane().setLayout(null);
		
		JTextArea content = new JTextArea();
		content.setBackground(new Color(209, 211, 207));
		content.setBounds(113, 251, 470, 299);
		f.getContentPane().add(content);
		
		date = new JTextField();
		date.setBackground(new Color(209, 211, 207));
		date.setBounds(258, 42, 300, 54);
		f.getContentPane().add(date);
		date.setColumns(10);
		
		title = new JTextField();
		title.setBackground(new Color(209, 211, 207));
		title.setBounds(258, 124, 307, 54);
		f.getContentPane().add(title);
		title.setColumns(10);
		
		JLabel datefont = new JLabel("Date.");
		datefont.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		datefont.setBounds(113, 52, 97, 35);
		f.getContentPane().add(datefont);
		
		JLabel titlefont = new JLabel("Title");
		titlefont.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		titlefont.setBounds(113, 128, 106, 35);
		f.getContentPane().add(titlefont);
		
		JLabel writefont = new JLabel("Write");
		writefont.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		writefont.setHorizontalAlignment(SwingConstants.CENTER);
		writefont.setBounds(258, 184, 148, 66);
		f.getContentPane().add(writefont);
		
		JButton save = new JButton("SAVE");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String da = date.getText();
				String ti = title.getText();
				String wd = content.getText();
				
				try {
					FileWriter f = new FileWriter("/Library/eclipqse_WorkSpace/java04/"+ da + "try.txt");
					
					f.write(da + "\n");
					f.write(ti + "\n");
					f.write(wd + "\n");
					f.close();
					
					
				}catch (IOException e1) {
					System.out.println("Error in saving");
					System.out.println("Information Error in" + e1.getMessage());
				}
				
			}
		});
		save.setBackground(new Color(192, 215, 239));
		save.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		save.setBounds(185, 583, 307, 72);
		f.getContentPane().add(save);
		
		
		
		
		
		f.setVisible(true);
	}

}
