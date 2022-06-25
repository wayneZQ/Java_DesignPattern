package ObserverPattern;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName ControlCenter
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/22 10:56
 **/
public abstract class ControlCenter {

    protected String allyName;
    protected List<Observer> players = new ArrayList<>();

    public void setAllyName(String name){
        this.allyName = name;
    }
    public String getAllyName(){
        return this.allyName;
    }

    /**
     * 注册方法
     */
    public void join(Observer obs){
        System.out.println(obs.getName()+" join "+this.allyName+" ally!");
        players.add(obs);
    }

    /**
     * 注销方法
     */
    public void quit(Observer obs){
        System.out.println(obs.getName()+" quit "+this.allyName+" ally!");
        players.remove(obs);
    }

    public abstract void notifyAllObserver(String name);

}
