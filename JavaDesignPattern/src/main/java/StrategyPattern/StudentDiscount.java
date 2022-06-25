package StrategyPattern;

/**
 * @ClassName StudentDiscount
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/10 15:09
 **/
public class StudentDiscount implements Discount{
    @Override
    public double calculate(double price) {
        System.out.println("student ticket:");
        return price*0.8;
    }
}
