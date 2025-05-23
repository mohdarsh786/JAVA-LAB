// write a java gui based program  in which each time the count button is clicked the counter value shall increase by one and show in textfield there will be only one label,one textfield and one button only.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUIcountbutton extends JFrame 
{
    private int count = 0;
    private JTextField countField;
    public GUIcountbutton() 
    {
        createView();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 120);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    private void createView() 
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3, 10, 10));
        getContentPane().add(panel);
        JLabel label = new JLabel("Count:");
        panel.add(label);
        countField = new JTextField("0");
        countField.setEditable(false);
        panel.add(countField);
        JButton countButton = new JButton("Count");
        panel.add(countButton);
        countButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                count++;
                countField.setText(String.valueOf(count));
            }
        });
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> {
            new GUIcountbutton().setVisible(true);
        });
    }
}