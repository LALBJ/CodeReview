package homework2;

public class Cylinder extends AbstractBlindge {
    String color;
    Cylinder(){
        System.out.println("新建Cylinder");
    }
    @Override
    public void fill(String color) {
        this.color = color;
        System.out.println("为Cylinder添加" + color);
    }
}
