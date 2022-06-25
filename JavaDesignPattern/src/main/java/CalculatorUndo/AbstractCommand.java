package CalculatorUndo;

/**
 * @ClassName AbstractCommand
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/20 9:38
 **/
public abstract class AbstractCommand {
    public abstract int execute(int value);
    public abstract int undo();
}
