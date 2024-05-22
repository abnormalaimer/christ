package CodeJavaVolume.FirstVolume.Part10.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class DrawTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new DrawFrame();
            frame.setTitle("DrawTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class DrawFrame extends JFrame{
    public DrawFrame(){
        add(new DrawComponent());
        pack();
    }
}
class DrawComponent extends JComponent{
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;

    public void paintComponent(Graphics g){
        Graphics2D g1 = (Graphics2D) g;
        double leftx=100;
        double topy=100;
        double width=200;
        double height=150;
        Rectangle2D rect = new Rectangle2D.Double(leftx, topy, width, height);
        g1.draw(rect);

        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rect);
        g1.draw(ellipse);

        g1.draw(new Line2D.Double(leftx,topy,leftx+width, topy+height));

        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();
        double radius = 150;

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY, centerX-radius, centerY-radius);
        g1.draw(circle);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
