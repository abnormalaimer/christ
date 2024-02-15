package CodeJavaVolume.Part10.font;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class FontTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame fortFrame = new FortFrame();
            fortFrame.setTitle("FontTest");
            fortFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fortFrame.setVisible(true);
        });
    }
}

class FortFrame extends JFrame {
    public FortFrame() {
        add(new FontComponent());
        pack();
    }

}

class FontComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        String message = "hello,world";
        Font f = new Font("Serif", Font.BOLD, 48);
        g2.setFont(f);

        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = f.getStringBounds(message, context);

        double x = (getWidth() - bounds.getWidth()) / 2;
        double y = (getHeight() - bounds.getHeight()) / 2;

        double ascent = -bounds.getY();
        double baseY = y + ascent;

        g2.drawString(message, (int) x, (int) baseY);
        g2.setPaint(Color.LIGHT_GRAY);
        g2.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));
        Rectangle2D rect = new Rectangle2D.Double(x, y, bounds.getWidth(),bounds.getHeight());
        g2.draw(rect);


    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}