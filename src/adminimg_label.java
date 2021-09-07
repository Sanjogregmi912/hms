
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class adminimg_label extends JLabel {
	adminimg_label(){
	Border Border =BorderFactory.createEmptyBorder();
	
	ImageIcon doctor_img = new ImageIcon("admin.png");
	this.setIcon(doctor_img);
	this.setBorder(Border);
	this.setBounds(800,200,120,120);
	}
}
