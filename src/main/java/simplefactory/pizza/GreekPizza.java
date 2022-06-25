package simplefactory.pizza;

public class GreekPizza extends Pizza {
    public GreekPizza(){
        this.name="Greek pizza";
    }
    @Override
    public void prepare() {
        System.out.println("preparing for Greek pizza........");
    }
}
