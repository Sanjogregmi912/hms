import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class paitentwindow  implements ActionListener{
	int clicked = 0;
	 Font font1 = new Font("arial",Font.BOLD,24);
	 
	JPanel panel_main= new JPanel();
	JPanel panel_login = new JPanel();
	JPanel dashboard_panel = new JPanel();
	JPanel option_panel = new JPanel();
	JPanel my_turn_panel = new JPanel();
	JPanel report_panel = new JPanel();
	JPanel Panel_mydetail = new JPanel();
	
	

	
	JTextField user_text = new JTextField();
	JTextField pass_text = new JTextField();
	
	JFrame frame = new JFrame();
	
	
	JLabel label = new JLabel();
	JLabel User_label = new JLabel();
	JLabel pass_label = new JLabel();
	JLabel welcome = new JLabel("Welcome ");
	JLabel user = new JLabel();
	JLabel label_back = new JLabel();
	JLabel  label_back12 = new JLabel();
	JLabel label_add =new JLabel();
	
	
	JButton login_button =new JButton("Login");
	JButton register_button = new JButton("Sign Up");
	JButton login_button2 = new JButton("Login");
	JButton Dashboard_btn = new JButton("Dashboard");
	JButton mydetail_btn = new JButton("My Details");
	JButton my_turn_btn= new JButton("Scedule Details");
	JButton Report_btn = new JButton("Report");
	JButton Systemusers_btn = new JButton("System users");
	JButton back_button = new JButton();
	
	JButton Logout_btn = new JButton("Logout");
	
	// for my details panel 
    JLabel firstname_label = new JLabel();
    JLabel lastname_label = new JLabel();
    JLabel age_label = new JLabel();
    JLabel address_label = new JLabel();
    JLabel department_label = new JLabel();
    JLabel contact_label = new JLabel();
    JLabel timetovisit_label = new JLabel();
    JLabel username_label = new JLabel();
    JLabel password_label = new JLabel();
    JLabel  label_report = new JLabel();
   
    

    JTextField firstname = new JTextField();
    JTextField lastname = new JTextField();
    JTextField age = new JTextField();
    JTextField address = new JTextField();
    JTextField contact = new JTextField();
    JTextField timetovisit = new JTextField();
    JTextField username = new JTextField();
    JTextField paitent_id = new JTextField();
    
    JTextField department = new JTextField();
    JTextField password = new JTextField();


    JButton update = new JButton("Edit");
    
    JButton save_btn = new JButton("Save");
    
    // report panel button
   JButton open_btn = new JButton("Show my Report");
	 
	
	paitentwindow(){
		// my details panel
		paitent_id.setBounds(120, 80, 200, 30);
		paitent_id.setVisible(false);
		

			
			
        firstname_label.setBounds(40, 70, 100, 50);
        firstname_label.setText("First Name:");

        firstname.setBounds(120, 80, 200, 30);
        firstname.setVisible(false);
        firstname.setEditable(false);
        
        
        
        

  

        lastname_label.setBounds(40, 120,100,50);
        lastname_label.setText("Last Name:");

        lastname.setBounds(120, 130, 200, 30);
        lastname.setEditable(false);
        lastname.setVisible(false);

        age_label.setBounds(40, 170, 100, 50);
        age_label.setText("Age:");

        age.setBounds(120, 180, 200, 30);
        age.setEditable(false);
        age.setVisible(false);
        
        address_label.setBounds(40, 220, 100, 50);
        address_label.setText("Address:");

        address.setBounds(120, 230, 200, 30);
        address.setEditable(false);
        address.setVisible(false);
        
        department_label.setBounds(40, 270, 100, 50);
        department_label.setText("Department:");

        department.setBounds(120, 280, 200, 30);
        department.setEditable(false);
        department.setVisible(false);


        contact_label.setBounds(40, 320, 300, 50);
        contact_label.setText("Contact:");

        contact.setBounds(120, 330, 200, 30);
        contact.setEditable(false);
        contact.setVisible(false);
        
        timetovisit_label.setBounds(40, 370, 300, 50);
        timetovisit_label.setText("Time To Visit:");

        timetovisit.setBounds(120, 380, 200, 30);
        timetovisit.setEditable(false);
        timetovisit.setVisible(false);
        
        username_label.setBounds(40, 420, 300, 50);
        username_label.setText("Username  :");

        username.setBounds(120, 430, 200, 30);
        username.setEditable(false);
        username.setVisible(false);


        password_label.setBounds(40, 470, 300, 50);
        password_label.setText("Password :");

        password.setBounds(120, 480, 200, 30);
        password.setEditable(false);
        password.setVisible(false);
        
        
        update.setBounds(240, 580, 200, 30);
        update.addActionListener(this);
        update.setBorder(new EtchedBorder(10));
        update.setForeground(Color.blue);
        update.setBackground(Color.white);
        update.setVisible(false);
   
        
        

        
        
        
        save_btn.setBounds(100, 580, 100, 30);
        save_btn.addActionListener(this);
        save_btn.setFocusable(false);
        save_btn.setVisible(false);
        save_btn.setBorder(new EtchedBorder(10));
        save_btn.setForeground(Color.blue);
        save_btn.setBackground(Color.white);
        save_btn.addActionListener( this);
		
		//my details panel labels and textfield is up
        
		// report panel button
        label_add.setText("Click on show my report to view your report");
        label_add.setBounds(20 ,20,500,30);
        label_add.setFont(font1);
        
        open_btn.setBounds(300,50, 200, 100);
        open_btn.addActionListener(this);
        open_btn.setFocusable(false);
        open_btn.setVisible(true);
        open_btn.setBorder(new EtchedBorder(10));
        open_btn.setFont(font1);
        open_btn.setForeground(Color.blue);
        open_btn.setBackground(Color.white);
       
        
		user_text.setBounds(450,250,200,40);
		
		
		
		pass_text.setBounds(450,350,200,40);
		
	
		back_button.setBounds(10,40,150,50);
		back_button.setText("Back");
		back_button.setFocusable(false);
		back_button.setBorder(new EtchedBorder(10));
		back_button.setBackground(Color.white);
		back_button.addActionListener(this);
		back_button.setLayout(new BorderLayout());

		
		login_button.setBounds(250,200,100,50);
		login_button.setFocusable(false);
		login_button.addActionListener(this);
		
		
		register_button.setBounds(550,450,100,50);
		register_button.setFocusable(false);
		register_button.addActionListener(this);
		register_button.setBorder(new EtchedBorder(10));
		register_button.setForeground(Color.black);
		register_button.setBackground(Color.CYAN);
		
		login_button2.setBounds(400,450,100,50);
		login_button2.setFocusable(false);
		login_button2.addActionListener(this);
		login_button2.setVisible(true);
		login_button2.setEnabled(true);
		login_button2.setBorder(new EtchedBorder(10));
		login_button2.setForeground(Color.black);
		login_button2.setBackground(Color.orange);
		
		
		welcome.setBounds(10,10,400,30);
		welcome.setFont(font1);
		
		
		
		
		Dashboard_btn.setBounds(20,20,150,50);
		Dashboard_btn.setFocusable(false);
		Dashboard_btn.addActionListener(this);
		Dashboard_btn.setVisible(false);

		mydetail_btn.setBounds(20,80,150,50);
		mydetail_btn.setFocusable(false);
		mydetail_btn.addActionListener(this);
		mydetail_btn.setVisible(false);

		
		my_turn_btn.setBounds(20,140,150,50);
		my_turn_btn.setFocusable(false);
		my_turn_btn.addActionListener(this);
		my_turn_btn.setVisible(false);
		
		Report_btn.setBounds(20,200,150,50);
		Report_btn.setFocusable(false);
		Report_btn.addActionListener(this);
		Report_btn.setVisible(false);
		
		Logout_btn.setBounds(20,260,150,50);
		Logout_btn.setFocusable(false);
		Logout_btn.addActionListener(this);
		Logout_btn.setVisible(false);
		
		User_label.setBounds(300,250,200,30);
		User_label.setText("Username:");
		User_label.setFont(new Font(null,Font.PLAIN,25));
		
		pass_label.setBounds(300,350,200,30);
		pass_label.setText("Password:");
		pass_label.setFont(new Font(null,Font.PLAIN,25));
		
		dashboard_panel.setBounds(200,0,1400,900);
		dashboard_panel.setBackground(Color.white);
		dashboard_panel.add(welcome);
		
		
		option_panel.setBounds(0,0,200,900);
		option_panel.setBackground(Color.blue);
		option_panel.add(Dashboard_btn);
		option_panel.add(mydetail_btn);
		option_panel.add(my_turn_btn);
		option_panel.add(Report_btn);
		option_panel.add(Logout_btn);
		option_panel.setLayout(new BorderLayout());
		



		
		
		ImageIcon image101 = new ImageIcon("backmydetails.png");
		label_back12.setIcon(image101);
		label_back12.setBounds(0,0,1400,900);
		label_back12.setVisible(true);
		
		Panel_mydetail.setBounds(200,0,1400,900);
		
		
		  Panel_mydetail.add(lastname_label);
          Panel_mydetail.add(age_label);
          Panel_mydetail.add(address_label);
          Panel_mydetail.add(contact_label);
          Panel_mydetail.add(department_label);
          Panel_mydetail.add(firstname_label);
          
          Panel_mydetail.add(timetovisit_label);
          Panel_mydetail.add(username_label);
          Panel_mydetail.add(password_label);

          Panel_mydetail.add(firstname);
          Panel_mydetail.add(lastname);
          Panel_mydetail.add(paitent_id);
    
          Panel_mydetail.add(age);
          Panel_mydetail.add(address);
          Panel_mydetail.add(department);
          Panel_mydetail.add(contact);
          Panel_mydetail.add(timetovisit);
          Panel_mydetail.add(username);
          Panel_mydetail.add(password);

          Panel_mydetail.add(update);
         
          Panel_mydetail.add(save_btn);
          Panel_mydetail.add(back_button);
          Panel_mydetail.add(label_back12);
          Panel_mydetail.setLayout(new BorderLayout());
		
		my_turn_panel.setBounds(200,0,1400,900);
		my_turn_panel.setBackground(Color.green);
		my_turn_panel.setLayout(new BorderLayout());
		
		ImageIcon image25 = new ImageIcon("back_report.jpg");
		label_report.setIcon(image25);
		label_report.setBounds(0,0,1400,900);
		report_panel.setBounds(200,0,1400,900);
		report_panel.add(open_btn);
		report_panel.add(label_add);
		report_panel.add(label_report);
		report_panel.setLayout(new BorderLayout());
		
		
		ImageIcon image1 = new ImageIcon("backpatient.png");
		label_back.setIcon(image1);
	 	label_back.setBounds(0,0,1000,800);
		
		
		panel_login.setBackground(Color.red);
		panel_login.setBounds(0,0,800,1000);
		panel_login.add(back_button);
		panel_login.add(User_label);
		panel_login.add(user_text);
		panel_login.add(pass_label);
		panel_login.add(pass_text);
		panel_login.add(login_button2);
		panel_login.add(register_button);
		panel_login.add(label_back);
		
		panel_login.setLayout(new BorderLayout());
		

		
		
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800,1000);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(panel_login);
		
		

		

	}
	@Override
	public void actionPerformed(ActionEvent e) {

			
			
		 if (e.getSource() == register_button) {
			register regis =new register();
		}
		else if (e.getSource()==login_button2) {
			String username_user = user_text.getText();
			String password_user = pass_text.getText();
			String query = "Select * from register where username='"+username_user+"' and password = '"+password_user+"'";
		
			dbOperation1 db = new dbOperation1();
		
			ResultSet rs = db.select(query);
		
		
			
			try { 
				if(rs.next()) {
					JOptionPane.showMessageDialog(frame, "login Successfull");
					frame.remove(panel_login);
					Dashboard_btn.setVisible(true);
					Logout_btn.setVisible(true);
					Report_btn.setVisible(true);
					mydetail_btn.setVisible(true);
					my_turn_btn.setVisible(true);
					
					
					frame.setSize(1600,900);
					
					frame.add(dashboard_panel);
					frame.add(Panel_mydetail);
					frame.add(my_turn_panel);
					frame.add(option_panel);
					frame.add(report_panel);
					dashboard_panel.add(user);
					user.setBounds(50,30,400,50);
				}
				else {
					JOptionPane.showMessageDialog(panel_login,"incorrect username or password");
					frame.add(panel_login);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			

		}
		else if (e.getSource()==my_turn_btn ) {
			dashboard_panel.setVisible(false);
			Panel_mydetail.setVisible(false);
			my_turn_panel.setVisible(true);
			option_panel.setVisible(true);
			report_panel.setVisible(false);
		}
		else if (e.getSource()==mydetail_btn ) {
			dashboard_panel.setVisible(false);
			Panel_mydetail.setVisible(true);
			my_turn_panel.setVisible(false);
			option_panel.setVisible(true);
			report_panel.setVisible(false);
			update.setVisible(true);
			firstname.setVisible(true);
			lastname.setVisible(true);
			age.setVisible(true);
			address.setVisible(true);
			department.setVisible(true);
			contact.setVisible(true);
			timetovisit.setVisible(true);
			username.setVisible(true);
			password.setVisible(true);
			String username_user = user_text.getText();
			String query1 = "Select * from register where username ='"+username_user+"'";
			dbOperation1 db23 =new dbOperation1();
			ResultSet rs1 =db23.select(query1);
			try {
				while (rs1.next()) {
					paitent_id.setText(rs1.getString("id"));
					firstname.setText(rs1.getString("first_name")) ;
					lastname.setText(rs1.getString("last_name"));
					age.setText(rs1.getString("age"));
					address.setText(rs1.getString("address"));
					department.setText(rs1.getString("department"));
					contact.setText(rs1.getString("contact"));
					timetovisit.setText(rs1.getString("time_to_visit"));
					username.setText(rs1.getString("username"));
					password.setText(rs1.getString("password"));
				
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			
			}



			
	}
		else if (e.getSource()== Report_btn) {
			dashboard_panel.setVisible(false);
			Panel_mydetail.setVisible(false);
			my_turn_panel.setVisible(false);
			option_panel.setVisible(true);
			report_panel.setVisible(true);
			open_btn.setVisible(true);
			
	}		
		else if (e.getSource()== Dashboard_btn) {
		dashboard_panel.setVisible(true);
		Panel_mydetail.setVisible(false);
		my_turn_panel.setVisible(false);
		option_panel.setVisible(true);
		report_panel.setVisible(false);
		
}
		
		else if (e.getSource()== Logout_btn) {
			int reply =	JOptionPane.showConfirmDialog(dashboard_panel, "Do you want to logout","Its sad to see you go", JOptionPane.YES_NO_OPTION);
			if( reply == JOptionPane.YES_OPTION) {
		frame.remove(Panel_mydetail);
		frame.remove(option_panel);
		frame.remove(dashboard_panel);
		frame.remove(report_panel);
		frame.remove(my_turn_panel);
		frame.setSize(800,1000);
		frame.add(panel_login);
		panel_login.setVisible(true);

		user_text.setText("");
		pass_text.setText("");
		

	}
			else {
		dashboard_panel.setVisible(true);
		Panel_mydetail.setVisible(false);
		my_turn_panel.setVisible(false);
		option_panel.setVisible(true);
		report_panel.setVisible(false);

		
		
	}
			
		
	}else if(e.getSource()==back_button) {
		frame.setVisible(false);
		}
	else if (e.getSource()== update) {
		firstname.setEditable(true);
		lastname.setEditable(true);
		age.setEditable(true);
		address.setEditable(true);
		timetovisit.setEditable(true);
		department.setEditable(true);
		contact.setEditable(true);
		username.setEditable(true);
		password.setEditable(true);
		save_btn.setVisible(true);
	}
	else if(e.getSource()==save_btn) {
		clicked++;
		if(clicked ==1) {
		
        String firstName = firstname.getText();
        String lastName = lastname.getText();
        int Age = Integer.parseInt(age.getText());
        age.setText(Integer.toString(Age));
        String Address = address.getText();
        String Department =department.getText();
        String Contact = contact.getText();
        String time_to_visit = (String) timetovisit.getText();
        String Username = username.getText();
        String Password = password.getText();
		String sql = "update register set first_name ='"+firstName+"',last_name='"+lastName+"',age='"+Age+"',address='"+Address+"',department='"+Department+"',contact='"+Contact+"',time_to_visit='"+time_to_visit+"',username='"+Username+"',password='"+Password+"'";
		dbOperation1 db = new dbOperation1();
		int ans =db.update(sql);
		if(ans != 0) {
			JOptionPane.showMessageDialog(frame, "Data Updated Successfully");
		
	}
	}
	}
	else if(e.getSource() == open_btn) {
		String query1 = "Select * from report where paitent_name ='"+user_text.getText()+"'";
		dbOperation1 db23 =new dbOperation1();
		ResultSet rs1 =db23.select(query1);
		try {
			while (rs1.next()) {
				String name = rs1.getString("paitent_name");
				String report = rs1.getString("report_address");
				File file = new File(report);
				Desktop.getDesktop().open(file);
				
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

            }
        

	
	}
public static void main(String[] args) {
	new paitentwindow();
}
}



