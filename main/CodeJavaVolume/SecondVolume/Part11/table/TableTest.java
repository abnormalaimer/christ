package CodeJavaVolume.SecondVolume.Part11.table;

import javax.swing.*;
import java.awt.*;
import java.awt.print.*;

public class TableTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            var frame=new PlanetTableFrame();
            frame.setTitle("TableTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
class PlanetTableFrame extends JFrame{
    private final String[] columnNames = {"Planet","Radius","Moons","Gaseous","Color"};
    private final Object[][] cells={
            {"Mercury",2440.0,0,false, Color.yellow},
            {"Venus",6052.0,0,false, Color.yellow},
            {"Earth",6378.0,1,false, Color.blue},
            {"Mars",3397.0,2,false, Color.red},
            {"Jupiter",71492.0,16,true, Color.orange},
            {"Saturn",60268.0,18,true, Color.orange},
            {"Uranus",25559.0,17,true, Color.blue},
            {"Neptune",24766.0,8,true, Color.blue},
            {"Pluto",1137.0,1,false, Color.black}
    };
    public PlanetTableFrame(){
        var table=new JTable(cells,columnNames);
        table.setAutoCreateRowSorter(true);
        add(new JScrollPane(table), BorderLayout.CENTER);
        var printbutton = new JButton("Print");
        printbutton.addActionListener(event->{
            try {table.print();}
            catch (SecurityException | PrinterException ex){ex.printStackTrace();}});
        var buttonPanel = new JPanel();
        buttonPanel.add(printbutton);
        add(buttonPanel,BorderLayout.SOUTH);
        pack();
    }

}
