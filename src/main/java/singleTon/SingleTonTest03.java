package singleTon;

/**
 * 单例模式 懒汉式 线程不安全
 */
public class SingleTonTest03 {
    public static void main(String[] args) {
        System.out.println("<========懒汉式========>");

    }
}

class Singleton03{
    private  Singleton03(){}

    private static Singleton03 instance;

    //提供一个静态公有方法，当使用该方法时才进行创建
    public static Singleton03 getInstance(){
        if(instance == null){
            instance = new Singleton03();
        }
        return instance;
    }

}