package singleTon;

/**
 * 单例模式 饿汉式 使用静态代码块创建对象
 */
public class SingleTonTest02 {
    public static void main(String[] args) {

    }
}

class Singleton02{
    private  Singleton02(){}

    private static Singleton02 instance;

    static {
        instance = new Singleton02();
    }
    public static  Singleton02 getInstance(){
        return instance;
    }
}