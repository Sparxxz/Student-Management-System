package StudentMgmtSys;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.*;
import java.sql.*;

public class AdminFrame extends JFrame {
	public static void main(String[] args) {
		new AdminFrame();
		
	}

	Container c;
	JPanel p1, p2, p3, p4, p5;
	ImageIcon img;
	JLabel l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21;
	JButton logout, save, show, attach;
	JLabel attached;
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/javaclass";
	static final String USER = "student";
	static final String PASS = "student";
	String s;

	public AdminFrame() {
		// TODO Auto-generated constructor stub
		// first panel
		c = getContentPane();
		p1 = new JPanel();
		p1.setBackground(Color.DARK_GRAY);
		p1.setBounds(0, -5, 1200, 85);
		img = new ImageIcon(getClass().getResource("header.jpg"));

		// Second panel
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBackground(Color.LIGHT_GRAY);
		p2.setBounds(0, 80, 1200, 40);
		JLabel label1 = new JLabel("Fill the Following Information:");
		label1.setFont(new Font(label1.getName(), Font.BOLD, 20));
		label1.setForeground(Color.blue);
		p2.add(label1);
		label1.setBounds(20, -5, 300, 50);
		save = new JButton("Save Record");
		save.setBounds(950, 0, 120, 40);
		save.setBackground(new Color(128, 255, 0));
		p2.add(save);
		show = new JButton("show Record");
		show.setBounds(1080, 0, 110, 40);
		show.setBackground(new Color(128, 255, 0));
		p2.add(show);
		logout = new JButton("Log-Out");
		logout.setBounds(820, 0, 120, 40);
		logout.setBackground(new Color(128, 255, 0));
		p2.add(logout);

		// third panel
		p3 = new JPanel();
		p3.setLayout(null);
		p3.setBackground(new Color(150, 150, 255));
		p3.setBounds(0, 80, 1200, 400);

		// fourth panel
		p4 = new JPanel();
		p4.setLayout(null);
		p4.setBounds(0, 480, 1200, 50);
		p4.setBackground(Color.LIGHT_GRAY);
		JLabel label = new JLabel("Accadamin details:");
		label.setBackground(Color.LIGHT_GRAY);
		label.setFont(new Font(label.getName(), Font.BOLD, 20));
		label.setForeground(Color.blue);
		p4.add(label);
		label.setBounds(20, 0, 200, 50);

		// fifth panel
		p5 = new JPanel();
		p5.setLayout(null);
		p5.setBackground(new Color(150, 150, 255));
		JLabel slc = new JLabel("Level");
		slc.setBounds(40, 540, 100, 30);
		slc.setFont(new Font(slc.getName(), Font.BOLD, 18));
		t14 = new JTextField();
		t14.setText("Senior Secondary");
		t14.setBounds(20, 580, 130, 35);
		t15 = new JTextField();
		t15.setText("High School");
		t15.setBounds(20, 640, 130, 35);
		p5.add(slc);
		p5.add(t14);
		p5.add(t15);

		JLabel name = new JLabel("Board");
		name.setBounds(300, 540, 200, 30);
		name.setFont(new Font(name.getName(), Font.BOLD, 18));
		t16 = new JTextField();
		t16.setBounds(230, 580, 300, 35);
		t17 = new JTextField();
		t17.setBounds(230, 640, 300, 35);
		p5.add(name);
		p5.add(t16);
		p5.add(t17);

		JLabel per = new JLabel("Percentage");
		per.setBounds(600, 540, 150, 30);
		per.setFont(new Font(per.getName(), Font.BOLD, 18));
		t18 = new JTextField();
		t18.setBounds(570, 580, 250, 35);
		t19 = new JTextField();
		t19.setBounds(570, 640, 250, 35);
		p5.add(per);
		p5.add(t18);
		p5.add(t19);

		JLabel year = new JLabel(" Passed Year");
		year.setBounds(900, 540, 200, 30);
		year.setFont(new Font(year.getName(), Font.BOLD, 18));
		t20 = new JTextField();
		t20.setBounds(880, 580, 250, 35);
		t21 = new JTextField();
		t21.setBounds(880, 640, 250, 35);
		p5.add(year);
		p5.add(t20);
		p5.add(t21);

		// fifth panel end and start function of third panel body
		l2 = new JLabel("Form no.:");
		l2.setBounds(20, 70, 80, 30);
		t1 = new JTextField(50);
		t1.setBounds(90, 70, 130, 30);

		l3 = new JLabel("JEE Roll.No");
		l3.setBounds(250, 70, 130, 30);
		t2 = new JTextField(50);
		t2.setBounds(350, 70, 150, 30);

		l4 = new JLabel("Application ID:");
		l4.setBounds(530, 70, 130, 30);
		t3 = new JTextField(50);
		t3.setBounds(630, 70, 150, 30);

		l5 = new JLabel("First Name:");
		l5.setBounds(20, 130, 80, 30);
		t4 = new JTextField(50);
		t4.setBounds(90, 130, 150, 30);

		l6 = new JLabel("Middle Name:");
		l6.setBounds(250, 130, 130, 30);
		t5 = new JTextField(50);
		t5.setBounds(350, 130, 160, 30);

		l7 = new JLabel("Last Name:");
		l7.setBounds(550, 130, 130, 30);
		t6 = new JTextField(50);
		t6.setBounds(630, 130, 150, 30);

		l8 = new JLabel("Email:");
		l8.setBounds(20, 190, 80, 30);
		t7 = new JTextField(50);
		t7.setBounds(90, 190, 150, 30);

		l9 = new JLabel("Contact No:");
		l9.setBounds(250, 190, 130, 30);
		t8 = new JTextField(50);
		t8.setBounds(350, 190, 160, 30);

		l10 = new JLabel("Date of Birth:");
		l10.setBounds(550, 190, 130, 30);
		t9 = new JTextField(50);
		t9.setBounds(630, 190, 150, 30);

		l11 = new JLabel("Father Name:");
		l11.setBounds(20, 250, 130, 30);
		t10 = new JTextField(50);
		t10.setBounds(100, 250, 250, 30);

		l12 = new JLabel("Mother Name:");
		l12.setBounds(430, 250, 130, 30);
		t11 = new JTextField(50);
		t11.setBounds(530, 250, 250, 30);

		l13 = new JLabel("Permanent Address:");
		l13.setBounds(20, 310, 130, 30);
		t12 = new JTextField(50);
		t12.setBounds(140, 310, 230, 30);

		l14 = new JLabel("Aadhaar No:");
		l14.setBounds(400, 310, 130, 30);
		t13 = new JTextField(50);
		t13.setBounds(530, 310, 250, 30);

		attach = new JButton("Attach Image");
		attach.setBounds(910, 300, 150, 40);
		p3.add(attach);
		attached = new JLabel("Attach Image Here");
		attached.setBounds(900, 70, 200, 200);
		attached.setFont(new Font(label.getName(), Font.BOLD, 20));
		attached.setForeground(Color.BLACK);
		p3.add(attached);

		// for uploading photo
		attach.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFileChooser file = new JFileChooser();
				file.setCurrentDirectory(new File(System.getProperty("user.home")));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Image", "jpg", "JPG", "JPEG", "png");
				file.addChoosableFileFilter(filter);
				int result = file.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {

					File selectedFile = file.getSelectedFile();
					String path = selectedFile.getAbsolutePath();
					attached.setIcon(ResizeImage(path));
					s = path;
				} else if (result == JFileChooser.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "file not selected");
				}
			}
		});
		
		JLabel lblNewUserPortal = new JLabel("New User Portal");
		lblNewUserPortal.setForeground(Color.LIGHT_GRAY);
		lblNewUserPortal.setFont(new Font("Tahoma", Font.PLAIN, 35));
		p1.add(lblNewUserPortal);
		p3.add(l2);
		p3.add(t1);
		p3.add(l3);
		p3.add(t2);
		p3.add(l4);
		p3.add(t3);
		p3.add(l5);
		p3.add(t4);
		p3.add(l6);
		p3.add(t5);
		p3.add(l7);
		p3.add(t6);
		p3.add(l8);
		p3.add(t7);
		p3.add(l9);
		p3.add(t8);
		p3.add(l10);
		p3.add(t9);
		p3.add(l11);
		p3.add(t10);
		p3.add(l12);
		p3.add(t11);
		p3.add(l13);
		p3.add(t12);
		p3.add(l14);
		p3.add(t13);

		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		c.add(p5);
		// create a constructor for logout save and show button

		setSize(1200, 750);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setTitle("Student Management System Adminstrator Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		shows();
		logout();
		save();
	}

	// image chhose
	public ImageIcon ResizeImage(String Imagepath) {

		ImageIcon myImage = new ImageIcon(Imagepath);
		Image img = myImage.getImage();
		Image newImage = img.getScaledInstance(attached.getWidth(), attached.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon Image = new ImageIcon(newImage);
		return Image;
	}

	// end image chose
	public void logout() {
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smslog r = new smslog();
				r.setVisible(true);
				dispose();

			}
		});
	}

	public void shows() {
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminView ad = new AdminView();
				ad.setVisible(true);
				dispose();
			}
		});
	}

	public void save() {
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
				Statement stmt = null;
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				String s4 = t4.getText();
				String s5 = t5.getText();
				String s6 = t6.getText();
				String s7 = t7.getText();
				String s8 = t8.getText();
				String s9 = t9.getText();
				String s10 = t10.getText();
				String s11 = t11.getText();
				String s12 = t12.getText();
				String s13 = t13.getText();
				String s14 = t14.getText();
				String s15 = t15.getText();
				String s16 = t16.getText();
				String s17 = t17.getText();
				String s18 = t18.getText();
				String s19 = t19.getText();
				String s20 = t20.getText();
				String s21 = t21.getText();

				if (t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("")
						|| t4.getText().equals("") || t6.getText().equals("") || t7.getText().equals("")
						|| t8.getText().equals("") || t9.getText().equals("") || t10.getText().equals("")
						|| t11.getText().equals("") || t12.getText().equals("") || t13.getText().equals("")
						|| t14.getText().equals("") || t15.getText().equals("") || t16.getText().equals("")
						|| t17.getText().equals("") || t18.getText().equals("") || t19.getText().equals("")
						|| t20.getText().equals("") || t21.getText().equals("")) {
					JOptionPane.showMessageDialog(save, "All record Must be fill Out");
				} else {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						conn = DriverManager.getConnection(DB_URL, USER, PASS);
						System.out.println("every thing is ok in connection");
						JOptionPane.showConfirmDialog(null, "Are you sure Insert Data?", "Delete",
								JOptionPane.YES_NO_OPTION);
						PreparedStatement ps = conn.prepareStatement(
								"INSERT INTO infoTable(form_id,jee_roll_no,app_id,first_name,middle_name,"
										+ "last_name,email,contact,dob,father_name,mother_name,permanent_add,"
										+ "aadhaar_no,particular_school,particular_higherschool,board,"
										+ "name_of_higherschool,percentage_school,percentage_higherschool,"
										+ "passed_year_school,passed_year_higherschool,image)"
										+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
						System.out.println("ok in prepared statement");
						InputStream is = new FileInputStream(new File(s));
						ps.setString(1, s1);
						ps.setString(2, s2);
						ps.setString(3, s3);
						ps.setString(4, s4);
						ps.setString(5, s5);
						ps.setString(6, s6);
						ps.setString(7, s7);
						ps.setString(8, s8);
						ps.setString(9, s9);
						ps.setString(10, s10);
						ps.setString(11, s11);
						ps.setString(12, s12);
						ps.setString(13, s13);
						ps.setString(14, s14);
						ps.setString(15, s15);
						ps.setString(16, s16);
						ps.setString(17, s17);
						ps.setString(18, s18);
						ps.setString(19, s19);
						ps.setString(20, s20);
						ps.setString(21, s21);
						ps.setBlob(22, is);
						ps.executeUpdate();
						System.out.println("ok while execute ");
						JOptionPane.showMessageDialog(save, "sucessfully inserted Data");
						t1.setText("");
						t2.setText("");
						t3.setText("");
						t4.setText("");
						t5.setText("");
						t6.setText("");
						t7.setText("");
						t8.setText("");
						t9.setText("");
						t10.setText("");
						t11.setText("");
						t12.setText("");
						t13.setText("");
						t14.setText("");
						t15.setText("");
						t16.setText("");
						t17.setText("");
						t18.setText("");
						t19.setText("");
						t20.setText("");
						t21.setText("");

					} catch (SQLException se) {
						se.printStackTrace();

					} catch (Exception ek) {
						ek.printStackTrace();
					} finally {
						try {
							if (stmt != null) {
								conn.close();
							}
						} catch (SQLException se) {
						}
						try {
							if (conn != null) {
								conn.close();
							}
						} catch (SQLException se) {
							se.printStackTrace();
						} // end finally try
					} // end try
					System.out.println("good bye");
				}
			}
		});
	}
}
