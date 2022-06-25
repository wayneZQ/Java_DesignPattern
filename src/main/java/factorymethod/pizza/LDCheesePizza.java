package factorymethod.pizza;

public class LDCheesePizza extends Pizza {
    public LDCheesePizza(){
        this.name="London Cheese pizza";
    }
    @Override
    public void prepare() {
        System.out.println("preparing for London cheese pizza........");
    }
}
