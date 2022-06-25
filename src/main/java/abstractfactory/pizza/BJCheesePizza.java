package abstractfactory.pizza;

public class BJCheesePizza extends Pizza {
    public BJCheesePizza(){
        this.name="Beijing Cheese pizza";
    }
    @Override
    public void prepare() {
        System.out.println("preparing for Beijing cheese pizza........");
    }
}
