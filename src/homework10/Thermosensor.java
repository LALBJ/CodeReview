package homework10;

import java.util.ArrayList;

public class Thermosensor {
    private ArrayList<Observer> obList = new ArrayList<Observer>();

    public void addObserver(Observer ob){
        obList.add(ob);
    }
    public void removeObserver(Observer ob){
        obList.remove(ob);
    }
    public void triger(){
        for (Object obj:obList){
            ((Observer)obj).execute();
        }
    }
}
