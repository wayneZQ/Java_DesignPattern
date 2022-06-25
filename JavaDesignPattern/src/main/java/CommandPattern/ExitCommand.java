package CommandPattern;

/**
 * @ClassName ExitCommand
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/19 22:25
 **/
public class ExitCommand extends Command {

    private SystemExitClass seObj;

    public ExitCommand(){
        seObj = new SystemExitClass();
    }

    @Override
    public void execute() {
        seObj.exit();
    }
}
