import javax.swing.*;
import java.awt.event.*;

public class MatrixAdd {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JTextField a1 = new JTextField();
        JTextField a2 = new JTextField();
        JTextField b1 = new JTextField();
        JTextField b2 = new JTextField();
        JTextField r1 = new JTextField();
        JTextField r2 = new JTextField();

        JButton add = new JButton("Add");

        a1.setBounds(30,30,50,30);
        a2.setBounds(90,30,50,30);
        b1.setBounds(30,80,50,30);
        b2.setBounds(90,80,50,30);
        r1.setBounds(30,130,50,30);
        r2.setBounds(90,130,50,30);
        add.setBounds(30,180,100,30);

        f.add(a1);f.add(a2);f.add(b1);f.add(b2);
        f.add(r1);f.add(r2);f.add(add);

        add.addActionListener(e -> {
            r1.setText("" + (Integer.parseInt(a1.getText()) + Integer.parseInt(b1.getText())));
            r2.setText("" + (Integer.parseInt(a2.getText()) + Integer.parseInt(b2.getText())));
        });

        f.setSize(250,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}