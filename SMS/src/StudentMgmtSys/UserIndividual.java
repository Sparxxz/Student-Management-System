package StudentMgmtSys;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class UserIndividual extends JFrame {
	Connection con = null;
	ResultSet r = null;
	PreparedStatement pstm;
	private JButton jButton1, jButton2, jButton3, jButton4;
	private JLabel jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel19,
			jLabel2, jLabel20, jLabel21, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9;
	private JPanel jPanel1, jPanel2, jPanel3;
	private JTextField jTextField1, jTextField10, jTextField11, jTextField12, jTextField13, jTextField14, jTextField15,
			jTextField16, jTextField17, jTextField18, jTextField19, jTextField2, jTextField20, jTextField21,
			jTextField22, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7, jTextField8, jTextField9;
	private JLabel lbl_img1;

	public UserIndividual() {
		// TODO Auto-generated constructor stub
		initComponents();
		con = dbconnect.java_db();
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
		setResizable(false);
		setTitle("Student Management System");

	}

	private void initComponents() {
		jPanel1 = new JPanel();
		jButton4 = new JButton();
		jPanel2 = new JPanel();
		jLabel1 = new JLabel();
		jTextField1 = new JTextField();
		jButton1 = new JButton();
		jButton2 = new JButton();
		jButton3 = new JButton();
		jPanel3 = new JPanel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jTextField2 = new JTextField();
		jLabel4 = new JLabel();
		jTextField3 = new JTextField();
		jLabel5 = new JLabel();
		jTextField4 = new JTextField();
		jTextField5 = new JTextField();
		jLabel7 = new JLabel();
		jLabel6 = new JLabel();
		jTextField6 = new JTextField();
		jLabel8 = new JLabel();
		jTextField7 = new JTextField();
		jLabel9 = new JLabel();
		jTextField8 = new JTextField();
		jLabel10 = new JLabel();
		jTextField9 = new JTextField();
		jLabel11 = new JLabel();
		jTextField10 = new JTextField();
		jLabel12 = new JLabel();
		jTextField11 = new JTextField();
		jLabel13 = new JLabel();
		jTextField12 = new JTextField();
		jLabel14 = new JLabel();
		jLabel15 = new JLabel();
		jTextField13 = new JTextField();
		jTextField14 = new JTextField();
		jLabel16 = new JLabel();
		jLabel17 = new JLabel();
		lbl_img1 = new JLabel();
		jLabel19 = new JLabel();
		jLabel20 = new JLabel();
		jTextField15 = new JTextField();
		jTextField16 = new JTextField();
		jTextField17 = new JTextField();
		jTextField18 = new JTextField();
		jLabel21 = new JLabel();
		jTextField19 = new JTextField();
		jTextField20 = new JTextField();
		jTextField21 = new JTextField();
		jTextField22 = new JTextField();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jPanel1.setBackground(new Color(0, 51, 153));

		jButton4.setBackground(Color.LIGHT_GRAY);
		jButton4.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/headeruser.jpg"))); // NOI18N
		jButton4.setActionCommand("");

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jButton4));

		jPanel2.setBackground(Color.DARK_GRAY);

		jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 15)); // NOI18N
		jLabel1.setText("Search Student By ID");

		jTextField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jTextField1.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				jTextField1KeyReleased(evt);
			}
		});

		jButton1.setBackground(new Color(204, 204, 204));
		jButton1.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jButton1.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/logout.png"))); // NOI18N
		jButton1.setText("Logged Out");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new Color(204, 204, 204));
		jButton2.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jButton2.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/erase.png"))); // NOI18N
		jButton2.setText("Reset");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new Color(204, 204, 204));
		jButton3.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jButton3.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/back.png"))); // NOI18N
		jButton3.setText("Back");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(
						jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(77, 77, 77)
										.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 157,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 387,
												GroupLayout.PREFERRED_SIZE)
										.addGap(158, 158, 158)
										.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 117,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 98,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)));

		jPanel3.setBackground(Color.LIGHT_GRAY);

		jLabel2.setFont(new Font("Tahoma", 1, 18)); // NOI18N
		jLabel2.setForeground(new Color(51, 51, 255));
		jLabel2.setText("Student Details Information");

		jLabel3.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel3.setText("First name");

		jTextField2.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel4.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel4.setText("JEE Roll.No");

		jTextField3.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel5.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel5.setText("Application ID");

		jTextField4.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField5.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel7.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel7.setText("Form no.");

		jLabel6.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel6.setText("Middle Name");

		jTextField6.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel8.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel8.setText("Last Name");

		jTextField7.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel9.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel9.setText("Email");

		jTextField8.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jTextField8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jTextField8ActionPerformed(evt);
			}
		});

		jLabel10.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel10.setText("Contact no");

		jTextField9.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel11.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel11.setText("Date Of Birth");

		jTextField10.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jTextField10.setText("Year/month/day");

		jLabel12.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel12.setText("Father Name");

		jTextField11.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel13.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel13.setText("Mother Name");

		jTextField12.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel14.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel14.setText("Aadhaar No.");

		jLabel15.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel15.setText("Permanent Address");

		jTextField13.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField14.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel16.setFont(new Font("Tahoma", 1, 14)); // NOI18N
		jLabel16.setText("Level");

		jLabel17.setFont(new Font("Tahoma", 1, 18)); // NOI18N
		jLabel17.setForeground(new Color(51, 51, 255));
		jLabel17.setText("Academic Details:");

		lbl_img1.setFont(new Font("Tahoma", 1, 18)); // NOI18N
		lbl_img1.setForeground(new Color(51, 51, 255));
		lbl_img1.setText("Display Image");

		jLabel19.setFont(new Font("Tahoma", 1, 14)); // NOI18N
		jLabel19.setText("Passed Year");

		jLabel20.setFont(new Font("Tahoma", 1, 14)); // NOI18N
		jLabel20.setText("Board");

		jTextField15.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField16.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField17.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField18.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel21.setFont(new Font("Tahoma", 1, 14)); // NOI18N
		jLabel21.setText("Percentage %");

		jTextField19.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField20.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField21.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField22.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(jPanel3Layout.createSequentialGroup()
											.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
												.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
													.addGroup(jPanel3Layout.createSequentialGroup()
														.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(jTextField5))
													.addGroup(jPanel3Layout.createSequentialGroup()
														.addGap(6)
														.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
												.addGroup(jPanel3Layout.createSequentialGroup()
													.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
											.addGap(18)
											.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
												.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
													.addGroup(jPanel3Layout.createSequentialGroup()
														.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
													.addGroup(jPanel3Layout.createSequentialGroup()
														.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(jTextField6)))
												.addGroup(jPanel3Layout.createSequentialGroup()
													.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
											.addGap(65))
										.addGroup(jPanel3Layout.createSequentialGroup()
											.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
												.addGroup(jPanel3Layout.createSequentialGroup()
													.addComponent(jLabel15)
													.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(jLabel14))
												.addGroup(jPanel3Layout.createSequentialGroup()
													.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(jTextField14, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(jPanel3Layout.createSequentialGroup()
											.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
												.addGroup(jPanel3Layout.createSequentialGroup()
													.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
														.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel11)
														.addComponent(jLabel5))
													.addGap(31)
													.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
														.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
														.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
														.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)))
												.addComponent(jTextField12, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE))
											.addGap(4))
										.addGroup(jPanel3Layout.createSequentialGroup()
											.addGap(62)
											.addComponent(jTextField13, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))))
								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addGap(142)
									.addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel3Layout.createSequentialGroup()
											.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(jTextField22, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
											.addGap(101)
											.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(jTextField15, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField19, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel20)))
										.addComponent(jTextField18, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
									.addGap(61)
									.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jTextField16, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField20, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel21, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))))
							.addGap(15)
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jTextField17, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
									.addGap(33))
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addComponent(lbl_img1, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
									.addGap(25))
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addComponent(jTextField21, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(979, Short.MAX_VALUE))))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
									.addComponent(jLabel10, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel11)
										.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
								.addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
									.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
									.addComponent(jTextField14, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
									.addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
									.addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
									.addComponent(jTextField13, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
								.addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
							.addGap(15)
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
									.addGap(19))
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jLabel20, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel21, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jTextField15, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField16, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField17, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField22, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addGap(21)
							.addComponent(lbl_img1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jTextField18, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(jTextField19, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(jTextField20, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(jTextField21, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		jPanel3.setLayout(jPanel3Layout);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jTextField1ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed

	}// GEN-LAST:event_jTextField1ActionPerformed

	private void jButton2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jTextField4.setText("");
		jTextField5.setText("");
		jTextField6.setText("");
		jTextField7.setText("");
		jTextField8.setText("");
		jTextField9.setText("");
		jTextField10.setText("");
		jTextField11.setText("");
		jTextField12.setText("");
		jTextField13.setText("");
		jTextField14.setText("");
		jTextField15.setText("");
		jTextField16.setText("");
		jTextField17.setText("");
		jTextField18.setText("");
		jTextField19.setText("");
		jTextField20.setText("");
		jTextField21.setText("");
		jTextField22.setText("");
		lbl_img1.setIcon(null);

	}// GEN-LAST:event_jButton2ActionPerformed

	private void jTextField8ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jTextField8ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField8ActionPerformed

	private void jButton3ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		new UserSide().setVisible(true);
		dispose();

	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton1ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		new smslog().setVisible(true);
		dispose();
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jTextField1KeyReleased(KeyEvent evt) {// GEN-FIRST:event_jTextField1KeyReleased
		ResultSet rs = null;
		PreparedStatement pst = null;

		try (Connection conn = dbconnect.java_db()) {
			String sql = "select * from infoTable where app_id=? ";

			pst = conn.prepareStatement(sql);
			pst.setString(1, jTextField1.getText());
			rs = pst.executeQuery();
			while (rs.next()) {

				String add1 = rs.getString("form_id");
				jTextField2.setText(add1);
				String add2 = rs.getString("jee_roll_no");
				jTextField3.setText(add2);
				String add3 = rs.getString("app_id");
				jTextField4.setText(add3);
				String add4 = rs.getString("first_name");
				jTextField5.setText(add4);
				String add5 = rs.getString("middle_name");
				jTextField6.setText(add5);
				String add6 = rs.getString("last_name");
				jTextField7.setText(add6);
				String add7 = rs.getString("email");
				jTextField8.setText(add7);
				String add8 = rs.getString("contact");
				jTextField9.setText(add8);
				String add9 = rs.getString("dob");
				jTextField10.setText(add9);
				String add10 = rs.getString("father_name");
				jTextField14.setText(add10);
				String add11 = rs.getString("mother_name");
				jTextField12.setText(add11);
				String add12 = rs.getString("permanent_add");
				jTextField11.setText(add12);
				String add13 = rs.getString("aadhaar_no");
				jTextField13.setText(add13);
				String add14 = rs.getString("particular_school");
				jTextField22.setText(add14);
				String add15 = rs.getString("particular_higherschool");
				jTextField18.setText(add15);
				String add16 = rs.getString("board");
				jTextField15.setText(add16);
				String add17 = rs.getString("name_of_higherschool");
				jTextField19.setText(add17);
				String add18 = rs.getString("percentage_school");
				jTextField16.setText(add18);
				String add19 = rs.getString("percentage_higherschool");
				jTextField20.setText(add19);
				String add20 = rs.getString("passed_year_school");
				jTextField17.setText(add20);
				String add21 = rs.getString("passed_year_higherschool");
				jTextField21.setText(add21);
				byte[] img = rs.getBytes("image");
				ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_img1.getWidth(),
						lbl_img1.getHeight(), Image.SCALE_SMOOTH));
				lbl_img1.setIcon(imageIcon);
			}
		} catch (Exception e) {

		} finally {

			try {

				rs.close();
				pst.close();

			} catch (Exception e) {

			}
		}

	}

}
