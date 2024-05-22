package CodeJavaVolume.FirstVolume.Part6.inner;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Date;

//timer的内部类来实现
public class innerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(100, true);
        clock.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TalkingClock {
    private final int interval;
    private final boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        ActionListener listener = event -> {
            System.out.println("At the tone, the time is " + new Date());
          if(beep) Toolkit.getDefaultToolkit().beep();
        };
        Timer t = new Timer(interval, listener);
        t.start();
    }

   /* public class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone, the time is " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();

        }
    }*/


}