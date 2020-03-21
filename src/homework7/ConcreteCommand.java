package homework7;

public class ConcreteCommand implements Command{
    private String name;
    private Room room;
    ConcreteCommand(String name, Room room){
        this.name = name;
        this.room = room;
        System.out.println(this.name + "按键控制" + this.room.name + "房间");
    }
    @Override
    public void open() {
        room.open();
    }

    @Override
    public void close() {
        room.close();
    }
}
