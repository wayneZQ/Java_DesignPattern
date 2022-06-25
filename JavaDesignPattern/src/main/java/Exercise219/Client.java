package Exercise219;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/18 15:30
 **/
public class Client {
    public static void main(String[] args) {
        InvocationHandler handler = null;
        Business_1 business_1 = new Business_1();
        AbstractBusiness proxy = null;

        handler = new LogHandler(business_1);
        proxy = (AbstractBusiness) Proxy.newProxyInstance(AbstractBusiness.class.getClassLoader(),new Class[]{AbstractBusiness.class},handler);
        proxy.operation();

    }
}
