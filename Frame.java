import java.awt.BorderLayout;
import java.awt.Color;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import hms.Docimage_label;
import hms.adminimg_label;
import hms.paitentimg_label;


public class Frame  extends JFrame {
	Docimage_label doc_img= new Docimage_label();
	paitentimg_label patientimg= new paitentimg_label();
	adminimg_label adminimg = new adminimg_label();
	panel1 pane =new panel1();
	
	Frame(){
		this.setTitle("Hospital Management System");
		this.setSize(1600,900);
		
	
	    
		// getting the background color
		this.getContentPane().setBackground(new Color(123,50,250));
		
		//getting the icon
		ImageIcon image = new ImageIcon("title.jpg");
		this.setIconImage(image.getImage());
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		
		
		
		
		this.add(doc_img);
		this.add(patientimg);
		this.add(adminimg);
		this.add(pane);
		
		}
		
		
	}


