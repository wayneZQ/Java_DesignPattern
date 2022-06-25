package mediatorPattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/21 14:09
 **/
public class Client {
    public static void main(String[] args) {

        //定义中介者对象
        ConcreteMediator mediator = new ConcreteMediator();

        //定义同事对象
        Button addBT = new Button();
        List list = new List();
        ComboBox cb = new ComboBox();

        addBT.setMediator(mediator);
        list.setMediator(mediator);
        cb.setMediator(mediator);

        mediator.setAddButton(addBT);
        mediator.setList(list);
        mediator.setCb(cb);

        addBT.changed();
        System.out.println("--------------------------------");
        list.changed();
        System.out.println("--------------------------------");
        cb.changed();

    }
}
