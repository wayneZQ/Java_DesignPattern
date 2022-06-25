package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @ClassName DAPLogHandler
 * @Description TODO
 * @Author ZWQ
 * @Date 2022/6/17 10:05
 **/
public class DAOLogHandler implements InvocationHandler {

    private Calendar calendar;
    private Object object;

    public DAOLogHandler(){}

    //用于注入一个需要提供代理的真实主题对象
    public DAOLogHandler(Object o){
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(object,args);
        afterInvoke();
        return result;
    }

    //记录调用时间的方法
    public void beforeInvoke(){
        calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour+" : "+minute+" : "+second;
        System.out.println("record the time: "+time);
    }
    public void afterInvoke(){
        System.out.println("request is over!");
    }
}
