package HeadFirstDesign.Command;

import HeadFirstDesign.Command.Command.LightOnCommand;

public class RemoteControlTest{
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
       LightOnCommand light0n= new LightOnCommand(light);
       remote.setCommand(light0n);
       remote.buttonWaspressed();
    }
}
