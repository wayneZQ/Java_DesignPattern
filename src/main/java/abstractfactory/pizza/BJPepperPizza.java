package abstractfactory.pizza;

public class BJPepperPizza extends Pizza {
    public BJPepperPizza(){
        this.name="Beijing Pepper pizza";
    }
    @Override
    public void prepare() {
        System.out.println("preparing for Beijing Pepper pizza........");
    }
}
