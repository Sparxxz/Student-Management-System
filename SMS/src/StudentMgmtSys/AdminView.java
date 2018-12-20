package StudentMgmtSys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class AdminView extends JFrame {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	String sql;
	private JButton jButton1, jButton2, jButton3, jButton4;
	private JLabel lbl;
	private JPanel jPanel1, jPanel2;
	private JScrollPane jScrollPane1;
	private JTable jTable1;
	private JTextField jTextField1;
	private Label label1, label2, label3;
	private Panel panel1;

	public AdminView() {
		// TODO Auto-generated constructor stub
		initComponents();
		conn = dbconnect.java_db();
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		 setLocation(size.width / 2 - getWidth() / 2,size.height / 2 - getHeight() / 2);
		//setLocation(60, 0);
		setResizable(false);
		setTitle("Student Management System");
		updatetable();

	}

	private void updatetable() {
		try {

			String sql = "select * from infoTable";

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			jTable1.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {

			try {
				rs.close();
				pst.close();

			} catch (Exception e) {

			}
		}
	}

	private void initComponents() {

		panel1 = new Panel();
		label1 = new Label();
		label2 = new Label();
		jButton4 = new JButton();
		jButton4.setForeground(Color.LIGHT_GRAY);
		jButton4.setBackground(Color.DARK_GRAY);
		jPanel1 = new JPanel();
		lbl = new JLabel();
		jTextField1 = new JTextField();
		jButton1 = new JButton();
		jButton2 = new JButton();
		jButton3 = new JButton();
		jPanel2 = new JPanel();
		jScrollPane1 = new JScrollPane();
		jTable1 = new JTable();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		panel1.setBackground(new Color(0, 153, 255));

		label1.setText("label1");

		label2.setText("label2");

		jButton4.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/header.jpg"))); // NOI18N
		jButton4.setBorderPainted(false);
		jButton4.setContentAreaFilled(false);
		jButton4.setDefaultCapable(false);
		jButton4.setFocusPainted(false);
		jButton4.setFocusable(false);
		jButton4.setHideActionText(true);
		jButton4.setRequestFocusEnabled(false);
		jButton4.setRolloverEnabled(false);
		jButton4.setVerifyInputWhenFocusTarget(false);
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		GroupLayout panel1Layout = new GroupLayout(panel1);
		panel1.setLayout(panel1Layout);
		panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 1212, GroupLayout.PREFERRED_SIZE));
		panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING,
						panel1Layout.createSequentialGroup().addComponent(jButton4).addGap(0, 0, Short.MAX_VALUE)));

		jPanel1.setBackground(new Color(0, 153, 255));

		lbl.setFont(new Font("Tahoma", 1, 14)); // NOI18N
		lbl.setText("Search Student ByID");

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

		jButton1.setBackground(new Color(102, 255, 0));
		jButton1.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jButton1.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/back.png"))); // NOI18N
		jButton1.setText("Back");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new Color(102, 255, 51));
		jButton2.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jButton2.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/erase.png"))); // NOI18N
		jButton2.setText("Reset");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new Color(102, 255, 0));
		jButton3.setFont(new Font("Tahoma", 1, 12)); // NOI18N
		jButton3.setIcon(new ImageIcon(getClass().getResource("/StudentMgmtSys/ppl.png"))); // NOI18N
		jButton3.setText(" Show Individual");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(
						jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(
										jPanel1Layout.createSequentialGroup().addGap(51, 51, 51)
												.addComponent(lbl, GroupLayout.PREFERRED_SIZE, 159,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 379,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jButton3).addGap(27, 27, 27)
												.addComponent(jButton2).addGap(18, 18, 18).addComponent(jButton1,
														GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
												.addGap(53, 53, 53)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(2, 2, 2).addComponent(jButton2,
								GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(lbl, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addGroup(GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(jButton3))
						.addComponent(jButton1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));

		jPanel2.setBackground(new Color(0, 153, 255));

		jTable1.setBackground(new Color(204, 255, 204));
		jTable1.setFont(new Font("Tahoma", 0, 14)); // NOI18N
		jTable1.setModel(
				new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jTable1.setIntercellSpacing(new Dimension(2, 5));
		jScrollPane1.setViewportView(jTable1);

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jScrollPane1));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jPanel2,GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(6, 6, 6)));
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addComponent(panel1, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jPanel2, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton4ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButton4ActionPerformed

	private void jButton3ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:
		new AdminIndividual().setVisible(true);
		// setVisible(true);
		dispose();

	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton1ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
		new AdminFrame();
		dispose();
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jTextField1ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField1ActionPerformed

	private void jTextField1KeyReleased(KeyEvent evt) {// GEN-FIRST:event_jTextField1KeyReleased
		// TODO add your handling code here:
		try {

			String sql = "select* from infoTable where app_id = ? ";

			pst = conn.prepareStatement(sql);
			pst.setString(1, jTextField1.getText());
			rs = pst.executeQuery();
			jTable1.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {

			try {

				rs.close();
				pst.close();

			} catch (Exception e) {

			}
		}

	}// GEN-LAST:event_jTextField1KeyReleased

	private void jButton2ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
		updatetable();
		jTextField1.setText("");
	}// GEN-LAST:event_jButton2ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdminView().setVisible(true);

			}
		});
	}

}
