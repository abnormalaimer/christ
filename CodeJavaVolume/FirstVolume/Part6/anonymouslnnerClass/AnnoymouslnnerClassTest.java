package CodeJavaVolume.FirstVolume.Part6.anonymouslnnerClass;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class AnnoymouslnnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000,true);
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
class TalkingClock{
    public void start(int interval, boolean beep){
        ActionListener listener=new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.out.println("At the tone, the time is "+new Date());
                if(beep){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        };
        Timer timer = new Timer(interval, listener);
        timer.start();
    }
}
