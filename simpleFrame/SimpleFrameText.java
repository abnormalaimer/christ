package simpleFrame;
import java.awt.*;
import javax.swing.*;

class SimpleFrame extends JFrame{
    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=200;

    public SimpleFrame(){
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}

public class SimpleFrameText {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            SimpleFrame frame=new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        });
    }
    
}
