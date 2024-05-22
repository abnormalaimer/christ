package HeadFirstDesign.MVC;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;
import java.util.ArrayList;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer sequencer;
    ArrayList beatObservers = new ArrayList();
    ArrayList bpmObservers = new ArrayList();
    int bpm = 90;

    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();

    }

    private void setUpMidi() {

    }

    private void buildTrackAndStart() {

    }


    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();

    }

    @Override
    public void setBPM(int bpm) {
        this.bpm=bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();

    }

    private void notifyBPMObservers() {

    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registerObserver(BeatObserver o) {

    }

    @Override
    public void removeObserver(BeatObserver o) {

    }

    @Override
    public void registerObserver(BPMObserver o) {

    }

    @Override
    public void removeObserver(BPMObserver o) {

    }

    void beatEvent() {
        notifyBeatObservers();
    }

    private void notifyBeatObservers() {

    }

    @Override
    public void meta(MetaMessage meta) {

    }
}
