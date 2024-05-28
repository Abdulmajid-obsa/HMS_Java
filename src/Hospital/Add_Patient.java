package Hospital;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;
public class Add_Patient implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JTextField tf1,tf2,tf3,tf4,tf5,tf7,tf11,tf12,tf13,tf14;
    JPasswordField tf10;
    JRadioButton Male,Female;
    JComboBox State,city,MS;
    JButton btn1,btn2;
    Add_Patient(){
         f = new JFrame("Add Patient");
         f.setBackground(Color.WHITE);
         f.setLayout(null);
         
         ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Hospital/Icons/pati2.jpeg"));
         Image il = img.getImage().getScaledInstance(900, 700, Image.SCALE_SMOOTH);
         ImageIcon img1 = new ImageIcon(il);
         l1 = new JLabel(img1);
         l1.setBounds(0,0,900,700);
         l1.setLayout(null);
         f.add(l1);
         
         l2 = new JLabel("Add Patient Details");
         l2.setBounds(280,30,500,50);
         l2.setFont(new Font("Arial",Font.BOLD,30));
         l2.setForeground(Color.BLACK);
         l1.add(l2);
         
         l3 = new JLabel("First name");
         l3.setBounds(50,150,150,30);
         l3.setFont(new Font("Arial",Font.BOLD,20));
         l3.setForeground(Color.BLACK);
         l1.add(l3);
         
        tf1 = new JTextField();
        tf1.setBounds(170,150,150,30);
        l1.add(tf1);
        
         l4 =new JLabel("Lastname");
         l4.setBounds(450,150,200,30);
         l4.setFont(new Font("Arial",Font.BOLD,20));
         l4.setForeground(Color.BLACK);
         l1.add(l4);
         
        tf2 = new JTextField();
        tf2.setBounds(560,150,150,30);
        l1.add(tf2);
         
         l5 =new JLabel("Username");
         l5.setBounds(50,200,100,30);
         l5.setFont(new Font("Arial",Font.BOLD,20));
         l5.setForeground(Color.BLACK);
         l1.add(l5);
         
        tf3 = new JTextField();
        tf3.setBounds(170,200,150,30);
        l1.add(tf3);
         
         l6 =new JLabel("Email");
         l6.setBounds(450,200,200,30);
         l6.setFont(new Font("Arial",Font.BOLD,20));
         l6.setForeground(Color.BLACK);
         l1.add(l6);
         
        tf4 = new JTextField();
        tf4.setBounds(560,200,150,30);
        l1.add(tf4);
         
         l7 =new JLabel("Phone");
         l7.setBounds(50,250,100,30);
         l7.setFont(new Font("Arial",Font.BOLD,20));
         l7.setForeground(Color.BLACK);
         l1.add(l7);
         
        tf5 = new JTextField();
        tf5.setBounds(170,250,150,30);
        l1.add(tf5);
         
         l8 =new JLabel("Gender");
         l8.setBounds(450,250,100,30);
         l8.setFont(new Font("Arial",Font.BOLD,20));
         l8.setForeground(Color.BLACK);
         l1.add(l8);
         
         Male =new JRadioButton("Male");
         Male.setBounds(560,250,100,30);
         Male.setFont(new Font("Arial",Font.BOLD,20));
         Male.setForeground(Color.BLACK);
         l1.add(Male);
         Female =new JRadioButton("Famale");
         Female.setBounds(660,250,150,30);
         Female.setFont(new Font("Arial",Font.BOLD,20));
         Female.setForeground(Color.BLACK);
         l1.add(Female);
         ButtonGroup bg = new ButtonGroup();
         bg.add(Male);
         bg.add(Female);
         l9 =new JLabel("Age");
         l9.setBounds(50,300,100,30);
         l9.setFont(new Font("Arial",Font.BOLD,20));
         l9.setForeground(Color.BLACK);
         l1.add(l9);
         
        tf7 = new JTextField();
        tf7.setBounds(170,300,150,30);
        l1.add(tf7);
           
         l10 =new JLabel("State");
         l10.setBounds(450,300,100,30);
         String List[] = {"Oromia","Afar", "Benishangul-Gumuz","Central Ethiopia State","Gambela", "Harari", "Amhara", "Sidama", "Somali", "South Ethiopia", "South West Ethiopia","Tigray","Addis Ababa","Dire Dawa"};
         State = new JComboBox(List);
         State.setBounds(560,300,150,30);

         l1.add(State);
         l10.setFont(new Font("Arial",Font.BOLD,20));
         l10.setForeground(Color.BLACK);
         l1.add(l10);
         
         l11 =new JLabel("City");
         l11.setBounds(50,350,100,30);
         l11.setFont(new Font("Arial",Font.BOLD,20));
         l11.setForeground(Color.BLACK);
         l1.add(l11);
         String CityList[] = {"Dodola","Hosana", "Asosaa","Adama","Maqale", "Harari", "Baha dare", "Hawasa", "Jijiga", "Walkite", "Arba Miche","Aksum","Addis Ababa","Dire Dawa","Shashamane","Bishoftu","Robe","Gonder","Lalibal"};
         city = new JComboBox(CityList);
         city.setBounds(170,350,150,30);
         l1.add(city);
         
        l12 =new JLabel("Password");
        l12.setBounds(450,350,140,30);
        l12.setFont(new Font("Arial",Font.BOLD,20));
        l12.setForeground(Color.BLACK);
        l1.add(l12);
        
        tf10 = new JPasswordField();
        tf10.setBounds(560,350,150,30);
        l1.add(tf10);
        
        l13 =new JLabel("Register Date");
        l13.setBounds(50,400,125,30);
        l13.setFont(new Font("Arial",Font.BOLD,20));
        l13.setForeground(Color.BLACK);
        l1.add(l13);
        
        tf13 = new JTextField();
        tf13.setBounds(170,400,150,30);
        l1.add(tf13);
        
        l14 =new JLabel("Marital Status");
        l14.setBounds(450,400,150,30);
        l14.setFont(new Font("Arial",Font.BOLD,20));
        l14.setForeground(Color.BLACK);
        l1.add(l14);
        
        String msList[] = {"Single","Married", "Divorced","Widowed","Separated", "Domestic Partnership", "Civil Union",};
        MS = new JComboBox(msList);
        MS.setBounds(600,400,150,30);
        l1.add(MS);
                
        btn1 = new JButton("Submit");
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.setBounds(250,500,150,40);
        l1.add(btn1);
        
        btn2 = new JButton("Cancel");
        btn2.setBackground(Color.RED);
        btn2.setForeground(Color.WHITE);
        btn2.setBounds(450,500,150,40);
        l1.add(btn2);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
         
         
         f.setVisible(true);
         f.setSize(900,700);
         f.setLocation(300, 100);
         f.setResizable(false);
    // public void actionPerformed(ActionEvent e)
    }
   public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btn1) {
        String firstName = tf1.getText();
        String lastName = tf2.getText();
        String username = tf3.getText();
        String email = tf4.getText();
        String phone = tf5.getText();
        String age = tf7.getText();
        String password = new String(tf10.getPassword());
        String registrationDate = tf13.getText();

        StringBuilder errorMessage = new StringBuilder("Please fill in the following fields:\n");

        if (firstName.isEmpty()) {
            errorMessage.append("- First Name\n");
        }
        if (lastName.isEmpty()) {
            errorMessage.append("- Last Name\n");
        }
        if (username.isEmpty()) {
            errorMessage.append("- Username\n");
        }
        if (email.isEmpty()) {
            errorMessage.append("- Email\n");
        }
        if (phone.isEmpty()) {
            errorMessage.append("- Phone\n");
        }
        if (age.isEmpty()) {
            errorMessage.append("- Age\n");
        }
        if (password.isEmpty()) {
            errorMessage.append("- Password\n");
        }
        if (registrationDate.isEmpty()) {
            errorMessage.append("- Registration Date\n");
        }

        if (errorMessage.toString().equals("Please fill in the following fields:\n")) {
            try {
                ConnectionClass obj = new ConnectionClass();
                String q = "INSERT INTO patient (firstname,lastname,username,email,phone,gender,age,state,city,password,date_register,marital_status) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pstmt = obj.con.prepareStatement(q);

                pstmt.setString(1, firstName);
                pstmt.setString(2, lastName);
                pstmt.setString(3, username);
                pstmt.setString(4, email);
                pstmt.setString(5, phone);
                pstmt.setString(6, ""); // Gender (leave empty)
                pstmt.setString(7, age);
                pstmt.setString(8, ""); // State (leave empty)
                pstmt.setString(9, ""); // City (leave empty)
                pstmt.setString(10, password);
                pstmt.setString(11, registrationDate);
                pstmt.setString(12, ""); // Marital Status (leave empty)

                pstmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Details Successfully Inserted");
                f.setVisible(false);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, errorMessage.toString());
        }
    }

    if (e.getSource() == btn2) {
        f.setVisible(false);
    }
}

     public static void main(String[] args)
    {
     new Add_Patient();
   
    
    }
}
