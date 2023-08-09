package innerclasses.controller;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc=new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList={
            gc.new TheromstatNight(0),
            gc.new LightOn(2000),
            gc.new LightOff(4000),
            gc.new WaterOn(6000),
            gc.new WaterOff(8000),
            gc.new TheromstatDay(14000)
        };
        gc.addEvent(gc.new Restart(20000 , eventList));
        gc.addEvent(new GreenhouseControls.Terminate(5000));
        gc.run();
    }
}
