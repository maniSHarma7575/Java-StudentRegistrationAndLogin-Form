import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class Form {

	private JFrame frame;
	private JFrame frame1,frame2;
	private JTable table;
	private JTextField sname;
	private JLabel lblFathersName;
	private JLabel lblMothersName;
	private JTextField fname;
	private JTextField mname;
	private JLabel lblRollNumber;
	private JLabel lblBranch;
	private JLabel lblDateOfBirth;
	private JTextField rnumber;
	private JTextField aadhaar;
	private JTextField district;
	private JTextField email;
	private JTextField confirmemail;
	private JTextField alternative;
	private JTextField mobile;
	private JTextField uname;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("FormForYou");
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(1000, 1000, 4500, 3000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String date[]=new String[32];
		date[0]="dd";
		for(int i=1;i<31;i++)
			date[i]=Integer.toString(i);
		String month[]=new String[13];
		month[0]="mm";
		for(int i=1;i<13;i++)
			month[i]=Integer.toString(i);
		String[] year=new String[32];
		year[0]="yyyy";
		for(int i=1990;i<=2019;i++)
			year[i-1989]=Integer.toString(i);
		
		String branc[]= {"          SELECT        ","Computer Science","Mechanical","Electronics","Electrical","Chemical","Bio Chemical","Civil"};
		 String state[]={"          SELECT        ","Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Delhi","Goa","Gujrat","Haryana","Himachal Pardesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Manipur","Meghalya","Mizoram","Nagaland","Odisha","Punjab","Rajisthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
		 String religion[]= {"         SELECT        ","Hinduism","Islam","Christianity","Sikhism","Buddhism","Jainism","Others"};
		table = new JTable();
		table.setBounds(213, 69, 0, 0);
		frame.getContentPane().add(table);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblStudentName.setBounds(59, 69, 212, 36);
		frame.getContentPane().add(lblStudentName);
		
		JLabel lblRegistrationForm = new JLabel("Registration Form");
		lblRegistrationForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationForm.setForeground(Color.BLUE);
		lblRegistrationForm.setFont(new Font("Dyuthi", Font.BOLD, 36));
		lblRegistrationForm.setBackground(Color.LIGHT_GRAY);
		lblRegistrationForm.setBounds(213, 12, 761, 36);
		frame.getContentPane().add(lblRegistrationForm);
		
		sname = new JTextField();
		sname.setBounds(289, 69, 253, 32);
		frame.getContentPane().add(sname);
		sname.setColumns(10);
		
		lblFathersName = new JLabel("Fathers Name");
		lblFathersName.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblFathersName.setBounds(59, 134, 212, 36);
		frame.getContentPane().add(lblFathersName);
		
		lblMothersName = new JLabel("Mothers Name");
		lblMothersName.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblMothersName.setBounds(59, 195, 212, 36);
		frame.getContentPane().add(lblMothersName);
		
		fname = new JTextField();
		fname.setColumns(10);
		fname.setBounds(289, 141, 253, 32);
		frame.getContentPane().add(fname);
		
		mname = new JTextField();
		mname.setColumns(10);
		mname.setBounds(289, 202, 253, 32);
		frame.getContentPane().add(mname);
		
		lblRollNumber = new JLabel("Roll Number");
		lblRollNumber.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblRollNumber.setBounds(59, 263, 212, 36);
		frame.getContentPane().add(lblRollNumber);
		
		lblBranch = new JLabel("Branch");
		lblBranch.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblBranch.setBounds(59, 311, 212, 36);
		frame.getContentPane().add(lblBranch);
		
		lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblDateOfBirth.setBounds(59, 368, 212, 36);
		frame.getContentPane().add(lblDateOfBirth);
		
		rnumber = new JTextField();
		rnumber.setColumns(10);
		rnumber.setBounds(289, 256, 253, 32);
		frame.getContentPane().add(rnumber);
		
		JComboBox sbranch = new JComboBox(branc);
		sbranch.setBounds(289, 311, 253, 24);
		frame.getContentPane().add(sbranch);
		
		JComboBox dd = new JComboBox(date);
		dd.setBounds(288, 368, 69, 24);
		frame.getContentPane().add(dd);
		
		JComboBox mm = new JComboBox(month);
		mm.setBounds(369, 368, 69, 24);
		frame.getContentPane().add(mm);
		
		JComboBox yy = new JComboBox(year);
		yy.setBounds(441, 368, 101, 24);
		frame.getContentPane().add(yy);
		
		JLabel lblAadhaarNumber = new JLabel("Aadhaar Number");
		lblAadhaarNumber.setFont(new Font("Manjari Regular", Font.BOLD, 20));
		lblAadhaarNumber.setBounds(59, 428, 212, 36);
		frame.getContentPane().add(lblAadhaarNumber);
		
		aadhaar = new JTextField();
		aadhaar.setColumns(10);
		aadhaar.setBounds(289, 428, 253, 32);
		frame.getContentPane().add(aadhaar);
		
		JLabel lblNationality = new JLabel("Religion");
		lblNationality.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblNationality.setBounds(59, 486, 212, 36);
		frame.getContentPane().add(lblNationality);
		
		JComboBox dharma = new JComboBox(religion);
		dharma.setBounds(289, 496, 253, 24);
		frame.getContentPane().add(dharma);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblState.setBounds(59, 617, 212, 36);
		frame.getContentPane().add(lblState);
		
		JComboBox rajya = new JComboBox(state);
		rajya.setBounds(289, 617, 253, 24);
		frame.getContentPane().add(rajya);
		
		JLabel lblDistrict = new JLabel("District");
		lblDistrict.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblDistrict.setBounds(59, 550, 212, 36);
		frame.getContentPane().add(lblDistrict);
		
		district = new JTextField();
		district.setColumns(10);
		district.setBounds(289, 550, 253, 32);
		frame.getContentPane().add(district);
		
		JLabel lblEmail = new JLabel("e-mail");
		lblEmail.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblEmail.setBounds(689, 53, 212, 36);
		frame.getContentPane().add(lblEmail);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(919, 53, 253, 32);
		frame.getContentPane().add(email);
		
		JLabel lblConfirmEid = new JLabel("Confirm e-id");
		lblConfirmEid.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblConfirmEid.setBounds(689, 134, 212, 36);
		frame.getContentPane().add(lblConfirmEid);
		
		confirmemail = new JTextField();
		confirmemail.setColumns(10);
		confirmemail.setBounds(919, 134, 253, 32);
		frame.getContentPane().add(confirmemail);
		
		JLabel lblAlternateEid = new JLabel("Alternate e-id\n");
		lblAlternateEid.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblAlternateEid.setBounds(689, 195, 212, 36);
		frame.getContentPane().add(lblAlternateEid);
		
		alternative = new JTextField();
		alternative.setColumns(10);
		alternative.setBounds(919, 195, 253, 32);
		frame.getContentPane().add(alternative);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Manjari Regular", Font.BOLD, 25));
		lblMobile.setBounds(689, 249, 212, 36);
		frame.getContentPane().add(lblMobile);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(919, 242, 253, 32);
		frame.getContentPane().add(mobile);
		
		JLabel lblLoginDetails = new JLabel("Login Details");
		lblLoginDetails.setFont(new Font("Chilanka", Font.BOLD | Font.ITALIC, 24));
		lblLoginDetails.setForeground(Color.MAGENTA);
		lblLoginDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginDetails.setBounds(689, 311, 483, 30);
		frame.getContentPane().add(lblLoginDetails);
		
		JButton btnNewButton = new JButton("Username");
		btnNewButton.setFont(new Font("Chilanka", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(689, 378, 212, 46);
		frame.getContentPane().add(btnNewButton);
		
		uname = new JTextField();
		uname.setBounds(919, 378, 253, 46);
		frame.getContentPane().add(uname);
		uname.setColumns(10);
		
		JButton btnPassword = new JButton("Password");
		btnPassword.setFont(new Font("Chilanka", Font.BOLD | Font.ITALIC, 14));
		btnPassword.setBounds(689, 453, 212, 46);
		frame.getContentPane().add(btnPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(919, 453, 253, 46);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String StudentName=sname.getText();
				String FathersName=fname.getText();
				String MothersName=mname.getText();
				String RollNumber=rnumber.getText();
				String BranchName=sbranch.getSelectedItem().toString();
				String DateName=dd.getSelectedItem().toString();
				String MonthName=mm.getSelectedItem().toString();
				String YearName=yy.getSelectedItem().toString();
				String AadhaarNumber=aadhaar.getText();
				String ReligionName=dharma.getSelectedItem().toString();
				String DistrictName=district.getText();
				String StateName=rajya.getSelectedItem().toString();
				String Email=email.getText();
				String ConfirmEmail=confirmemail.getText();
				String AlternativeEmail=alternative.getText();
				String MobileNumber=mobile.getText();
				String UserName=uname.getText();
				String Password=passwordField.getText();
				
				String url="jdbc:mysql://127.0.0.1:3306/registration";
				String uname="sharma";
				String password="M@ths7575";
			
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,password);
					Statement st=con.createStatement();
					int rs=st.executeUpdate("insert into student values('"+StudentName+"','"+FathersName+"','"+MothersName+"','"+RollNumber+"','"+BranchName+"','"+DateName+"','"+MonthName+"','"+YearName+"','"+AadhaarNumber+"','"+ReligionName+"','"+DistrictName+"','"+StateName+"','"+Email+"','"+AlternativeEmail+"','"+MobileNumber+"','"+UserName+"','"+Password+"')");
					st.close();
					con.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
	
					e.printStackTrace();
				}
				try {
					frame2(UserName);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(829, 560, 183, 46);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblSignin = new JLabel("Have an Account?");
		lblSignin.setFont(new Font("FreeSerif", Font.ITALIC, 20));
		lblSignin.setBounds(689, 653, 212, 24);
		frame.getContentPane().add(lblSignin);
		
		JButton btnSignin = new JButton("Sign_In");
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame3();
			}
		});
		btnSignin.setForeground(Color.WHITE);
		btnSignin.setBackground(Color.RED);
		btnSignin.setBounds(919, 648, 114, 25);
		frame.getContentPane().add(btnSignin);
	}
	void frame3()
	{
		frame2 = new JFrame();
		frame2.setBounds(1000, 1000, 4500, 3000);
		frame2.setTitle("Registration Details");
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Student Details");
		lblNewLabel.setFont(new Font("Manjari Bold", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(207, 12, 889, 45);
		frame2.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterYourLogin = new JLabel("Enter your Login Details");
		lblEnterYourLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourLogin.setForeground(Color.MAGENTA);
		lblEnterYourLogin.setFont(new Font("Chilanka", Font.BOLD | Font.ITALIC, 24));
		lblEnterYourLogin.setBounds(405, 114, 483, 30);
		frame2.getContentPane().add(lblEnterYourLogin);
		
		JButton button = new JButton("Username");
		button.setFont(new Font("Chilanka", Font.BOLD | Font.ITALIC, 14));
		button.setBounds(408, 189, 212, 46);
		frame2.getContentPane().add(button);
		
		JTextField textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(655, 188, 253, 46);
		frame2.getContentPane().add(textField);
		
		JButton button_1 = new JButton("Password");
		button_1.setFont(new Font("Chilanka", Font.BOLD | Font.ITALIC, 14));
		button_1.setBounds(408, 273, 212, 46);
		frame2.getContentPane().add(button_1);
		
		JPasswordField passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(655, 273, 253, 46);
		frame2.getContentPane().add(passwordField_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.RED);
		btnLogin.setBounds(546, 376, 183, 46);
		frame2.getContentPane().add(btnLogin);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String usern=textField.getText();
				String pass=passwordField_1.getText();
				
				String url="jdbc:mysql://127.0.0.1:3306/registration";
				String uname="sharma";
				String password="M@ths7575";
				String query="select * from student where username='"+usern+"' and Password='"+pass+"'";
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,password);
					Statement st1=con.createStatement();
					ResultSet rs=st1.executeQuery(query);
					if(rs.next())
					{
						frame2(usern);
					
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Username and Password didn't match!","Oops next Time",JOptionPane.INFORMATION_MESSAGE);
					}
					con.close();
					st1.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					
					e.printStackTrace();
				}
				
				
			}
		});
		
	}
	void frame2(String UserName) throws SQLException
    { 
		frame1 = new JFrame();
		frame1.setBounds(1000, 1000, 4500, 3000);
		frame1.setTitle("Registration Details");
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		String url="jdbc:mysql://127.0.0.1:3306/registration";
		String uname="sharma";
		String password="M@ths7575";
		String query="select * from student where username='"+UserName+"'";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con=DriverManager.getConnection(url,uname,password);
		Statement st1=con.createStatement();
		ResultSet rs=st1.executeQuery(query);
		if(rs.next())
		{
		JLabel lblNewLabel = new JLabel("Registration Details");
		
		lblNewLabel.setFont(new Font("Manjari Bold", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(207, 12, 889, 45);
		frame1.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name");
		lblNewLabel_1.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(55, 79, 259, 36);
		frame1.getContentPane().add(lblNewLabel_1);
		
		JLabel lblFathersName = new JLabel("Father Name");
		lblFathersName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFathersName.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblFathersName.setBounds(55, 120, 259, 36);
		frame1.getContentPane().add(lblFathersName);
		
		JLabel lblMotherName = new JLabel("Mother Name");
		lblMotherName.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotherName.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblMotherName.setBounds(55, 158, 259, 36);
		frame1.getContentPane().add(lblMotherName);
		
		JLabel lblRollNumber = new JLabel("Roll Number");
		lblRollNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblRollNumber.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblRollNumber.setBounds(55, 196, 259, 36);
		frame1.getContentPane().add(lblRollNumber);
		
		JLabel lblBranchName = new JLabel("Branch Name");
		lblBranchName.setHorizontalAlignment(SwingConstants.CENTER);
		lblBranchName.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblBranchName.setBounds(55, 244, 259, 36);
		frame1.getContentPane().add(lblBranchName);
		
		JLabel lblDateName = new JLabel("D.O.B");
		lblDateName.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateName.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblDateName.setBounds(55, 292, 259, 36);
		frame1.getContentPane().add(lblDateName);
		
		JLabel lblAadhaarNumber = new JLabel("Aadhaar Number");
		lblAadhaarNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblAadhaarNumber.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblAadhaarNumber.setBounds(55, 340, 259, 36);
		frame1.getContentPane().add(lblAadhaarNumber);
		
		JLabel lblReligionName = new JLabel("Religion");
		lblReligionName.setHorizontalAlignment(SwingConstants.CENTER);
		lblReligionName.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblReligionName.setBounds(55, 388, 259, 36);
		frame1.getContentPane().add(lblReligionName);
		
		JLabel lblDistrictName = new JLabel("District");
		lblDistrictName.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistrictName.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblDistrictName.setBounds(55, 436, 259, 36);
		frame1.getContentPane().add(lblDistrictName);
		
		JLabel lblStateName = new JLabel("State");
		lblStateName.setHorizontalAlignment(SwingConstants.CENTER);
		lblStateName.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblStateName.setBounds(55, 484, 259, 36);
		frame1.getContentPane().add(lblStateName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblEmail.setBounds(55, 524, 259, 36);
		frame1.getContentPane().add(lblEmail);
		
		JLabel lblAlternativeemail = new JLabel("Alternative Email");
		lblAlternativeemail.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlternativeemail.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblAlternativeemail.setBounds(55, 572, 259, 36);
		frame1.getContentPane().add(lblAlternativeemail);
		
		JLabel lblMobileNumber = new JLabel("Mobile");
		lblMobileNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobileNumber.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		lblMobileNumber.setBounds(55, 615, 259, 36);
		frame1.getContentPane().add(lblMobileNumber);
		
		JLabel label = new JLabel(rs.getString("StudentName"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label.setBounds(523, 79, 445, 36);
		frame1.getContentPane().add(label);
		
		JLabel label_1 = new JLabel(rs.getString("FathersName"));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label_1.setBounds(523, 120, 445, 36);
		frame1.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel(rs.getString("MothersName"));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label_2.setBounds(523, 158, 445, 36);
		frame1.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel(rs.getString("RollNumber"));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label_3.setBounds(523, 196, 445, 36);
		frame1.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel(rs.getString("BranchName"));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label_4.setBounds(523, 244, 445, 36);
		frame1.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel(rs.getString("day")+"/"+rs.getString("month")+"/"+rs.getString("year"));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label_5.setBounds(523, 292, 445, 36);
		frame1.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel(rs.getString("AadhaarNumber"));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label_6.setBounds(523, 340, 445, 36);
		frame1.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel(rs.getString("Religion"));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label_7.setBounds(523, 388, 445, 36);
		frame1.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel(rs.getString("District"));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label_8.setBounds(523, 436, 445, 36);
		frame1.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel(rs.getString("state"));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label_9.setBounds(523, 484, 445, 36);
		frame1.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel(rs.getString("Email"));
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label_10.setBounds(523, 524, 445, 36);
		frame1.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel(rs.getString("alternative"));
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label_11.setBounds(523, 572, 445, 36);
		frame1.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel(rs.getString("Mobile"));
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Manjari Regular", Font.ITALIC, 23));
		label_12.setBounds(523, 615, 445, 36);
		frame1.getContentPane().add(label_12);
		
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Please Enter Correct Details!","Oops next Time",JOptionPane.INFORMATION_MESSAGE);

		}
    }
}
