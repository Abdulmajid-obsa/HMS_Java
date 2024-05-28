package Hospital;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Index extends JFrame implements ActionListener {

    JFrame f;
    JLabel l1, l2, l3, l4;
    JButton btn1, btn2, btn3, btn4;

    Index() {
        f = new JFrame("Index Page");
        f.setBackground(Color.WHITE);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0, 0, 800, 570);
        l1.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Hospital/Icons/12.jpg"));
        Image il = img.getImage().getScaledInstance(800, 570, Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(il);
        l1.setIcon(img1);

        l2 = new JLabel("Hospital Managementing System");
        l2.setBounds(110, 10, 500, 30);
        l2.setFont(new Font("Airal", Font.BOLD, 30));
        l2.setForeground(Color.BLACK);
        l1.add(l2);
        f.add(l1);

        l3 = new JLabel("Provide best quality healthcare for you");
        l3.setBounds(126, 35, 500, 30);
        l3.setFont(new Font("Airal", Font.BOLD, 15));
        l3.setForeground(Color.BLACK);
        l1.add(l3);

        btn1 = new JButton("Docter");
        btn1.setBounds(126, 100, 150, 40);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        l1.add(btn1);
        btn2 = new JButton("Patient");
        btn2.setBounds(300, 100, 150, 40);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        l1.add(btn2);
        btn3 = new JButton("Receptionist");
        btn3.setBounds(126, 200, 150, 40);
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
        l1.add(btn3);
        btn4 = new JButton("Admin");
        btn4.setBounds(300, 200, 150, 40);
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.WHITE);
        l1.add(btn4);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        f.setSize(800, 570);
        f.setLocation(300, 100);
        f.setVisible(true);
        f.setResizable(false);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn1) {
            f.setVisible(false);
            new LoginPage();
        }
        else if (ae.getSource() == btn2) {
            f.setVisible(false);
             new PatientLoginPage();
        }
        if (ae.getSource() == btn3) {
            f.setVisible(false);
            new LoginPage();
        }
        if (ae.getSource() == btn4) {
            f.setVisible(false);
            new LoginPage();
        }
    }

    public static void main(String[] args) {
        new Index();

    }
}
