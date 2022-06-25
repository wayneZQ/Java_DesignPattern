package mediatorPattern;

import lombok.Data;

/**
 * @ClassName ConcreteMediator
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/21 13:57
 **/
@Data
public class ConcreteMediator extends Mediator {

    /**
     * 维持对各个具体同事类的引用
     */
    private Button addButton;
    private List list;
    private ComboBox cb;

    /**
     * 封装了同事之间的交互
     * 逐个调用与该组件有交互的相关方法
     * @param c
     */
    @Override
    public void componentChanged(Component c) {
        //单击按钮
        if(c == addButton){
            System.out.println("click the add button!");
            list.update();
            cb.update();
        }
        //从列表中选择客户
        else if(c == list){
            System.out.println("choose the client from the list");
            cb.select();
        }
        //从组合框中选择客户
        else if(c == cb){
            System.out.println("choose the client from combo box");
            cb.select();
        }
    }
}
