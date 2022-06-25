package singleTon;

/**
 * 饿汉式写法（静态变量）
 */
public class SingleTonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);

    }
}

class Singleton{

    //将构造器私有化,外部不能new
    private Singleton(){}

    //在本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //提供一个公有的静态方法，返回实例对象即可
    public static Singleton getInstance(){
        return instance;
    }

}