package factorymethod.order;

import factorymethod.pizza.BJCheesePizza;
import factorymethod.pizza.BJPepperPizza;
import factorymethod.pizza.Pizza;

/**
 * 具体工厂
 * (pizza没有引入正确的包会报错)
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }else{
            pizza = null;
        }
        return pizza;
    }
}
