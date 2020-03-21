package homework2;

import java.util.ArrayList;

public class Blindage extends AbstractBlindge {
    private String color;
    ArrayList<AbstractBlindge> blinList = new ArrayList<AbstractBlindge>();

    Blindage(){
        System.out.println("新建复合掩体");
    }
    @Override
    public void fill(String color) {
        System.out.println("为复合掩体上色");
        for (Object obj:blinList){
            ((AbstractBlindge)obj).fill(color);
        }
    }
    public void add(AbstractBlindge abstractBlindge){
        blinList.add(abstractBlindge);
    }
    public void remove(AbstractBlindge abstractBlindge){
        blinList.remove(abstractBlindge);
    }
    public AbstractBlindge getBlin(int id){
        return (AbstractBlindge)blinList.get(id);
    }
}
