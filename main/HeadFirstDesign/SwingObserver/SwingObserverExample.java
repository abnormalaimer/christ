package HeadFirstDesign.SwingObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SwingObserverExample {
    JFrame frame;
    boolean isClicked=false;
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("should i do it");

        button.addActionListener(e -> {
            isClicked = true;
            System.out.println("123");
            Random random = new Random();
            if (random.nextInt(2) == 1) {
                if (!isClicked){
                    button.addActionListener(new AngelListener());
                }else {
                    button.addActionListener(new DevilListener());
                }



            }});
        frame.getContentPane().add(BorderLayout.CENTER, button);
    }

    private class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("angel");
        }
    }

    private class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("devil");
        }
    }
}








