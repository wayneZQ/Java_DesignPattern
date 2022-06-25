package singleTon;

/**
 * 单例模式 懒汉式 静态内部类
 */
public class SingleTonTest07 {
    public static void main(String[] args) {
        System.out.println("<========懒汉式========>");
        Singleton07 instance = Singleton07.getInstance();
        Singleton07 instance1 = Singleton07.getInstance();
        System.out.println(instance == instance1);

    }
}

class Singleton07{
    /**
     * volatile 防止指令重排
     */
    private static volatile Singleton06 instance;

    private  Singleton07(){}

   //静态内部类，该类中有一个静态属性singleton07
    private static class SingletonInstance{
        private static final Singleton07 INSTANCE = new Singleton07();
   }
   public static synchronized Singleton07 getInstance(){
        return SingletonInstance.INSTANCE;
   }

}