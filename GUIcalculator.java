import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIcalculator extends JFrame
{
    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField outputField;
    private JButton addButton;
    private JButton subButton;
    private JButton mulButton;
    private JButton divButton;
    private JButton exitButton;
    private JButton resetButton;


    public GUIcalculator()
    {
        createView();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);
        setResizable(true);
    }

    private void createView()
    {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new GridLayout(4, 2, 5, 5));

        JLabel num1Label = new JLabel("Number 1:");
        panel.add(num1Label);

        num1Field = new JTextField();
        panel.add(num1Field);

        JLabel num2Label = new JLabel("Number 2:");
        panel.add(num2Label);

        num2Field = new JTextField();
        panel.add(num2Field);

        JLabel outputLabel = new JLabel("Result:");
        panel.add(outputLabel);

        outputField = new JTextField();
        panel.add(outputField);

        addButton = new JButton("Add");
        subButton = new JButton("Subtract");
        mulButton = new JButton("Multiply");
        divButton = new JButton("Divide");
        exitButton = new JButton("Exit");
        resetButton = new JButton("Reset");
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(mulButton);
        buttonPanel.add(divButton);
        buttonPanel.add(exitButton);
        buttonPanel.add(resetButton);

        panel.add(new JLabel());
        panel.add(buttonPanel);

        addButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                calculate('+');
            }
        });

        subButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                calculate('-');
            }
        });

        mulButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                calculate('*');
            }
        });

        divButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                calculate('/');
            }
        });

        resetButton.addActionListener(new ActionListener()         
        {
            public void actionPerformed(ActionEvent e)
            
            {
                num1Field.setText("");
                num2Field.setText("");
                outputField.setText("");
            }
        });

        exitButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
    }

    private void calculate(char op) 
    {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;
            switch (op) 
            {
                case '+': 
                    result = num1 + num2; 
                    break;

                case '-': 
                    result = num1 - num2; 
                    break;

                case '*': 
                    result = num1 * num2; 
                    break;

                case '/':
                    if (num2 == 0) 
                    {
                        outputField.setText("Invalid operation : Division by zero");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }
            outputField.setText(String.valueOf(result));
        } 
        catch (NumberFormatException ex) 
        {
            outputField.setText("Invalid input");
        }
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            new GUIcalculator().setVisible(true);
        });
    }
}