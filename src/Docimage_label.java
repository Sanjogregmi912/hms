
import java.awt.Color;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Docimage_label extends JLabel {
	Docimage_label(){
		Border Border =BorderFactory.createEmptyBorder();
		
		ImageIcon doctor_img = new ImageIcon("doctor.png");
		this.setIcon(doctor_img);
		this.setBorder(Border);
		this.setBounds(800,400,120,120);
		

		
	}

}
