package abstractfactory.order;

import abstractfactory.pizza.LDCheesePizza;
import abstractfactory.pizza.LDPepperPizza;
import abstractfactory.pizza.Pizza;

public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
