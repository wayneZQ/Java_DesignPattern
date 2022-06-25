package Exercise219;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @ClassName LogHandler
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/18 12:04
 **/
public class LogHandler implements InvocationHandler {
    private Calendar calendar;
    private Object obj;

    public LogHandler(){}

    public LogHandler(Object obj){
        this.obj = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        try {
            method.invoke(obj,args);
            afterInvoke();
        }catch (Exception e){
            System.out.println("method request failed!");
            e.printStackTrace();
        }
       return null;
    }

    private void beforeInvoke(){
        calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour+" : "+minute+" : "+second;
        System.out.println("method was requested, record the time: "+time);
    }

    private void afterInvoke(){
        System.out.println("method request success!");
    }
}
