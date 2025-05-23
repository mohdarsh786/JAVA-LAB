import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class GUISQL extends JFrame implements ActionListener 
{
    private JTextField Name, Code, Salary, Designation;
    private JButton submit, reset, exit;
    private JTextArea output;
    private JPanel p;

    String DB_URL = "jdbc:mysql://localhost:3306/AI";
    String DB_USER = "root";
    String DB_PASS = "123qwe@@";

    public GUISQL() 
    {
        setTitle("Employee Management System");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p = new JPanel();
        p.setLayout(new GridLayout(6, 2));

        p.add(new JLabel("Name:"));
        Name = new JTextField();
        p.add(Name);

        p.add(new JLabel("Code:"));
        Code = new JTextField();
        p.add(Code);

        p.add(new JLabel("Salary:"));
        Salary = new JTextField();
        p.add(Salary);

        p.add(new JLabel("Designation:"));
        Designation = new JTextField();
        p.add(Designation);

        submit = new JButton("Submit");
        submit.addActionListener(this);
        p.add(submit);

        reset = new JButton("Reset");
        reset.addActionListener(this);
        p.add(reset);

        exit = new JButton("Exit");
        exit.addActionListener(this);
        p.add(exit);

        output = new JTextArea(10, 30);
        output.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(output);
        p.add(scrollPane);

        getContentPane().add(p);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == submit) 
        {
            String name = Name.getText();
            String code = Code.getText();
            String salary = Salary.getText();
            String designation = Designation.getText();

            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) 
            {
                String sql = "INSERT INTO employee (name, code, salary, designation) VALUES (?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, name);
                stmt.setString(2, code);
                stmt.setString(3, salary);
                stmt.setString(4, designation);
                int rows = stmt.executeUpdate();
                if (rows > 0) 
                {
                    output.append("Submitted: " + name + ", " + code + ", " + salary + ", " + designation + "\n");
                } 
                else 
                {
                    output.append("Failed to submit data.\n");
                }
            } 
            catch (SQLException ex) 
            {
                output.append("Database error: " + ex.getMessage() + "\n");
            }
        } 
        else if (e.getSource() == reset) 
        {
            Name.setText("");
            Code.setText("");
            Salary.setText("");
            Designation.setText("");
        } 
        else if (e.getSource() == exit) 
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            SwingUtilities.invokeLater(() -> new GUISQL().setVisible(true));
        } 
        catch (ClassNotFoundException ex) 
        {
            JOptionPane.showMessageDialog(null, "MySQL JDBC Driver not found.");
        }
    }
}