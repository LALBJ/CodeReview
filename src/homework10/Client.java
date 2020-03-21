package homework10;

public class Client {
    public static void  main(String args[]){
        Thermosensor thermosensor = new Thermosensor();
        Observer ob1,ob2,ob3,ob4;
        ob1 = new CautionLight();
        ob2 = new Annunciator();
        ob3 = new SecurityDoor();
        ob4 = (Observer)XMLUtil.getBean();
        thermosensor.addObserver(ob1);
        thermosensor.addObserver(ob2);
        thermosensor.addObserver(ob3);
        thermosensor.addObserver(ob4);

        thermosensor.triger();

    }
}
