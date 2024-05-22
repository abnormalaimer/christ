package CodeJavaVolume.SecondVolume.Part11.tableModel;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

public class InvestmentTable {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            var frame=new InvestmentTableFrame();
            frame.setTitle("InvestmentTable");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
class InvestmentTableFrame extends JFrame{
    public InvestmentTableFrame(){
        var model=new InvestmentTableModel(30,5,10);
        var table=new JTable(model);
        add(new JScrollPane(table));
        pack();
    }


}

class InvestmentTableModel extends AbstractTableModel {
    private static final double INITIAL_BALANCE=100000.0;
    private final int years;
    private final int minRate;
    private final int maxRate;
    public InvestmentTableModel(int y,int r1,int r2){
        years=y;
        minRate=r1;
        maxRate=r2;
    }
    @Override
    public int getRowCount() {
        return years;
    }

    @Override
    public int getColumnCount() {
        return maxRate-minRate+1;
    }

    @Override
    public Object getValueAt(int r, int c) {
        double rate=(c+minRate)/100.0;
        int nperiods=r;
        double futureBalance = INITIAL_BALANCE * Math.pow(1 + rate, nperiods);
        return String.format("%.2f", futureBalance);
    }
    public String getColumnName(int c){
        return (c+minRate)+"%";
    }
}