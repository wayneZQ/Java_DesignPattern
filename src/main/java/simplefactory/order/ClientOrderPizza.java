package simplefactory.order;

import simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientOrderPizza {

    public static void main(String[] args) {

        Pizza pizza = null;
        while (true){
            String pizzaType = ClientOrderPizza.getType();
            pizza = SimpleFactory.createPizza(pizzaType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("we do not have the pizza you want!");
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
