package homework1;

public class Client {
    public static void main(String[] args){
        AbstractMember mem1,mem2,mem3,mem4,gro1;

        gro1 = new Group("朋友");
        mem1 = new Member("A");
        mem2 = new Member("B");
        mem3 = new Member("C");
        mem4 = new Member("D");

        ((Group) gro1).add(mem3);
        ((Group) gro1).add(mem4);
        ((Group) gro1).add(mem2);

        mem1.share("最新动态");
        gro1.share("分享链接");
    }
}
