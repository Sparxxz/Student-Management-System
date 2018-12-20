package StudentMgmtSys;

import java.awt.*;
import java.io.*;
import java.sql.*;
import java.awt.event.*;

import javax.swing.*;

public class AdminIndividual extends JFrame {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstm = null;
	private JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7;
	private JLabel jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18,
			jLabel19, jLabel2, jLabel20, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, lbl_img,
			lbl_img1;
	private JPanel jPanel1, jPanel2;
	private JTextField jTextField1, jTextField10, jTextField11, jTextField12, jTextField13, jTextField14, jTextField15,
			jTextField16, jTextField17, jTextField18, jTextField19, jTextField2, jTextField20, jTextField21,
			jTextField22, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7, jTextField8, jTextField9;
	private ImageIcon format = null;
	String filename = null;
	byte[] person_image = null;

	public AdminIndividual() {
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
		jButton1 = new JButton();
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		jTextField1 = new JTextField();
		jButton2 = new JButton();
		jButton3 = new JButton();
		jButton4 = new JButton();
		jButton5 = new JButton();
		jButton7 = new JButton();
		jPanel2 = new JPanel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jTextField2 = new JTextField();
		jTextField3 = new JTextField();
		jLabel4 = new JLabel();
		jTextField4 = new JTextField();
		jLabel5 = new JLabel();
		jTextField5 = new JTextField();
		jButton6 = new JButton();
		jTextField6 = new JTextField();
		jLabel7 = new JLabel();
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
		jTextField13 = new JTextField();
		jLabel15 = new JLabel();
		jTextField14 = new JTextField();
		jLabel16 = new JLabel();
		jLabel17 = new JLabel();
		jLabel18 = new JLabel();
		jLabel19 = new JLabel();
		jLabel20 = new JLabel();
		jTextField15 = new JTextField();
		jTextField15.setText("Senior Secondary");
		jTextField16 = new JTextField();
		jTextField16.setText("High School");
		jTextField17 = new JTextField();
		jTextField18 = new JTextField();
		jTextField19 = new JTextField();
		jTextField20 = new JTextField();
		jTextField21 = new JTextField();
		jTextField22 = new JTextField();
		jLabel6 = new JLabel();
		lbl_img = new JLabel();
		lbl_img1 = new JLabel();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jButton1.setBackground(Color.LIGHT_GRAY);
		jButton1.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/header.jpg"))); // NOI18N

		jPanel1.setBackground(Color.DARK_GRAY);

		jLabel1.setFont(new Font("Tahoma", 1, 12)); // NOI18N
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

		jButton2.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/logout.png"))); // NOI18N
		jButton2.setText("Logged Out");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/update icon.png"))); // NOI18N
		jButton3.setText("Update");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/delete_16x16.gif"))); // NOI18N
		jButton4.setText("Delete");
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/erase.png"))); // NOI18N
		jButton5.setText("Reset");
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton7.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/back.png"))); // NOI18N
		jButton7.setText("Back");
		jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jPanel2.setBackground(Color.LIGHT_GRAY);

		jLabel2.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel2.setText("Form NO.");

		jLabel3.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel3.setText("First Name");

		jTextField2.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jTextField2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jTextField3.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel4.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel4.setText("JEE Roll.No.");

		jTextField4.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel5.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel5.setText("Application ID");

		jTextField5.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jButton6.setText(" Images");
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jTextField6.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel7.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel7.setText("Middle Name");

		jLabel8.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel8.setText("Last Name");

		jTextField7.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel9.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel9.setText("Email");

		jTextField8.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel10.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel10.setText("Contact no");

		jTextField9.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel11.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel11.setText("Date of Birth");

		jTextField10.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jTextField10.setText("year/month/days");

		jLabel12.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel12.setText("Father Name");

		jTextField11.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel13.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel13.setText("Mother Name");

		jTextField12.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel14.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel14.setText("Permanent  Address");

		jTextField13.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel15.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		jLabel15.setText("Aadhaar No.");

		jTextField14.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel16.setFont(new Font("Tahoma", 1, 18)); // NOI18N
		jLabel16.setForeground(new Color(0, 0, 255));
		jLabel16.setText("Accedamic Details");

		jLabel17.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel17.setText("Level");

		jLabel18.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel18.setText("Board");

		jLabel19.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel19.setText("Precentage %");

		jLabel20.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jLabel20.setText("Passed Year");

		jTextField15.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField16.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField17.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField18.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField19.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField20.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField21.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jTextField22.setFont(new Font("Tahoma", 1, 12)); // NOI18N

		jLabel6.setFont(new Font("Tahoma", 1, 18)); // NOI18N
		jLabel6.setForeground(new Color(0, 0, 255));
		jLabel6.setText("Spot Round Candidate Information");

		lbl_img1.setBackground(new Color(0, 0, 153));
		lbl_img1.setFont(new Font("Tahoma", 1, 14)); // NOI18N
		lbl_img1.setForeground(new Color(0, 0, 255));
		lbl_img1.setText("Image Attach Here");

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup()
												.addComponent(jLabel16,
														GroupLayout.PREFERRED_SIZE, 872, GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, Short.MAX_VALUE))
										.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
												.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
														.createParallelGroup(GroupLayout.Alignment.LEADING, false)
														.addGroup(jPanel2Layout.createSequentialGroup()
																.addGroup(jPanel2Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																		.addGroup(jPanel2Layout.createSequentialGroup()
																				.addComponent(jLabel2,
																						GroupLayout.PREFERRED_SIZE, 88,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(jTextField2,
																						GroupLayout.PREFERRED_SIZE,
																						153,
																						GroupLayout.PREFERRED_SIZE))
																		.addGroup(jPanel2Layout
																				.createParallelGroup(
																						GroupLayout.Alignment.TRAILING,
																						false)
																				.addGroup(jPanel2Layout
																						.createSequentialGroup()
																						.addComponent(jLabel9,
																								GroupLayout.PREFERRED_SIZE,
																								53,
																								GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED,
																								GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(jTextField8,
																								GroupLayout.PREFERRED_SIZE,
																								153,
																								GroupLayout.PREFERRED_SIZE))
																				.addGroup(GroupLayout.Alignment.LEADING,
																						jPanel2Layout
																								.createSequentialGroup()
																								.addComponent(jLabel3,
																										GroupLayout.PREFERRED_SIZE,
																										88,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jTextField3,
																										GroupLayout.PREFERRED_SIZE,
																										153,
																										GroupLayout.PREFERRED_SIZE))))
																.addGap(26, 26, 26)
																.addGroup(jPanel2Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING, false)
																		.addComponent(jLabel10)
																		.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jLabel7,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
																.addGap(26, 26, 26)
																.addGroup(jPanel2Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING, false)
																		.addComponent(jTextField6,
																				GroupLayout.DEFAULT_SIZE, 140,
																				Short.MAX_VALUE)
																		.addComponent(jTextField4)
																		.addComponent(jTextField9)
																		.addComponent(jLabel13,
																				GroupLayout.Alignment.TRAILING,
																				GroupLayout.PREFERRED_SIZE, 95,
																				GroupLayout.PREFERRED_SIZE))
																.addGap(70, 70, 70))
														.addGroup(jPanel2Layout
																.createSequentialGroup().addGroup(jPanel2Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel12).addComponent(jLabel14))
																.addGap(26, 26, 26)
																.addGroup(jPanel2Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING, false)
																		.addComponent(jTextField11,
																				GroupLayout.DEFAULT_SIZE, 251,
																				Short.MAX_VALUE)
																		.addComponent(jTextField13))
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(jLabel15, GroupLayout.PREFERRED_SIZE,
																		124, GroupLayout.PREFERRED_SIZE)
																.addGap(41, 41, 41)))
														.addGroup(jPanel2Layout
																.createParallelGroup(GroupLayout.Alignment.TRAILING,
																		false)
																.addComponent(
																		jTextField14)
																.addGroup(jPanel2Layout
																		.createSequentialGroup()
																		.addGroup(jPanel2Layout
																				.createParallelGroup(
																						GroupLayout.Alignment.LEADING)
																				.addGroup(
																						GroupLayout.Alignment.TRAILING,
																						jPanel2Layout
																								.createSequentialGroup()
																								.addComponent(jLabel8)
																								.addGap(54, 54, 54))
																				.addGroup(jPanel2Layout
																						.createSequentialGroup()
																						.addGroup(jPanel2Layout
																								.createParallelGroup(
																										GroupLayout.Alignment.LEADING)
																								.addComponent(jLabel5)
																								.addComponent(jLabel11,
																										GroupLayout.PREFERRED_SIZE,
																										81,
																										GroupLayout.PREFERRED_SIZE))
																						.addPreferredGap(
																								LayoutStyle.ComponentPlacement.RELATED)))
																		.addGroup(jPanel2Layout
																				.createParallelGroup(
																						GroupLayout.Alignment.LEADING,
																						false)
																				.addComponent(jTextField7)
																				.addComponent(jTextField5)
																				.addComponent(jTextField10,
																						GroupLayout.DEFAULT_SIZE, 210,
																						Short.MAX_VALUE)))
																.addComponent(jTextField12)))
												.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 343,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel2Layout.createSequentialGroup()
														.addGroup(jPanel2Layout
																.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addComponent(jTextField16, GroupLayout.PREFERRED_SIZE,
																		221, GroupLayout.PREFERRED_SIZE)
																.addComponent(jTextField15, GroupLayout.PREFERRED_SIZE,
																		221, GroupLayout.PREFERRED_SIZE)
																.addGroup(jPanel2Layout.createSequentialGroup()
																		.addGap(10, 10, 10).addComponent(jLabel17,
																				GroupLayout.PREFERRED_SIZE, 151,
																				GroupLayout.PREFERRED_SIZE)))
														.addGap(115, 115, 115)
														.addGroup(jPanel2Layout
																.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addComponent(jTextField17, GroupLayout.PREFERRED_SIZE,
																		193, GroupLayout.PREFERRED_SIZE)
																.addComponent(jTextField18, GroupLayout.PREFERRED_SIZE,
																		200, GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 122,
																		GroupLayout.PREFERRED_SIZE))
														.addGap(78, 78, 78)
														.addGroup(jPanel2Layout
																.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 194,
																		GroupLayout.PREFERRED_SIZE)
																.addGroup(jPanel2Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.TRAILING, false)
																		.addComponent(jTextField20,
																				GroupLayout.Alignment.LEADING,
																				GroupLayout.DEFAULT_SIZE, 179,
																				Short.MAX_VALUE)
																		.addComponent(jTextField19,
																				GroupLayout.Alignment.LEADING)))))
												.addGroup(jPanel2Layout
														.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addGroup(jPanel2Layout.createSequentialGroup()
																.addGap(0, 15, Short.MAX_VALUE).addGroup(jPanel2Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																		.addGroup(jPanel2Layout.createSequentialGroup()
																				.addGroup(jPanel2Layout
																						.createParallelGroup(
																								GroupLayout.Alignment.LEADING)
																						.addComponent(jLabel20,
																								GroupLayout.PREFERRED_SIZE,
																								179,
																								GroupLayout.PREFERRED_SIZE)
																						.addGroup(jPanel2Layout
																								.createParallelGroup(
																										GroupLayout.Alignment.LEADING)
																								.addComponent(
																										jTextField22,
																										GroupLayout.Alignment.TRAILING,
																										GroupLayout.PREFERRED_SIZE,
																										233,
																										GroupLayout.PREFERRED_SIZE)
																								.addComponent(
																										jTextField21,
																										GroupLayout.Alignment.TRAILING,
																										GroupLayout.PREFERRED_SIZE,
																										233,
																										GroupLayout.PREFERRED_SIZE)))
																				.addContainerGap(24, Short.MAX_VALUE))
																		.addGroup(GroupLayout.Alignment.TRAILING,
																				jPanel2Layout.createSequentialGroup()
																						.addGap(0, 0, Short.MAX_VALUE)
																						.addComponent(jButton6,
																								GroupLayout.PREFERRED_SIZE,
																								181,
																								GroupLayout.PREFERRED_SIZE)
																						.addGap(38, 38, 38))))
														.addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout
																.createSequentialGroup()
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(lbl_img1, GroupLayout.PREFERRED_SIZE, 212,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(25, 25, 25))))))
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(487, 487, 487)
										.addComponent(lbl_img, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
										.addGap(488, 488, 488))));
		jPanel2Layout
				.setVerticalGroup(
						jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(57, 57, 57)
										.addComponent(lbl_img1, GroupLayout.PREFERRED_SIZE, 200,
												GroupLayout.PREFERRED_SIZE)
										.addGap(29, 29, 29)
										.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 39,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 40,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(jLabel4,
														GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout
														.createSequentialGroup().addGap(0, 6, Short.MAX_VALUE)
														.addGroup(jPanel2Layout
																.createParallelGroup(GroupLayout.Alignment.TRAILING,
																		false)
																.addComponent(jLabel2, GroupLayout.Alignment.LEADING,
																		GroupLayout.PREFERRED_SIZE, 33,
																		GroupLayout.PREFERRED_SIZE)
																.addGroup(jPanel2Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																		.addComponent(jTextField4,
																				GroupLayout.PREFERRED_SIZE, 29,
																				GroupLayout.PREFERRED_SIZE)
																		.addGroup(GroupLayout.Alignment.TRAILING,
																				jPanel2Layout
																						.createParallelGroup(
																								GroupLayout.Alignment.BASELINE)
																						.addComponent(jTextField5,
																								GroupLayout.PREFERRED_SIZE,
																								29,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(jLabel5,
																								GroupLayout.PREFERRED_SIZE,
																								29,
																								GroupLayout.PREFERRED_SIZE)))
																.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE,
																		28, GroupLayout.PREFERRED_SIZE))))
										.addGap(18, 18, 18)
										.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 28,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 32,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel7)
												.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 28,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 32,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 31,
														GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(jLabel9, GroupLayout.Alignment.TRAILING,
														GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel2Layout
														.createParallelGroup(GroupLayout.Alignment.BASELINE)
														.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 35,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel10)
														.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 35,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 22,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 29,
																GroupLayout.PREFERRED_SIZE)))
										.addGap(20, 20, 20)
										.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel12)
												.addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 34,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel13).addComponent(jTextField12,
														GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
										.addGap(33, 33, 33)
										.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 37,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField13, GroupLayout.PREFERRED_SIZE, 37,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel15).addComponent(jTextField14,
														GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 53,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 34,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel18)
												.addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 32,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel20, GroupLayout.PREFERRED_SIZE, 32,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField15, GroupLayout.PREFERRED_SIZE, 35,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField17, GroupLayout.PREFERRED_SIZE, 35,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField19, GroupLayout.PREFERRED_SIZE, 35,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField21, GroupLayout.PREFERRED_SIZE, 38,
														GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField16, GroupLayout.PREFERRED_SIZE, 33,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField18, GroupLayout.PREFERRED_SIZE, 33,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField20, GroupLayout.PREFERRED_SIZE, 34,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField22, GroupLayout.PREFERRED_SIZE, 36,
														GroupLayout.PREFERRED_SIZE))
										.addGap(47, 47, 47))
								.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(200, 200, 200)
												.addComponent(lbl_img, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(200, 200, 200))));

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(jLabel1)
								.addGap(18, 18, 18)
								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButton4)
								.addGap(23, 23, 23).addComponent(jButton3)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButton2))
						.addGroup(GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jPanel2,
										GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jButton7, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE).addGap(1, 1, 1))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGap(6, 6, 6))
						.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButton4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jTextField1, GroupLayout.Alignment.LEADING)
						.addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 1200, Short.MAX_VALUE)
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(jButton1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton6ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
		// TODO add your handling code here:

		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		File f = chooser.getSelectedFile();

		filename = f.getAbsolutePath();
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img1.getWidth(),
				lbl_img1.getHeight(), Image.SCALE_DEFAULT));
		lbl_img1.setIcon(imageIcon);
		try {

			File image = new File(filename);
			FileInputStream fis = new FileInputStream(image);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];

			for (int readNum; (readNum = fis.read(buf)) != -1;) {

				bos.write(buf, 0, readNum);
			}
			person_image = bos.toByteArray();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);

		}

	}// GEN-LAST:event_jButton6ActionPerformed

	private void jTextField1ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField1ActionPerformed

	private void jTextField1KeyReleased(KeyEvent evt) {// GEN-FIRST:event_jTextField1KeyReleased
		// TODO add your handling code here:
		try {
			String sql = "select * from infoTable where app_id=? ";

			pstm = con.prepareStatement(sql);
			pstm.setString(1, jTextField1.getText());
			rs = pstm.executeQuery();
			while (rs.next()) {

				String add1 = rs.getString("form_id");
				jTextField2.setText(add1);
				String add2 = rs.getString("jee_roll_no");
				jTextField4.setText(add2);
				String add3 = rs.getString("app_id");
				jTextField5.setText(add3);
				String add4 = rs.getString("first_name");
				jTextField3.setText(add4);
				String add6 = rs.getString("middle_name");
				jTextField6.setText(add6);
				String add7 = rs.getString("last_name");
				jTextField7.setText(add7);
				String add5 = rs.getString("email");
				jTextField8.setText(add5);
				String add8 = rs.getString("contact");
				jTextField9.setText(add8);
				String add9 = rs.getString("dob");
				jTextField10.setText(add9);
				String add10 = rs.getString("father_name");
				jTextField11.setText(add10);
				String add11 = rs.getString("mother_name");
				jTextField12.setText(add11);
				String add12 = rs.getString("permanent_add");
				jTextField13.setText(add12);
				String add13 = rs.getString("aadhaar_no");
				jTextField14.setText(add13);
				String add14 = rs.getString("particular_school");
				jTextField15.setText(add14);
				String add15 = rs.getString("particular_higherschool");
				jTextField16.setText(add15);
				String add16 = rs.getString("board");
				jTextField17.setText(add16);
				String add17 = rs.getString("name_of_higherschool");
				jTextField18.setText(add17);
				String add18 = rs.getString("percentage_school");
				jTextField19.setText(add18);
				String add19 = rs.getString("percentage_higherschool");
				jTextField20.setText(add19);
				String add20 = rs.getString("passed_year_school");
				jTextField21.setText(add20);
				String add21 = rs.getString("passed_year_higherschool");
				jTextField22.setText(add21);
				byte[] img = rs.getBytes("image");
				ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_img1.getWidth(),
						lbl_img1.getHeight(), Image.SCALE_SMOOTH));
				lbl_img1.setIcon(imageIcon);
			}
		} catch (Exception e) {

		} finally {

			try {

				rs.close();
				pstm.close();

			} catch (Exception e) {

			}
		}

	}// GEN-LAST:event_jTextField1KeyReleased

	private void jTextField2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField2ActionPerformed

	private void jButton2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
		new smslog().setVisible(true);
		dispose();
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton5ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		// TODO add your handling code here:
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
	}// GEN-LAST:event_jButton5ActionPerformed

	private void jButton4ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:
		if (jTextField1.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Record is Not Selected");
		} else {
			int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?", "Delete",
					JOptionPane.YES_NO_OPTION);
			if (p == 0) {
				String sql = "delete from infoTable where app_id=? ";
				try {
					pstm = con.prepareStatement(sql);
					pstm.setString(1, jTextField1.getText());
					pstm.execute();

					JOptionPane.showMessageDialog(null, "Record Deleted successfully");
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
				} catch (Exception e) {

					JOptionPane.showMessageDialog(null, e);
				} finally {

					try {
						rs.close();
						pstm.close();

					} catch (Exception e) {

					}
				}
			}
		}
	}// GEN-LAST:event_jButton4ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:
		if (jTextField1.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Record is Not Selected");
		} else {
			int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Update Record",
					JOptionPane.YES_NO_OPTION);
			if (p == 0) {
				try {
					String value0 = jTextField1.getText();
					String value1 = jTextField2.getText();
					String value2 = jTextField3.getText();
					String value3 = jTextField4.getText();
					String value4 = jTextField5.getText();
					String value5 = jTextField6.getText();
					String value6 = jTextField7.getText();
					String value7 = jTextField8.getText();
					String value8 = jTextField9.getText();
					String value9 = jTextField10.getText();
					String value10 = jTextField11.getText();
					String value11 = jTextField12.getText();
					String value12 = jTextField13.getText();
					String value13 = jTextField14.getText();
					String value14 = jTextField15.getText();
					String value15 = jTextField17.getText();
					String value16 = jTextField19.getText();
					String value17 = jTextField21.getText();
					String value18 = jTextField16.getText();
					String value19 = jTextField18.getText();
					String value20 = jTextField20.getText();
					String value21 = jTextField22.getText();

					String sql = "update infoTable set form_id='" + value1 + "',jee_roll_no='" + value3 + "', app_id='"
							+ value4 + "', " + "first_name='" + value2 + "',middle_name='" + value5 + "',last_name='"
							+ value6 + "',email='" + value7 + "',contact= '" + value8 + "', " + "dob='" + value9
							+ "',father_name ='" + value10 + "',mother_name='" + value11 + "',permanent_add='" + value12
							+ "',aadhaar_no='" + value13 + "',particular_school='" + value14 + "',"
							+ "board='" + value15 + "',percentage_school='" + value16
							+ "',passed_year_school='" + value17 + "'," + "name_of_higherschool='" + value19
							+ "',percentage_higherschool='" + value20 + "',passed_year_higherschool='" + value21
							+ "',particular_higherschool='" + value18 + "'"
							// + "image=?"

							+ "where app_id='" + value0 + "' ";

					pstm = con.prepareStatement(sql);
					// pst.setBytes(1,person_image);
					pstm.execute();
					JOptionPane.showMessageDialog(null, "RecordSuccessfully Updated");

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				} finally {

					try {
						rs.close();
						pstm.close();

					} catch (Exception e) {

					}
				}
			}

		}
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton7ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
		// TODO add your handling code here:
		new AdminView().setVisible(true);
		dispose();
	}// GEN-LAST:event_jButton7ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AdminIndividual.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AdminIndividual.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AdminIndividual.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AdminIndividual.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdminIndividual().setVisible(true);
			}
		});
	}

}
