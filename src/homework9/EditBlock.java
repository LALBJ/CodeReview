package homework9;

import homework7.Command;

import java.util.ArrayList;

public class EditBlock {
    String content;
    ArrayList<Observer> obList = new ArrayList<Observer>();

    public void edit(String content){
        this.content = content;
        for (Object obj:obList){
            ((Observer)obj).update();
        }
    }
    public void addOb(Observer observer){
        obList.add(observer);
    }
    public void removeOb(Observer observer){
        obList.remove(observer);
    }
}
