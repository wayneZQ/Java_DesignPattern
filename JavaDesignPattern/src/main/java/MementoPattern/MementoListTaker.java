package MementoPattern;

import java.util.ArrayList;

/**
 * @ClassName MementoListTaker
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/21 20:55
 **/
public class MementoListTaker {

    private ArrayList<ChessmanMemento> chessmanMementos = new ArrayList<>();

    public ChessmanMemento getMemento(int i){
         return chessmanMementos.get(i);
    }
    public void setMemento(ChessmanMemento memento){
        this.chessmanMementos.add(memento);
    }

}
