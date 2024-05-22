package HeadFirstDesign.Command.Command;

import HeadFirstDesign.Command.Light;

public class LightOnCommand implements Command{
    Light light;
    public LightOnCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
