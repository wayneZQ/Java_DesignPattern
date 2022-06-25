package abstractfactory.order;

import abstractfactory.pizza.Pizza;

/**
 * 抽象工厂模式，抽象层
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
