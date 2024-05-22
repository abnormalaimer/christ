package HeadFirstDesign.Command.Command;

import HeadFirstDesign.Command.Light;

public class LightOffCommand implements Command{
    Light light;
    public LightOffCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
