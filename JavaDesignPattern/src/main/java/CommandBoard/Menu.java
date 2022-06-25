package CommandBoard;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Menu
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/20 20:35
 **/
public class Menu {
    List<MenuItem> menuItems;

    public Menu(){
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item){
        this.menuItems.add(item);
    }

}
