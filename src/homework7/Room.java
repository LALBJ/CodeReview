package homework7;

public class Room {
    public String name;
    Room(String name){
        this.name = name;
    }

    public void open() {
        System.out.println("打开灯");
    }

    public void close() {
        System.out.println("关上灯");
    }
}
