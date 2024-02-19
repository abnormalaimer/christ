package CodeJavaVolume.FirstVolume.Part11.button;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        JButton yellow = new JButton("Yellow");
        JButton blue = new JButton("blue");
        JButton red = new JButton("red");

        buttonPanel = new JPanel();

        buttonPanel.add(yellow);
        buttonPanel.add(blue);
        buttonPanel.add(red);

        add(buttonPanel);

        ColorAction yellowAction = new ColorAction(Color.yellow);
        ColorAction blueAction = new ColorAction(Color.blue);
        ColorAction redAction = new ColorAction(Color.red);

        yellow.addActionListener(yellowAction);
        blue.addActionListener(blueAction);
        red.addActionListener(redAction);
    }


    private class ColorAction implements ActionListener {

        private Color backgroundColor;

        public ColorAction(Color c) {
            backgroundColor = c;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(backgroundColor);


        }

    }
}