package CommandBoard;

/**
 * @ClassName MenuItem
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/20 20:35
 **/
public class MenuItem {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command){
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}
