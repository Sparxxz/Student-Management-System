package StudentMgmtSys;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class smslog extends JFrame {

    public static void main(String[] args) {
         new smslog();

    }

    
    private JPanel p1;
    private JLabel l1, l2;
    private JTextField t1;
    private JPasswordField pass;
    private JButton b1, b2;
    private ImageIcon img;

    smslog() {

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255, 255, 102));
        
        img = new ImageIcon(getClass().getResource("/StudentMgmtSys/User-icon.png"));
        l1 = new JLabel(img);
        l1.setBounds(0, 0, 215, 360);
        this.add(l1);

       
        l1 = new JLabel("Username");
        l1.setBounds(230, 30, 90, 40);
        l1.setFont(new Font("Serif", Font.PLAIN, 20));

        l2 = new JLabel("Password");
        l2.setBounds(230, 120, 100, 40);
        l2.setFont(new Font("Serif", Font.PLAIN, 20));

        t1 = new JTextField(30);
        t1.setBounds(320, 30, 230, 35);

        pass = new JPasswordField(10);
        pass.setBounds(320, 120, 230, 35);

        b1 = new JButton("User-Login");
        b1.setBounds(230, 250, 100, 50);
        b1.setBackground(new Color(204, 229, 255));
        b1.setMnemonic('u');

        b2 = new JButton("Administrator-Login");
        b2.setBounds(400, 250, 150, 50);
        b2.setBackground(new Color(204, 229, 255));
        b2.setMnemonic('a');

        p1.add(l1);
        p1.add(l2);
        p1.add(t1);
        p1.add(pass);
        p1.add(b1);
        p1.add(b2);

        add(p1);
        setSize(580, 390);
        setVisible(true);
        setResizable(false);
        setLocation(370, 50);
        setTitle("Student Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userlogin();
        adminlogin();

    }

    public void userlogin() {
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String puname = t1.getText();
                String ppaswd = pass.getText();
                if (puname.equals("user") && ppaswd.equals("user")) {
                // user side view
                	UserSide us=new UserSide();
                	us.setVisible(true);
                    dispose();
                } else {

                    JOptionPane.showMessageDialog(null, "Wrong Password or Username");
                    t1.setText("");
                    pass.setText("");
                    t1.requestFocus();
                }
            }
        });
    }

    public void adminlogin() {
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String puname = t1.getText();
                String ppaswd = pass.getText();
                if (puname.equals("admin") && ppaswd.equals("admin")) {
                   // admin side view
                	AdminView av=new AdminView();
                	av.setVisible(true);
                    dispose();
                } else {

                    JOptionPane.showMessageDialog(null, "Wrong Password / Username");
                    t1.setText("");
                    pass.setText("");
                    t1.requestFocus();
                }
            }
        });
    }

}

