package CodeJavaVolume.SecondVolume.Part7.retire;


import CodeJavaVolume.FirstVolume.Part11.girdbag.GBC;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Retire {
    public static void main(String[] args) {
        try {
            EventQueue.invokeLater(()->{
                var frame=new RetireFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            });
        }catch (MissingResourceException e){
            System.out.println("未找到");
        }
    }}

class RetireFrame extends JFrame{

    private final JTextField savingField=new JTextField(10);
    private final JTextField contribField=new JTextField(10);
    private final JTextField incomeField=new JTextField(10);
    private final JTextField currentAgeField=new JTextField(4);
    private final JTextField retireAgeField=new JTextField(4);
    private final JTextField deathAgeField=new JTextField(4);
    private final JTextField inflationPercentField=new JTextField(6);
    private final JTextField investPercentField=new JTextField(6);
    private final JTextArea retireText=new JTextArea(10,25);
    private final RetireComponent retireCanvas=new RetireComponent();
    private final JButton computeButton=new JButton();
    private final JLabel languageLabel=new JLabel();
    private final JLabel savingLabel=new JLabel();
    private final JLabel contribLabel=new JLabel();
    private final JLabel incomeLabel=new JLabel();
    private final JLabel currentAgeLabel=new JLabel();
    private final JLabel retireAgeLabel=new JLabel();
    private final JLabel deathAgeLabel=new JLabel();
    private final JLabel inflationPercentLabel=new JLabel();
    private final JLabel investPercentLabel=new JLabel();
    private final RetireInfo info=new RetireInfo();
    private final Locale[] locales={Locale.US,Locale.CHINA,Locale.GERMANY};
    private Locale currentLocale;
    private final JComboBox<Locale> localeCombo=new LocaleCombo(locales);
    private ResourceBundle res;
    private ResourceBundle resStrings;
    private NumberFormat currencyFmt;
    private NumberFormat numberFmt;
    private NumberFormat percentFmt;
    public RetireFrame(){
        setLayout(new GridBagLayout());
        add(languageLabel,new GBC(0,0).setAnchor(GBC.EAST));
        add(savingLabel,new GBC(0,1).setAnchor(GBC.EAST));
        add(contribLabel,new GBC(2,1).setAnchor(GBC.EAST));
        add(incomeLabel,new GBC(4,0).setAnchor(GBC.EAST));
        add(currentAgeLabel,new GBC(0,2).setAnchor(GBC.EAST));
        add(retireAgeLabel,new GBC(2,2).setAnchor(GBC.EAST));
        add(deathAgeLabel,new GBC(4,2).setAnchor(GBC.EAST));
        add(inflationPercentLabel,new GBC(0,3).setAnchor(GBC.EAST));
        add(investPercentLabel,new GBC(2,3).setAnchor(GBC.EAST));
        add(localeCombo,new GBC(1,0,3,1));
        add(savingField,new GBC(1,1).setWeight(100,0).setFill(GBC.HORIZONTAL));
        add(contribField,new GBC(3,1).setWeight(100,0).setFill(GBC.HORIZONTAL));
        add(incomeField,new GBC(5,1).setWeight(100,0).setFill(GBC.HORIZONTAL));
        add(currentAgeField,new GBC(1,2).setWeight(100,0).setFill(GBC.HORIZONTAL));
        add(retireAgeField,new GBC(3,2).setWeight(100,0).setFill(GBC.HORIZONTAL));
        add(deathAgeField,new GBC(5,2).setWeight(100,0).setFill(GBC.HORIZONTAL));
        add(inflationPercentField,new GBC(1,3).setWeight(100,0).setFill(GBC.HORIZONTAL));
        add(investPercentField,new GBC(3,3).setWeight(100,0).setFill(GBC.HORIZONTAL));
        add(retireCanvas,new GBC(0,4,4,1).setWeight(100,0).setFill(GBC.BOTH));
        add(new JScrollPane(retireText),new GBC(4,4,2,1).setWeight(0,100).setFill(GBC.BOTH));
        computeButton.setName("computeButton");
        computeButton.addActionListener(event->{
            getInfo();
            updateData();
            updateGraph();
        });
        add(computeButton,new GBC(5,3));
        retireText.setEditable(false);
        retireText.setFont(new Font("JetBrains Mono", Font.PLAIN, 10));
        info.setSaving(0);
        info.setContrib(9000);
        info.setIncome(60000);
        info.setCurrentAge(35);
        info.setRetireAge(65);
        info.setDeathAge(85);
        info.setInvestPercent(0.1);
        info.setInflationPercent(0.05);
        int localeIndex=0;
        for (int i = 0; i < locales.length; i++) {
            if (getLocale().equals(locales[i])) localeIndex=i;
            setCurrentLocale(locales[localeIndex]);

            localeCombo.addActionListener(event->{
                setCurrentLocale((Locale) localeCombo.getSelectedItem());
                validate();
            });
            pack();

        }

    }

    private void setCurrentLocale(Locale locale) {
        currentLocale=locale;
        localeCombo.setLocale(currentLocale);
        localeCombo.setSelectedItem(currentLocale);

        res=ResourceBundle.getBundle("CodeJavaVolume.SecondVolume.Part7.retire.RetireResources",currentLocale);
        resStrings=ResourceBundle.getBundle("CodeJavaVolume.SecondVolume.Part7.retire.RetireStrings",currentLocale);
        currencyFmt=NumberFormat.getCurrencyInstance(currentLocale);
        numberFmt=NumberFormat.getNumberInstance(currentLocale);
        percentFmt=NumberFormat.getPercentInstance(currentLocale);
        updateDisplay();
        updateInfo();
        updateData();
        updateGraph();
    }

    private void updateInfo() {
        savingField.setText(currencyFmt.format(info.getSaving()));
        contribField.setText(currencyFmt.format(info.getContrib()));
        incomeField.setText(currencyFmt.format(info.getIncome()));
        currentAgeField.setText(numberFmt.format(info.getCurrentAge()));
        retireAgeField.setText(numberFmt.format(info.getRetireAge()));
        deathAgeField.setText(numberFmt.format(info.getDeathAge()));
        investPercentField.setText(percentFmt.format(info.getInvestPercent()));
        inflationPercentField.setText(percentFmt.format(info.getInflationPercent()));
    }

    private void updateDisplay() {
        languageLabel.setText(resStrings.getString("language"));
        savingLabel.setText(resStrings.getString("saving"));
        contribLabel.setText(resStrings.getString("contrib"));
        incomeLabel.setText(resStrings.getString("income"));
        currentAgeLabel.setText(resStrings.getString("currentAge"));
        retireAgeLabel.setText(resStrings.getString("retireAge"));
        deathAgeLabel.setText(resStrings.getString("deathAge"));
        inflationPercentLabel.setText(resStrings.getString("inflationPercent"));
       investPercentLabel.setText(resStrings.getString("investPercent"));
        computeButton.setText(resStrings.getString("computeButton"));
    }

    private void updateData() {
        retireText.setText("");
        var retireMsg=new MessageFormat("");
        retireMsg.setLocale(currentLocale);
        retireMsg.applyPattern(resStrings.getString("CodeJavaVolume/SecondVolume/Part10/classLoader/retire"));
        for (int i = info.getCurrentAge(); i <=info.getDeathAge() ; i++) {
            Object[] args={i,info.getBalance(i)};
            retireText.append(retireMsg.format(args)+"\n");

        }
    }

    private void updateGraph() {
        retireCanvas.setColorPre((Color) res.getObject("colorPre"));
        retireCanvas.setColorGain((Color) res.getObject("colorGain"));
        retireCanvas.setColorLoss((Color) res.getObject("colorLoss"));
        retireCanvas.setInfo(info);
        repaint();

    }

    private void getInfo() {
        try {
            info.setSaving(currencyFmt.parse(savingField.getText()).doubleValue());
            info.setContrib(currencyFmt.parse(contribField.getText()).doubleValue());
            info.setIncome(currencyFmt.parse(incomeField.getText()).doubleValue());
            info.setCurrentAge(numberFmt.parse(currentAgeField.getText()).intValue());
            info.setRetireAge(numberFmt.parse(retireAgeField.getText()).intValue());
            info.setDeathAge(numberFmt.parse(deathAgeField.getText()).intValue());
            info.setInvestPercent(percentFmt.parse(investPercentField.getText()).doubleValue());
            info.setInflationPercent(percentFmt.parse(inflationPercentField.getText()).doubleValue());
        }catch (ParseException ex){
            ex.printStackTrace();
        }
    }
}
class RetireInfo{
    private double saving;
    private double contrib;
    private double income;
    private int currentAge;
    private int retireAge;
    private int deathAge;
    private double inflationPercent;
    private double investPercent;
    private int age;
  private double balance;

    public double getBalance(int year) {
        if (year < currentAge) return 0;
        else if (year==currentAge) {
            age=year;
            balance=saving;
            return balance;
        } else if (year==age) return balance;
        if (year!=age+1) getBalance(year-1);
        age=year;
        if (age<retireAge) balance+=contrib;
        else balance-=income;
        balance=balance*(1+(investPercent-inflationPercent));
        return balance;
    }

    public double getSaving() {
        return saving;
    }

    public void setSaving(double newValue) {
        this.saving = newValue;
    }

    public double getContrib() {
        return contrib;
    }

    public void setContrib(double newValue) {
            contrib = newValue;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double newValue) {
        income = newValue;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int newValue) {
       currentAge = newValue;
    }

    public int getRetireAge() {
        return retireAge;
    }

    public void setRetireAge(int newValue) {
        retireAge = newValue;
    }

    public int getDeathAge() {
        return deathAge;
    }

    public void setDeathAge(int newValue) {
      deathAge = newValue;
    }

    public double getInflationPercent() {
        return inflationPercent;
    }

    public void setInflationPercent(double newValue) {
       inflationPercent = newValue;
    }

    public double getInvestPercent() {
        return investPercent;
    }

    public void setInvestPercent(double newValue) {
       investPercent = newValue;
    }


}

class RetireComponent extends JComponent{
    private static final int PANEL_WIDTH=400;
    private static final int PANEL_HEIGHT=200;
    private static final Dimension PREFERRED_SIZE=new Dimension(800,600);
    private RetireInfo info=null;
    private Color colorPre;
    private Color colorGain;
    private Color colorLoss;
    public RetireComponent(){
        setSize(PANEL_WIDTH,PANEL_HEIGHT);
    }
    public void setInfo(RetireInfo newInfo){
        info=newInfo;
        repaint();
    }
    public void paintComponent(Graphics g){
        var  g2 = (Graphics2D) g;
        if (info==null) return;
        double minValue=0;
        double maxValue=0;
        int i;
        for (i = info.getCurrentAge(); i <info.getDeathAge() ; i++) {
            double v=info.getBalance(i);
            if (minValue>v) minValue=v;
            if (maxValue<v) maxValue=v;

        }
        if (maxValue==minValue) return;
        int barWidth=getWidth()/(info.getDeathAge()-info.getCurrentAge()+1);
        double scale=getHeight()/(maxValue-minValue);
        for ( i = 0; i <=info.getDeathAge(); i++) {
            int x1=(i-info.getCurrentAge())*barWidth+1;
            int y1;
            double v=info.getBalance(i);
            int height;
            int y0rigin= (int) (maxValue*scale);

            if (v>=0){
                y1= (int) ((maxValue-v)*scale);
                height=y0rigin-y1;
            }
            else {
                y1=y0rigin;
                height= (int) (-v*scale);
            }
            if (i<info.getRetireAge()) g2.setPaint(colorPre);
            else if (v>=0) g2.setPaint(colorGain);
            else g2.setPaint(colorLoss);
            var bar = new Rectangle2D.Double(x1, y1, barWidth - 2, height);
            g2.fill(bar);
            g2.setPaint(Color.black);
            g2.draw(bar);

        }
    }

    public void setColorGain(Color color) {
        colorGain = color;
        repaint();
    }

    public void setColorPre(Color color) {
        colorPre=color;
        repaint();
    }

    public void setColorLoss(Color color) {
        colorLoss = color;
        repaint();
    }

    @Override
    public  Dimension getPreferredSize() {
        return PREFERRED_SIZE;
    }
}

