package CommandPattern;

/**
 * @ClassName HelpCommand
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/19 22:33
 **/
public class HelpCommand extends Command{

    private DisplayHelpClass dhObj;

    public HelpCommand(){
        this.dhObj = new DisplayHelpClass();
    }

    @Override
    public void execute() {
        dhObj.display();
    }
}
