package homework7;

import java.util.ArrayList;

public class Controller {
    ArrayList<Command> commandList = new ArrayList<Command>();
    private Command cmd1;
    private Command cmd2;
    private Command cmd3;
    private Command cmd4;
    private Command cmd5;

    Controller(){
        commandList.add(cmd1);
        commandList.add(cmd2);
        commandList.add(cmd3);
        commandList.add(cmd4);
        commandList.add(cmd5);
    }

    public void setCommand(Command command,int id){
        commandList.remove(id);
        commandList.add(command);
    }
}
