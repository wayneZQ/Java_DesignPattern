package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/17 11:11
 **/
public class Client {
    public static void main(String[] args) {
        InvocationHandler handler = null;
        AbstractUserDAO userDAO = new UserDAO();
        handler = new DAOLogHandler(userDAO);
        AbstractUserDAO proxy = null;
        //动态代理创建对象，用于代理一个AbstractUserDAO 类型的真实主题对象
        proxy = (AbstractUserDAO) Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(),new Class[]{AbstractUserDAO.class},handler);

        proxy.findUserById("zwj");

        System.out.println("----------------------------------------------------");

        AbstractDocumentDAO docDAO = new DocumentDAO();
        handler = new DAOLogHandler(docDAO);
        AbstractDocumentDAO proxy_new = null;

        proxy_new = (AbstractDocumentDAO) Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(),new Class[]{AbstractDocumentDAO.class},handler);
        proxy_new.deleteDocumentById("D002");




    }
}
