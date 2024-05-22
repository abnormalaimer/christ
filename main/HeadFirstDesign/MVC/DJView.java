package HeadFirstDesign.MVC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DJView implements ActionListener,BeatObserver,BPMObserver {
    BeatModelInterface model;
    ControllerInterface controller;
    JLabel bpmLabel;
    JTextField bpmTextField;
    JFrame viewFrame;
    Beatbar beatbar;
    JLabel bpmOutputLabel;

    public DJView(ControllerInterface controller,BeatModelInterface model) {
        this.model = model;
        this.controller = controller;
        model.registerObserver((BeatObserver) this);
        model.registerObserver((BPMObserver) this);
    }
    public void creatView(){}
    public void updateBPM(){
       int bpm=model.getBPM();
       if (bpm==0){
           bpmOutputLabel.setText("offline");
       }else {
           bpmOutputLabel.setText("Current BPM: "+model.getBPM());
       }
    }
    public void updateBeat(){
        beatbar.setValue(100);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
