package homework7;

public class Client {
    public static void main(String args[]){
        Controller controller = new Controller();
        Room room1 = new Room("1");
        Room room2 = new Room("2");
        Room room3 = new Room("3");
        Room room4 = new Room("4");
        Room room5 = new Room("5");

        Command command = new ConcreteCommand("1", room1);
        controller.setCommand(command,0);
        controller.commandList.get(4).open();

    }
}
