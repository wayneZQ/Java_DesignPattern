package CommandPattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/19 23:27
 **/
public class Client {
    public static void main(String[] args) {
        FunctionButton fb = new FunctionButton();
        Command command;

        command = (Command) XMLUtil.getBean();

        fb.setCommand(command);
        fb.click();
    }

}
