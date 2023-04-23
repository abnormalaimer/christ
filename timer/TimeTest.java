package timer;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
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
class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event){
        System.out.println("at the tone,the time is "+new Date());
        Toolkit.getDefaultToolkit().beep();
    
    }
}
