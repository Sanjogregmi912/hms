import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Label extends JLabel {
	Label(){
		
		ImageIcon background_img = new ImageIcon("back1.jpg");
		
		
		this.setIcon(background_img);
		this.setText("Welcome to the hospital management system");
		
		this.setBounds(0,0,1600,1000);
		this.setVerticalTextPosition(JLabel.TOP);
		
		this.setText("Please choose your Platform ::");
		this.setVerticalTextPosition(JLabel.TOP);
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setForeground(Color.green);
		this.setFont(new Font("MV Boli",Font.BOLD,33));
		this.setIconTextGap(0);//this set gap of text and image

		
	}

}
