package innerclasses.controller;
import innerclasses.controller.*;
public class GreenhouseControls extends Controller{
    private boolean light=false;
    public class LightOn extends Event{
        public LightOn(long delayTime){
            super(delayTime);

        }
        @Override
        public void action(){
            light=false;
        }
        public String toString(){
            return"light is on";
        }
    }
    public class LightOff extends Event{
        public LightOff(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            light=false;
        }
          public String toString(){
            return"light is off";
        }
    }
    private boolean water=false;
     public class WaterOn extends Event{
        public WaterOn(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            water=true;
        }
          public String toString(){
            return"water is on";
        }
    }
     public class WaterOff extends Event{
        public WaterOff(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            water=false;
        }
          public String toString(){
            return"water is off";
        }
    }
    private String thermostat="Day";
     public class TheromstatNight extends Event{
        public TheromstatNight(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            thermostat="night";
        }
          public String toString(){
            return"theromostat on night setting";
        }
    }
     public class TheromstatDay extends Event{
        public TheromstatDay(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
            thermostat="Day";
        }
          public String toString(){
            return"theromostat on day setting";
        }
    }
     public class Bell extends Event{
        public Bell(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){
           addEvent(new Bell(delayTime.toMillis()));
        }
          public String toString(){
            return"bing";
        }
    }
    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime,Event[] eventList){
            super(delayTime);
            this.eventList=eventList;
            for(Event e:eventList)
            addEvent(e);
        }
        @Override
        public void action(){
            for(Event e:eventList){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        @Override
        public String toString(){
            return "restarting system";
        }
    }
    public static class Terminate extends Event{
        public Terminate(long delayTime){
            super(delayTime);
        }
        @Override
        public void action(){System.exit(0);}
        @Override
        public String toString(){
            return "teminating";
        }
    }
}