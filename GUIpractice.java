import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FrameExample extends JFrame implements ActionListener {
    JTextField jt1, jt2, jt3, output;
    JButton b1, b2;

    public FrameExample() {
        setTitle("My Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500, 300);

        JPanel p = new JPanel();
        p.setLayout(null);
        add(p);

        JLabel l1 = new JLabel("num1 :");
        l1.setBounds(30, 30, 100, 20);
        JLabel l2 = new JLabel("num2 :");
        l2.setBounds(30, 60, 100, 20);
        JLabel l3 = new JLabel("num3 :");
        l3.setBounds(30, 90, 100, 20);
        p.add(l1);
        p.add(l2);
        p.add(l3);

        jt1 = new JTextField();
        jt2 = new JTextField();
        jt3 = new JTextField();
        jt1.setBounds(100, 30, 100, 20);
        jt2.setBounds(100, 60, 100, 20);
        jt3.setBounds(100, 90, 100, 20);
        p.add(jt1);
        p.add(jt2);
        p.add(jt3);

        b1 = new JButton("Calculate");
        b2 = new JButton("Reset");
        b1.setBounds(50, 140, 100, 30);
        b2.setBounds(160, 140, 80, 30);
        p.add(b1);
        p.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        output = new JTextField();
        output.setBounds(50, 200, 190, 25);
        output.setEditable(false);  // Prevent user typing into output
        p.add(output);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                int num1 = Integer.parseInt(jt1.getText());
                int num2 = Integer.parseInt(jt2.getText());
                int result = num1 + num2;
                output.setText("Sum: " + result);
            } catch (NumberFormatException e) {
                output.setText("Enter valid numbers");
            }
        } else if (ae.getSource() == b2) {
            jt1.setText("");
            jt2.setText("");
            jt3.setText("");
            output.setText("");
        }
    }
}

public class GUIpractice {
    public static void main(String[] args) {
        new FrameExample();
    }
}
