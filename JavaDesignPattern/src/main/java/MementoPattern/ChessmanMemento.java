package MementoPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ChessmanMemento
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/21 20:38
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
class ChessmanMemento {
    private String label;
    private int x;
    private int y;
}
