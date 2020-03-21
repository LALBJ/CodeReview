package homework1;

public class Member extends AbstractMember {
    private String name;
    public Member(String name){
        this.name = name;
    }

    @Override
    public void share(String message){
        System.out.println("分享给" + this.name);
    }
}
