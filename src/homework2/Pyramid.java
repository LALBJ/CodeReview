package homework2;

public class Pyramid extends AbstractBlindge {
    String color;
    Pyramid(){
        System.out.println("新建Pyramid");
    }
    @Override
    public void fill(String color) {
        this.color = color;
        System.out.println("为Pyramid添加" + color);
    }
}
