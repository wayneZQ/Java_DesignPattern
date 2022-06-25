package factorymethod.order;


import factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 抽象工厂
 */
public abstract class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        while (true){
            orderType = OrderPizza.getType();
            pizza = createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("no such kind of pizza");
                break;
            }
        }
    }

    /**
     * 定义一个抽象方法，让各个工厂子类自己实现
     * 每个具体工厂负责具体产品的生产
     */
    public abstract Pizza createPizza(String orderType);


    private static String getType(){
        String str = null;
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input the pizza you want: ");
            str = strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  str;
    }
}
