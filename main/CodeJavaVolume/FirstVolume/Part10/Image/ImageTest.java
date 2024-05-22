package CodeJavaVolume.FirstVolume.Part10.Image;



import javax.swing.*;
import java.awt.*;

public class ImageTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame imageFrame = new ImageFrame();
            imageFrame.setTitle("ImageTest");
            imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            imageFrame.setVisible(true);
    });
}
}

class ImageFrame extends JFrame {
    public ImageFrame() {
        add(new ImageComponent());
        pack();
}

}

class ImageComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;

    private final Image image;

    public ImageComponent() {
        image = new ImageIcon("E:\\Download\\《光之梦想》.jpg").getImage();

    }

    @Override
    public void paintComponent(Graphics g) {
        if (image == null) return;
        int imageWidth=image.getWidth(this);
        int imageHeight=image.getHeight(this);

        g.drawImage(image,0, 0, null);

        for (int i = 0; i*imageWidth<=getWidth(); i++)
            for (int j = 0; j*imageHeight <=getHeight() ; j++)
                if(i+j>0)
                    g.copyArea(0,0,imageWidth,imageHeight,i*imageWidth,j*imageHeight);
    }
    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
