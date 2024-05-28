package Hospital;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener {

    JFrame f;
    JPanel panel;
    JLabel l1, l2, l3, l4;
    JTextField tf;
    JPasswordField pf;
    JButton btn1, btn2;

    LoginPage() {
        f = new JFrame("Login Page");
        f.setBackground(Color.WHITE);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0, 0, 580, 350);
        l1.setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Hospital/Icons/2.jpeg"));
        Image i = img.getImage().getScaledInstance(580, 350, Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(i);
        l1.setIcon(img1);

        l2 = new JLabel("Login Page");
        l2.setBounds(198, 30, 500, 50);
        l2.setFont(new Font("Airal", Font.BOLD, 30));
        l2.setForeground(Color.BLACK);
        l1.add(l2);
        f.add(l1);
        l3 = new JLabel("Username :");
        l3.setBounds(130, 120, 150, 30);
        l3.setFont(new Font("Airal", Font.BOLD, 20));
        l3.setForeground(Color.BLACK);
        l1.add(l3);

        l4 = new JLabel("Password :");
        l4.setBounds(130, 170, 150, 30);
        l4.setFont(new Font("Airal", Font.BOLD, 20));
        l4.setForeground(Color.BLACK);
        l1.add(l4);

        tf = new JTextField();
        tf.setBounds(310, 120, 150, 30);
        l1.add(tf);

        pf = new JPasswordField();
        pf.setBounds(310, 170, 150, 30);
        l1.add(pf);
        btn1 = new JButton("Login");
        btn1.setBounds(130, 220, 150, 40);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        l1.add(btn1);
        btn2 = new JButton("Back");
        btn2.setBounds(310, 220, 150, 40);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        l1.add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        f.setVisible(true);
        f.setSize(580, 350);
        f.setLocation(300, 100);
        f.setResizable(false);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn1) {
            
            try {
                ConnectionClass obj = new ConnectionClass();
                String username = tf.getText();
                String password = pf.getText();
                String q = "select * from admin Where username ='"+username+"' and password = '"+password+"'";
               // String r = "select * from patient Where username ='"+username+"' and password = '"+password+"'";
               PreparedStatement pstmt = obj.con.prepareStatement(q);
                ResultSet rs = pstmt.executeQuery(q);
               // ResultSet prs = pstmt.executeQuery(r);
                if(rs.next())
                {
                   // System.out.println("login");
                    String adminname = rs.getString("username");
                    new AdminHomePage(adminname).setVisible(true);
                   f.setVisible(false);
                 }
                /* else if(prs.next())
                {
                   // System.out.println("login");
                    String patientname = prs.getString("username");
                    new PatientHomePage(patientname).setVisible(true);
                     f.setVisible(false);
                }*/
                else
                {
                    JOptionPane.showMessageDialog(null,"you hava entered Wrong username and Password!");
                    f.setVisible(false);
                    f.setVisible(true);
                }
                }
             catch (Exception Ex) {
                Ex.printStackTrace();
            }

        }
        if (ae.getSource() == btn2) {
            this.f.setVisible(false);
            new Index();
        }
    }

    public static void main(String[] args)
{

        new LoginPage();
    }
}
