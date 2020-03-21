package homework8;

public class MenuItem {
    private String name;
    private Command command;
    public void click(){
        this.command.execute();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
