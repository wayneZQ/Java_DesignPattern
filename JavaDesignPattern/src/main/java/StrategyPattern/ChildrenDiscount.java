package StrategyPattern;

/**
 * @ClassName ChildrenDiscount
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/10 15:10
 **/
public class ChildrenDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("children ticket");
        return price - 10;
    }
}
