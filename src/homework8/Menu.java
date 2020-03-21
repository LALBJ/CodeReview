package homework8;

import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
    Menu(){
        System.out.println("新建主菜单");
    }
    public void addMenuItem(MenuItem menuItem){
        menuList.add(menuItem);
    }
    public MenuItem getMenuItem(int id){
        return menuList.get(id);
    }
}
