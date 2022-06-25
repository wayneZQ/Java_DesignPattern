package simplefactory.order;

import simplefactory.pizza.CheesePizza;
import simplefactory.pizza.GreekPizza;
import simplefactory.pizza.Pizza;

/**
 * 简单工厂类(静态工厂)
 */
public class SimpleFactory {
    public static Pizza createPizza(String orderType){
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
