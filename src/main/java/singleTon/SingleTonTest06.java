package singleTon;

/**
 * 单例模式 懒汉式 双重检查
 */
public class SingleTonTest06 {
    public static void main(String[] args) {
        System.out.println("<========懒汉式========>");
        Singleton06 instance = Singleton06.getInstance();
        Singleton06 instance1 = Singleton06.getInstance();
        System.out.println(instance == instance1);
    }
}

class Singleton06{
    /**
     * volatile 防止指令重排
     */
    private static volatile Singleton06 instance;

    private  Singleton06(){}

    //双重检查
    public static synchronized Singleton06 getInstance(){
        if(instance == null){ //后面的代码不会再去执行效率较低的同步代码，提高效率
            synchronized (Singleton06.class){
                if (instance == null) {
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }

}