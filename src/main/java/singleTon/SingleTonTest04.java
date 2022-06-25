package singleTon;

/**
 * 单例模式 懒汉式 线程安全
 */
public class SingleTonTest04 {
    public static void main(String[] args) {
        System.out.println("<========懒汉式========>");
        
    }
}

class Singleton04{
    private  Singleton04(){}

    private static Singleton04 instance;

    //提供一个静态公有方法，当使用该方法时才进行创建
    //加入同步代码块 同步锁！ 保证了线程安全
    public static  synchronized Singleton04 getInstance(){
        if(instance == null){
            instance = new Singleton04();
        }
        return instance;
    }

}