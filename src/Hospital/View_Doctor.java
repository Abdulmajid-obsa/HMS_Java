package Hospital;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class View_Doctor extends JFrame {
    // Constructor for the View_Doctor class
    public View_Doctor() {
        super("View Doctors");

        // Create a table to display doctor information
        JTable table = new JTable();

        // Create a scroll pane to display the table
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        // Set frame size and visibility
        setSize(800, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        // Fetch doctor data from the database and populate the table
        fetchDoctorData(table);
    }

    // Method to fetch doctor data from the database and populate the table
    private void fetchDoctorData(JTable table) {
        try {
            // Connect to the database and retrieve doctor data
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "username", "password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM doctors");

            // Create a TableModel to store the data
            DefaultTableModel model = new DefaultTableModel();

            // Add columns to the model
            model.addColumn("Doctor ID");
            model.addColumn("Doctor Name");
            model.addColumn("Specialization");
            model.addColumn("Phone Number");

            // Add rows to the model
            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getInt("doctor_id"),
                    rs.getString("doctor_name"),
                    rs.getString("specialization"),
                    rs.getString("phone_number")
                });
            }

            // Set the table model
            table.setModel(model);

            // Close the database connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new View_Doctor();
    }
}

