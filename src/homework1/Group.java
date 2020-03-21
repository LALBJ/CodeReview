package homework1;

import java.util.ArrayList;

public class Group extends AbstractMember {
    private String name;
    private ArrayList<AbstractMember> memList = new ArrayList<AbstractMember>();
    public Group(String name){
        this.name = name;
    }

    @Override
    public void share(String message) {
        System.out.println("分享至" + this.name + "群组");
        for (Object obj:memList){
            ((AbstractMember)obj).share(message);
        }
    }

    public void add(AbstractMember member){
        memList.add(member);
    }

    public void remove(AbstractMember member){
        memList.remove(member);
    }

    public AbstractMember getMem(int id){
        return (AbstractMember)memList.get(id);
    }
}
