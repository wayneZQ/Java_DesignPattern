package StrategyPattern;



/**
 * @ClassName Client
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/10 15:40
 **/
public class Client {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        double originalPrice = 60.0;
        double currentPrice;

        mt.setPrice(originalPrice);
        System.out.println("original price: "+originalPrice);
        System.out.println("------------------------------");

        Discount discount;
        //读取配置文件并反射生成
        discount = (Discount) XMLUtil.getBean();
        //注入对象
        mt.setDiscount(discount);

        currentPrice = mt.getPrice();
        System.out.println("price after discount:" + currentPrice);
    }
}
