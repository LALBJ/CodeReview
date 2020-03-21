package homework10;

public class SecurityDoor implements Observer {
    public void SecurityDoor(){
        System.out.println("安全逃生门自动开启");
    }
    @Override
    public void execute() {
        this.SecurityDoor();
    }
}
