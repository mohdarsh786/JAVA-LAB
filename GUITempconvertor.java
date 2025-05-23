import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class GUITempconvertor
{
    private JFrame frame;
    private JTextField celsiusField;
    private JTextField fahrenheitField;
    private JButton convertButton;
    private JButton resetButton;
    public GUITempconvertor()
    {
        createView();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }   
    private void createView()
    {
        frame = new JFrame("Temperature Converter");
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        panel.setLayout(new GridLayout(3, 2, 5, 5));
        JLabel celsiusLabel = new JLabel("Celsius:");
        panel.add(celsiusLabel);
        celsiusField = new JTextField();
        panel.add(celsiusField);
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        panel.add(fahrenheitLabel);
        fahrenheitField = new JTextField();
        panel.add(fahrenheitField);
        convertButton = new JButton("Convert");
        panel.add(convertButton);
        resetButton = new JButton("Reset");
        panel.add(resetButton);
        convertButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String celsiusText = celsiusField.getText();
                double celsius = Double.parseDouble(celsiusText);
                double fahrenheit = (celsius * 9/5) + 32;
                fahrenheitField.setText(String.valueOf(fahrenheit));
            }
        });
        
        resetButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                celsiusField.setText("");
                fahrenheitField.setText("");
            }
        });
    }
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new GUITempconvertor();
            }
        });
    }
    private double convertToFahrenheit(double celsius) 
    {
        return (celsius * 9/5) + 32;
    }   
    private double convertToCelsius(double fahrenheit) 
    {
        return (fahrenheit - 32) * 5/9;
    }
}