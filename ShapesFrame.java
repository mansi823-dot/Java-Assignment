import javax.swing.*;
import java.awt.*;

public class ShapesFrame extends JFrame {

    String shape = "";

    public ShapesFrame() {
        JButton b1 = new JButton("Circle");
        JButton b2 = new JButton("Rectangle");

        b1.setBounds(50,50,100,30);
        b2.setBounds(50,100,100,30);

        add(b1); add(b2);

        b1.addActionListener(e -> { shape="circle"; repaint(); });
        b2.addActionListener(e -> { shape="rect"; repaint(); });

        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        if(shape.equals("circle")) g.drawOval(150,150,100,100);
        if(shape.equals("rect")) g.drawRect(150,150,100,100);
    }

    public static void main(String[] args) {
        new ShapesFrame();
    }
}