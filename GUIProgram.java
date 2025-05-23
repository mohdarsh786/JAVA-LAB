import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyWindow extends JFrame implements ActionListener, MouseListener 
{
    JButton b1, b2, b3, b4;
    JPanel p;

    MyWindow() {
        p = new JPanel(new FlowLayout());

        b1 = new JButton("Red");
        b2 = new JButton("Green");
        b3 = new JButton("Blue");
        b4 = new JButton("White");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        b1.addMouseListener(this);
        b2.addMouseListener(this);
        b3.addMouseListener(this);
        b4.addMouseListener(this);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);

        add(p);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == b1) 
        {
            p.setBackground(Color.RED);
        } else if (ae.getSource() == b2) 
        {
            p.setBackground(Color.GREEN);
        } else if (ae.getSource() == b3) 
        {
            p.setBackground(Color.BLUE);
        } else if (ae.getSource() == b4) 
        {
            p.setBackground(Color.WHITE);
        }
    }
    public void mouseEntered(MouseEvent me) 
    {
        if (me.getSource() == b1) 
        {
            b1.setBackground(Color.RED);
        } 
        else if (me.getSource() == b2) 
        {
            b2.setBackground(Color.GREEN);
        } 
        else if (me.getSource() == b3) {
            b3.setBackground(Color.BLUE);
        } 
        else if (me.getSource() == b4) 
        {
            b4.setBackground(Color.WHITE);
        }
    }

    public void mouseExited(MouseEvent me) 
    {
        if (me.getSource() == b1) {
            b1.setBackground(null);
        } else if (me.getSource() == b2) 
        {
            b2.setBackground(null);
        } else if (me.getSource() == b3) 
        {
            b3.setBackground(null);
        } else if (me.getSource() == b4) 
        {
            b4.setBackground(null);
        }
    }
    public void mouseClicked(MouseEvent me) 
    {}
    public void mousePressed(MouseEvent me) 
    {}
    public void mouseReleased(MouseEvent me) 
    {}
}

public class GUIProgram 
{
    public static void main(String[] st) 
    {
        SwingUtilities.invokeLater(MyWindow::new);
    }
}