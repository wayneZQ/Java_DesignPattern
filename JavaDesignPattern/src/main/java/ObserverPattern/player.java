package ObserverPattern;

/**
 * @ClassName player
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/22 15:45
 **/
public class player implements Observer {

    private String name;

    public player(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 支援盟友
     */
    @Override
    public void help() {
        System.out.println("hold on "+this.getName()+" is coming to rescue!");
    }

    @Override
    public void beAttacked(ControlCenter cc) {
        System.out.println(this.getName()+" is being attacked!");
        cc.notifyAllObserver(this.getName());
    }
}
