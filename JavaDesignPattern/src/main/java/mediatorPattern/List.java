package mediatorPattern;

/**
 * @ClassName List
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/21 14:00
 **/
public class List extends Component {
    @Override
    public void update() {
        System.out.println("add a new item in the list!");
    }

    public void select(){
        System.out.println("choose an item in the list!");
    }
}
