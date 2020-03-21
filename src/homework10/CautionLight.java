package homework10;

public class CautionLight implements Observer{

    public void flicker(){
        System.out.println("警示灯闪烁");
    }
    @Override
    public void execute() {
        this.flicker();
    }
}
