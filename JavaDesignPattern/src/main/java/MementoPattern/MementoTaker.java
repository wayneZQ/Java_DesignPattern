package MementoPattern;

/**
 * @ClassName MementoTacker
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/21 20:42
 **/
public class MementoTaker {
    private ChessmanMemento memento;

    public ChessmanMemento getMemento(){
        return this.memento;
    }

    public void setMemento(ChessmanMemento memento){
        this.memento = memento;
    }
}
