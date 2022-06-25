package CommandPattern;

/**
 * @ClassName FunctionButton
 * @Description 请求的调用者
 * @Author Lenovo
 * @Date 2022/6/19 22:40
 **/
public class FunctionButton {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void click(){
        System.out.print("click the function button: ");
        command.execute();
    }

}
