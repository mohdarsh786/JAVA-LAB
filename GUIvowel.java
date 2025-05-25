import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIvowel extends JFrame
{
    private JTextField inputField;
    private JTextField outputField;
    private JButton countButton;
    private JButton resetButton;
    private JButton exitButton;

    public GUIvowel()
    { 
        createView();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,150);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView()
    {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new GridLayout(3, 2, 5, 5));

        JLabel inputLabel = new JLabel("Enter a string:");
        panel.add(inputLabel);

        inputField = new JTextField();
        panel.add(inputField);

        JLabel outputLabel = new JLabel("Number of vowels:");
        panel.add(outputLabel);

        outputField = new JTextField();
        outputField.setEditable(false);
        panel.add(outputField);

        countButton = new JButton("Count");
        panel.add(countButton);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        resetButton = new JButton("Reset");
        exitButton = new JButton("Exit");
        buttonPanel.add(resetButton);
        buttonPanel.add(exitButton);
        panel.add(buttonPanel);

        countButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String text = inputField.getText();
                int count = countVowels(text);
                outputField.setText(String.valueOf(count));
            }
        });


        resetButton.addActionListener(new ActionListener()         
        {
            public void actionPerformed(ActionEvent e)
            
            {
                inputField.setText("");
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

    private int countVowels(String text) 
    {
        int count = 0;
        for (char c : text.toLowerCase().toCharArray()) 
        {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> {
            new GUIvowel().setVisible(true);
        });
    }
}