package homework10;

public class Adapter implements Observer {
    Adaptee adp;
    Adapter(){
         adp = new Adaptee();
    }
    @Override
    public void execute() {
        adp.response();
    }
}
