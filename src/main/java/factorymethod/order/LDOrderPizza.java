package factorymethod.order;

import factorymethod.pizza.*;

/**
 * 具体工厂
 * (pizza没有引入正确的包会报错)
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }else{
            pizza = null;
        }
        return pizza;
    }
}
