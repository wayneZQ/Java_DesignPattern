package MementoPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Chessman
 * @Description 棋子类，充当原发器
 * @Author Lenovo
 * @Date 2022/6/21 20:34
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chessman {
    private String label;
    private int x;
    private int y;

    /**
     * 保存当前状态
     * @return
     */
    public ChessmanMemento save(){
        return new ChessmanMemento(this.getLabel(),this.getX(),this.getY());
    }
    /**
     * 恢复状态
     */
    public void restore(ChessmanMemento memento){
        this.setLabel(memento.getLabel());
        this.setX(memento.getX());
        this.setY(memento.getY());
    }
}
