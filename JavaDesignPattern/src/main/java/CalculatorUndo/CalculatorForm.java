package CalculatorUndo;

/**
 * @ClassName CalculatorForm
 * @Description 请求的发送者
 * @Author Lenovo
 * @Date 2022/6/20 10:02
 **/
public class CalculatorForm {
    private AbstractCommand abstractCommand;

    public void setAbstractCommand(AbstractCommand command){
        this.abstractCommand = command;
    }

    public void compute(int value){
        int i = abstractCommand.execute(value);
        System.out.println("execute the computing, the result is: " + i);
    }
    public void undo(){
        int i = abstractCommand.undo();
        System.out.println("undo the computing, the result is: " + i);
    }
}
