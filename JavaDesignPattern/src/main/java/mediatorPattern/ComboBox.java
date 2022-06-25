package mediatorPattern;

/**
 * @ClassName ComboBox
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/21 14:02
 **/
public class ComboBox extends Component {
    @Override
    public void update() {
        System.out.println("add an item in the combo box!");
    }
    public void select(){
        System.out.println("choose an item in the combo box!");
    }
}
