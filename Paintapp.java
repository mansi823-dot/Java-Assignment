import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintApp extends JFrame {
    int x, y;

    public PaintApp() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                g.fillOval(e.getX(), e.getY(), 5, 5);
            }
        });

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintApp();
    }
}