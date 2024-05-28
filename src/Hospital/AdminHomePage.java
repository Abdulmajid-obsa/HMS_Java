package Hospital;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class AdminHomePage extends JFrame implements ActionListener
{   
    JLabel l1;
    Font f,f1,f2;
  // JTable doctorTable;
   
    AdminHomePage(String adminname)
    {
    super("Admin Home Page");
    setLocation(0,0);
    setSize(1500,730);
     ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Hospital/Icons/10.jpg"));
        Image img = ic.getImage().getScaledInstance(1500, 730, Image.SCALE_SMOOTH);
        ImageIcon icl = new ImageIcon(img);
        l1= new JLabel(icl);
        f = new Font("Lucida Fax",Font.BOLD,20);
        f2 = new Font("Gadugi",Font.BOLD,35);
        f1 = new Font("MS UI Gothic",Font.BOLD,18);
        JMenuBar menubar = new JMenuBar();
        JMenu menu1 = new JMenu("Doctor");
        JMenuItem menuit1 = new JMenuItem("Add Doctor");
        JMenuItem menuit2 = new JMenuItem("View Doctot");
        
        JMenu menu2 = new JMenu("Patient");
        JMenuItem menuit3 = new JMenuItem("Add Patient");
        JMenuItem menuit4 = new JMenuItem("View Patient");
        
        JMenu menu3 = new JMenu("Receptionist");
        JMenuItem menuit5 = new JMenuItem("Add Receptionist");
        JMenuItem menuit6 = new JMenuItem("View Receptionist");
        
        JMenu menu4 = new JMenu("Appointment");
        JMenuItem menuit7 = new JMenuItem("Add Appointment");
        JMenuItem menuit8 = new JMenuItem("View Appointment");
        
        JMenu menu5 = new JMenu("welcome,Admin("+adminname+")");
        JMenuItem menuit9 = new JMenuItem("My Profile");
        JMenuItem menuit10 = new JMenuItem("Change password");
        JMenu menu6 = new JMenu("Exit");
        JMenuItem menuit11 = new JMenuItem("Exit");
        
        menu1.add(menuit1 );
        menu1.add(menuit2 );
        menu2.add(menuit3 );
        menu2.add(menuit4 );
        menu3.add(menuit5 );
        menu3.add(menuit6 );
        menu4.add(menuit7 );
        menu4.add(menuit8 );
        menu5.add(menuit9);
        menu5.add(menuit10);
        menu6.add(menuit11 );
        
        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu3);
        menubar.add(menu4);
        menubar.add(menu5);
        menubar.add(menu6);
        
        menu1.setFont(f);
        menu2.setFont(f);
        menu3.setFont(f);
        menu4.setFont(f);
        menu5.setFont(f);
        menu6.setFont(f);
        
        menuit1.setFont(f1);
        menuit2.setFont(f1);
        menuit3.setFont(f1);
        menuit4.setFont(f1);
        menuit5.setFont(f1);
        menuit6.setFont(f1);
        menuit7.setFont(f1);
        menuit8.setFont(f1);
        menuit9.setFont(f1);
        menuit10.setFont(f1);
        menuit11.setFont(f1);
        
        menubar.setBackground(Color.BLACK);
          menu1.setForeground(Color.GRAY);
          menu2.setForeground(Color.GRAY);
          menu3.setForeground(Color.GRAY);
          menu4.setForeground(Color.GRAY);
          menu5.setForeground(Color.GRAY);
          menu6.setForeground(Color.RED);
          
          menuit1.setForeground(Color.YELLOW);
          menuit3.setForeground(Color.YELLOW);
          menuit5.setForeground(Color.YELLOW);
          menuit7.setForeground(Color.YELLOW);
          menuit9.setForeground(Color.YELLOW);
          menuit11.setForeground(Color.RED);
          
          menuit1.setBackground(Color.BLACK);
          menuit3.setBackground(Color.BLACK);
          menuit5.setBackground(Color.BLACK);
          menuit7.setBackground(Color.BLACK);
          menuit9.setBackground(Color.BLACK);
          menuit11.setBackground(Color.BLACK);
          
          menuit1.addActionListener(this);
          menuit2.addActionListener(this);
          menuit3.addActionListener(this);
          menuit4.addActionListener(this);
          menuit5.addActionListener(this);
          menuit6.addActionListener(this);
          menuit7.addActionListener(this);
          menuit8.addActionListener(this);
          menuit9.addActionListener(this);
          menuit10.addActionListener(this);
          menuit11.addActionListener(this);
          
          setJMenuBar(menubar);
          add(l1);
          
          
          
          
        /* doctorTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(doctorTable);
        add(scrollPane);
          //this.add()*/
         }
    public void actionPerformed(ActionEvent ae)
    {
    String comnd = ae.getActionCommand();
    if(comnd.equals("Add Doctor"))
    {
        new Add_Doctor();
        }
         else if (comnd.equals("View Doctor"))
        {
           // new View_Doctor();
               new View_Doctor();
            JOptionPane.showMessageDialog(this, "Implement the code to view doctors here.");
             }
            else if (comnd.equals("Add Patient"))
    {
         new Add_Patient();
        }
     else if(comnd.equals("Exit"))
    {
            this.setVisible(false);
             new Index();
           }
        }

   
  }

