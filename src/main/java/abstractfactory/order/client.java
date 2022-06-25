package abstractfactory.order;

public class client {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
