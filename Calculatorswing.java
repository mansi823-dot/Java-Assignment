import javax.swing.*;
import java.awt.event.*;

public class Calculatorswing {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField result = new JTextField();

        JButton add = new JButton("+");

        t1.setBounds(50,50,100,30);
        t2.setBounds(50,100,100,30);
        result.setBounds(50,150,100,30);
        add.setBounds(50,200,100,30);

        f.add(t1); f.add(t2); f.add(result); f.add(add);

        add.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText("" + (a + b));
        });

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}