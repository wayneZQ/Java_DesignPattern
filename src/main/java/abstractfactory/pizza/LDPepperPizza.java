package abstractfactory.pizza;

public class LDPepperPizza extends Pizza {
    public LDPepperPizza(){
        this.name="London Pepper pizza";
    }
    @Override
    public void prepare() {
        System.out.println("preparing for London Pepper pizza........");
    }
}
