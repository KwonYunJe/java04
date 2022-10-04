package useClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class SaveFile {

	//public void save() 
	public static void main(String[] args) 
	{
		/*String date = "";
		String title = "";
		String write = "";
		*/
		
		String s1 = JOptionPane.showInputDialog("Input Date");
		String s2 = JOptionPane.showInputDialog("Input Title");
		String s3 = JOptionPane.showInputDialog("Input Write Down");
		
		try {
			FileWriter f = new FileWriter("/Library/eclipqse_WorkSpace/java04" + s1 +".txt");
			
			/*f.write(date + "\n");
			f.write(title + "\n");
			f.write(write + "\n");
			f.close();*/
			
			f.write(s1 + "\n");
			f.write(s2 + "\n");
			f.write(s3 + "\n");
			
			
		}catch (IOException e) {
			System.out.println("Error in saving");
			System.out.println("Information Error in" + e.getMessage());
		}
	}

}
