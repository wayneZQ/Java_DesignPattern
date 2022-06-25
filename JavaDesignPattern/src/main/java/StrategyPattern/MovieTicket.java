package StrategyPattern;

/**
 * @ClassName MovieTicket
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/10 14:59
 **/
public class MovieTicket {
    private double price;
    private Discount discount;

    public void setPrice(double price){
        this.price = price;
    }

    /**
     * 注入一个折扣类对象
     * @param discount
     */
    public void setDiscount(Discount discount){
        this.discount = discount;
    }
    public double getPrice(){
        return discount.calculate(this.price);
    }
}
