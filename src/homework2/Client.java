package homework2;

public class Client {
    public static void main(String[] args){
        AbstractBlindge mem1,mem2,mem3,mem4,gro1;

        gro1 = new Blindage();
        mem1 = new Cube();
        mem2 = new Cylinder();
        mem3 = new Pyramid();

        ((Blindage) gro1).add(mem3);
        ((Blindage) gro1).add(mem1);
        ((Blindage) gro1).add(mem2);

        gro1.fill("Red");
    }
}
