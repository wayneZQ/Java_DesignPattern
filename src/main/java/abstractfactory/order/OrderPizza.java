package abstractfactory.order;

import abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory absFactory;

    public  OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    public void setFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType = null;
        this.absFactory=factory;
        while (true){
            orderType = OrderPizza.getType();
            pizza = factory.createPizza(orderType);
            if(pizza !=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box() ;
            }else{
                System.out.println("no such kind of pizza");
                break;
            }
        }
    }

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
