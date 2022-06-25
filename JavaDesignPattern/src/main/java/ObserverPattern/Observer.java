package ObserverPattern;

/**
 * @ClassName Observer
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/22 11:00
 **/
public interface Observer {
    String getName();
    void setName(String name);
    void help();  //声明支援盟友方法
    void beAttacked(ControlCenter cc);  //声明遭受攻击方法

}
