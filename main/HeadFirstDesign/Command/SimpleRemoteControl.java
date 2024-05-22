package HeadFirstDesign.Command;

import HeadFirstDesign.Command.Command.Command;

public class SimpleRemoteControl{
    Command slot;
    public SimpleRemoteControl(){}
    public void setCommand(Command command){
        slot=command;
    }
    public void buttonWaspressed(){
        slot.execute();
    }
    
}
