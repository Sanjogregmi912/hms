import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class Frame  extends JFrame  implements ActionListener{
	Docimage_label doc_img= new Docimage_label();
	paitentimg_label patientimg= new paitentimg_label();
	adminimg_label adminimg = new adminimg_label();
	Label label = new Label();
	JButton Adminbutton = new JButton("Admin");
	JButton doctorbutton = new JButton("doctor ");
	JButton Patientbutton = new JButton("Patient ");
	Frame(){
		
		Adminbutton.setBounds(950,250,200,40);
		Adminbutton.setFocusable(false);
		Adminbutton.setVisible(true);
		Adminbutton.addActionListener( this);
		
		doctorbutton.setBounds(950,450,200,40);
		doctorbutton.setFocusable(false);
		doctorbutton.setVisible(true);
		doctorbutton.addActionListener( this);
		
		Patientbutton.setBounds(950,650,200,40);
		Patientbutton.setFocusable(false);
		doctorbutton.setVisible(true);
		Patientbutton.addActionListener( this);
		
		
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
		this.add(label);
		this.add(Adminbutton);
		this.add(doctorbutton);
		this.add(Patientbutton);
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {
			if (e.getSource()==Adminbutton) {
				adminwindow  adminwin= new adminwindow();
			}
			else if(e.getSource() == doctorbutton) {
				doctorwindow docwin = new doctorwindow();
			}
			else if (e.getSource() == Patientbutton) {
				paitentwindow patientwin = new paitentwindow();
			}
		
	}
		
		
		
	}


