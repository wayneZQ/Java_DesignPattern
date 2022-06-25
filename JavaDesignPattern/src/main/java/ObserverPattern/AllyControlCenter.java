package ObserverPattern;

/**
 * @ClassName AllyControlCenter
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/22 16:07
 **/
public class AllyControlCenter extends ControlCenter {

    public AllyControlCenter(String allyName){
        System.out.println(allyName+" construction complete!");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }

    @Override
    public void notifyAllObserver(String name) {
        System.out.println("our ally "+name+" is being attacked");
        for(Observer obs: this.players){
            //调用除自己以外的支援方法
            if(!obs.getName().equalsIgnoreCase(name)){
                obs.help();
            }
        }
    }
}
