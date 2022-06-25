package CalculatorUndo;

/**
 * @ClassName Client
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/20 10:09
 **/
public class Client {
    public static void main(String[] args) {
        CalculatorForm calculatorForm = new CalculatorForm();
        AbstractCommand command;
        command = new AddCommand();
        calculatorForm.setAbstractCommand(command);

        calculatorForm.compute(10);
        calculatorForm.compute(20);
        calculatorForm.undo();


    }
}
