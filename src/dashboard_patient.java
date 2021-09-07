import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class dashboard_patient {
	String user;
	JPanel dashboard_panel = new JPanel();
	JLabel lbl_heading;
	public dashboard_patient() {
		
		dashboard_panel.setBounds(400,0,1200,900);
		dashboard_panel.setBackground(Color.white);
		lbl_heading = new JLabel("welcome" + user);
		lbl_heading.setBounds(200,50,300,50);
		dashboard_panel.add(lbl_heading);
		
		
	}
}
