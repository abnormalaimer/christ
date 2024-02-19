package CodeJavaVolume.FirstVolume.Part6.timer;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimeTest {
    public static void main(String[] args) {
        ActionListener listener=new TimePrinter();
        Timer t=new Timer(10000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"quit program?");
        System.exit(0);
    }
}
