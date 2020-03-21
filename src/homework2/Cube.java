package homework2;

public class Cube extends AbstractBlindge {
    String color;
    Cube(){
        System.out.println("新建Cube掩体");
    }
    @Override
    public void fill(String color) {
        this.color = color;
        System.out.println("为Cube添加" + color);
    }
}
