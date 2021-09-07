
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class paitentimg_label extends JLabel{
	paitentimg_label(){
		Border Border =BorderFactory.createEmptyBorder();
		
		ImageIcon doctor_img = new ImageIcon("patient.png");
		this.setIcon(doctor_img);
		this.setBorder(Border);
		this.setBounds(800,600,120,120);
		

		
	}


}
