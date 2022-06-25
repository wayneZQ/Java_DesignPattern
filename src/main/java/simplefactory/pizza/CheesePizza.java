package simplefactory.pizza;

public class CheesePizza extends Pizza {
    public CheesePizza(){
        this.name="Cheese pizza";
    }
    @Override
    public void prepare() {
        System.out.println("preparing for cheese pizza........");
    }
}
