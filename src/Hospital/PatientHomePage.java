package Hospital;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PatientHomePage extends JFrame implements ActionListener {

    JPanel p1, p2, contentPanel;
    JFrame f;
    JButton btn1, btn2, btn3, btn4;

    // Panels to display information
    JPanel appointmentsPanel, profilePanel, medicalRecordsPanel;

    PatientHomePage() {
        f = new JFrame("Patient Home Page");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1500, 730);
        f.setLocation(0, 0);
        f.setVisible(true);
        f.setLayout(null);
        p2 = new JPanel();
        p2.setBackground(Color.GRAY);
        p2.setBounds(0, 0, 1500, 50);
        p1 = new JPanel();
        p1.setBackground(Color.GREEN);
        p1.setLayout(new GridLayout(3, 1)); // Use GridLayout to display buttons in three rows
        p1.setBounds(0, 50, 300, 730);
        f.add(p1);
        f.add(p2);

        // Create buttons in p1
        btn1 = new JButton("View Appointments");
        customizeButton(btn1);
        btn1.addActionListener(this);
        p1.add(btn1);

       btn2 = new JButton("View Medical Records");
        customizeButton(btn2);
        btn2.addActionListener(this);
         p1.add(btn2);

        btn3 = new JButton("Update Profile");
        customizeButton(btn3);
        btn3.addActionListener(this);
        p1.add(btn3);

        //Create labels and buttons in p2
        JLabel welcomeLabel = new JLabel("Welcome, Patient!");
        p2.add(welcomeLabel);

        btn4 = new JButton("Logout");
        btn4.addActionListener(this);
        p2.add(btn4);

        // Initialize panels for displaying information
        appointmentsPanel = createInformationPanel("Appointments Information");
        profilePanel = createInformationPanel("Profile Information");
        medicalRecordsPanel = createInformationPanel("Medical Records Information");

        // Create a content panel with CardLayout
        contentPanel = new JPanel(new CardLayout());
        contentPanel.setBounds(300, 50, 1200, 730);
        f.add(contentPanel);

        // Add information panels to the content panel with unique names
        contentPanel.add(appointmentsPanel, "Appointments");
        contentPanel.add(profilePanel, "Profile");
        contentPanel.add(medicalRecordsPanel, "Medical Records");
    }

    private JPanel createInformationPanel(String content) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel label = new JLabel(content);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);
        return panel;
    }

    private void customizeButton(JButton button) {
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        CardLayout cardLayout = (CardLayout) contentPanel.getLayout();

        if ("View Appointments".equals(command)) {
            cardLayout.show(contentPanel, "Appointments");
            System.out.println("View Appointments button clicked.");
        } else if ("Update Profile".equals(command)) {
            cardLayout.show(contentPanel, "Profile");
            System.out.println("Update Profile button clicked.");
        } else if ("View Medical Records".equals(command)) {
            cardLayout.show(contentPanel, "Medical Records");
            System.out.println("View Medical Records button clicked.");
        } else if ("Logout".equals(command)) {
            // Handle logout action
            System.out.println("Logout button clicked.");
        }
    }

    public static void main(String[] args) {
        new PatientHomePage();
    }
}
