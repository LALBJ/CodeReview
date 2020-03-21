package homework8;

public class BoardScreen {
    private Menu menu;
    private String name;
    BoardScreen(){
        menu = new Menu();
        System.out.println("新建公告牌");
    }
    public void open(){
        System.out.println("打开");
    }
    public void create(){
        System.out.println("新建");
    }
    public void edit(){
        System.out.println("编辑");
    }
}
