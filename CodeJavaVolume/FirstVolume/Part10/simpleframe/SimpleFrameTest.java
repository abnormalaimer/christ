package CodeJavaVolume.FirstVolume.Part10.simpleframe;



import javax.swing.*;
import java.awt.*;

public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            SimpleFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);            // 设置窗口可见
        });
    }
}
class SimpleFrame extends JFrame{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    public SimpleFrame(){

        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);


}}
