
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class DoctorDetails implements ActionListener {
    
    	Font font = new Font("Roboto",Font.PLAIN,18);
        JPanel DoctorDetails_panel = new JPanel();

        JFrame frame = new JFrame("Doctor Details");

        JLabel firstname_label = new JLabel();
        JLabel lastname_label = new JLabel();
        JLabel age_label = new JLabel();
        JLabel address_label = new JLabel();
        JLabel department_label = new JLabel();
        JLabel contact_label = new JLabel();
        JLabel doctorid_label = new JLabel();
        JLabel username_label = new JLabel();
        JLabel password_label = new JLabel();
        JLabel search_label = new JLabel();

        JTextField firstname = new JTextField();
        JTextField lastname = new JTextField();
        JTextField age = new JTextField();
        JTextField address = new JTextField();
        JTextField contact = new JTextField();
        JTextField doctorid = new JTextField();
        JTextField username = new JTextField();
        JTextField search = new JTextField();
        JTextField password = new JTextField();


        JButton update = new JButton("Edit Details");
        JButton Search = new JButton("Search");
        JButton save = new JButton("Save");

       
       JTextField department = new JTextField();



       public DoctorDetails() {
	

            search_label.setBounds(40,0,100,50);
            search_label.setText("Search: ");
            search_label.setFont(font);

            search.setBounds(150,10,200,30);

            doctorid_label.setBounds(40, 50, 100, 50);
            doctorid_label.setText("Doctor ID: ");
            doctorid_label.setFont(font);

            doctorid.setBounds(150, 60, 200, 30);
            doctorid.setEditable(false);


            firstname_label.setBounds(40, 100, 100, 50);
            firstname_label.setText("First Name:");
            firstname_label.setFont(font);

            firstname.setBounds(150, 110, 200, 30);
            firstname.setEditable(false);


            lastname_label.setBounds(380, 100,100,50);
            lastname_label.setText("Last Name:");
            lastname_label.setFont(font);

            lastname.setBounds(490, 110, 200, 30);
            lastname.setEditable(false);

            age_label.setBounds(40, 160, 100, 50);
            age_label.setText("Age:");
            age_label.setFont(font);

            age.setBounds(150, 170, 200, 30);
            age.setEditable(false);

            address_label.setBounds(380, 160, 100, 50);
            address_label.setText("Address:");
            address_label.setFont(font);

            address.setBounds(490, 170, 250, 30);
            address.setEditable(false);

            department_label.setBounds(40, 220, 100, 50);
            department_label.setText("Department:");
            department_label.setFont(font);

            department.setBounds(150, 230, 200, 30);
            department.setEditable(false);
            


            contact_label.setBounds(40, 280, 300, 50);
            contact_label.setText("Contact:");
            contact_label.setFont(font);

            contact.setBounds(150, 290, 200, 30);
            contact.setEditable(false);


            username_label.setBounds(40, 340, 300, 50);
            username_label.setText("Username  :");
            username_label.setFont(font);

            username.setBounds(150, 350, 200, 30);
            username.setEditable(false);



            password_label.setBounds(40, 400, 300, 50);
            password_label.setText("Password :");
            password_label.setFont(font);

            password.setBounds(150, 410, 200, 30);
            password.setEditable(false);
            
            Search.setBounds(380, 10, 100, 30);
            Search.setFont(font);
            Search.addActionListener(this);
            
            save.setBounds(150, 580, 150, 30);
            save.setFont(font);
            save.addActionListener(this);

            update.setBounds(350, 580, 150, 30);
            update.setFont(font);
            update.addActionListener(this);


            DoctorDetails_panel.add(lastname_label);
            DoctorDetails_panel.add(age_label);
            DoctorDetails_panel.add(address_label);
            DoctorDetails_panel.add(contact_label);
            DoctorDetails_panel.add(department_label);
            DoctorDetails_panel.add(firstname_label);
            DoctorDetails_panel.add(search_label);
            DoctorDetails_panel.add(doctorid_label);
            DoctorDetails_panel.add(username_label);
            DoctorDetails_panel.add(password_label);

            DoctorDetails_panel.add(firstname);
            DoctorDetails_panel.add(lastname);
            DoctorDetails_panel.add(search);
            DoctorDetails_panel.add(age);
            DoctorDetails_panel.add(address);
            DoctorDetails_panel.add(department);
            DoctorDetails_panel.add(contact);
            DoctorDetails_panel.add(doctorid);
            DoctorDetails_panel.add(username);
            DoctorDetails_panel.add(password);

            DoctorDetails_panel.add(update);
            DoctorDetails_panel.add(Search);
            DoctorDetails_panel.add(save);

            DoctorDetails_panel.setBounds(0, 0, 1000, 800);
            DoctorDetails_panel.setLayout(new BorderLayout());

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 800);
            frame.setVisible(true);
            frame.setLayout(null);
            frame.add(DoctorDetails_panel);
            frame.setLayout(new BorderLayout());


        }

    int clicked =0;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Search) {
			clicked++;
			if (clicked==1) {
			if(search.getText().equals("")) {
				JOptionPane.showMessageDialog(frame, "there is nothing to search");
			}
			String query = "Select * from doc where first_name ='"+search.getText()+"'";
			dbOperation1 db =new dbOperation1();
			ResultSet rs =db.select(query);
			try {
				while (rs.next()) {
					doctorid.setText(rs.getString("doc_id"));
					firstname.setText(rs.getString("first_name")) ;
					lastname.setText(rs.getString("last_name"));
					age.setText(rs.getString("age"));
					address.setText(rs.getString("address"));
					department.setText(rs.getString("department"));
					contact.setText(rs.getString("contact"));
					username.setText(rs.getString("username"));
					password.setText(rs.getString("password"));
				
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			
			}
			
		}
		}	
		else if (e.getSource()==update) {
			doctorid.setEditable(false);
			firstname.setEditable(true);
			lastname.setEditable(true);
			age.setEditable(true);
			address.setEditable(true);
			department.setEditable(true);
			contact.setEditable(true);
			username.setEditable(true);
			password.setEditable(true);
		}
		else if(e.getSource() == save) {
            String firstName = firstname.getText();
            String lastName = lastname.getText();
            
            int Age = Integer.parseInt(age.getText());
            age.setText(Integer.toString(Age));
            String Address = address.getText();
            String Contact = contact.getText();
            String Username = username.getText();
            String Password = password.getText();
            String Department = department.getText();
            String query = "update register set first_name ='"+firstName+"',last_name='"+lastName+"',age='"+Age+"',address='"+Address+"',department='"+Department+"',contact='"+Contact+"',username='"+Username+"',password='"+Password+"'";
            dbOperation1 db = new dbOperation1();
		int ans =db.update(query);
		if(ans != 0) {
			JOptionPane.showMessageDialog(frame, "Data Updated Successfully");
		}

		}

	}
			
	

	public static void main(String[] args) {
		new DoctorDetails();
    	
	}
}

