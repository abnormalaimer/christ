package CodeJavaVolume.Part10.sizeFrame;


import javax.swing.*;
import java.awt.*;

public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            JFrame frame = new SizedFrame();
            frame.setTitle("SizedFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);            // 设置窗口可见
        });
    }
}
class SizedFrame extends JFrame{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    public SizedFrame(){

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;

        setSize(height/2,width/2);
        setLocationByPlatform(true);

        Image image = new ImageIcon("C:\\Users\\25149\\OneDrive\\图片\\ACG\\87880674_p0.jpg").getImage();
        setIconImage(image);


    }}
