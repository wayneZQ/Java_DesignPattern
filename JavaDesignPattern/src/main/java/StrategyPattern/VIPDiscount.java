package StrategyPattern;

/**
 * @ClassName VIPDiscount
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/10 15:18
 **/
public class VIPDiscount implements Discount{

    @Override
    public double calculate(double price) {
        System.out.println("Vip ticket:");
        System.out.println("add the value");
        return price * 0.5;
    }
}
