package homework10;

public class Annunciator implements Observer {
    public void alarm(){
        System.out.println("报警器发出警报");
    }
    @Override
    public void execute() {
        this.alarm();
    }
}
