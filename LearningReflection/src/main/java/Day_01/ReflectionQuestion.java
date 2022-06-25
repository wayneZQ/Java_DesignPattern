package Day_01;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @ClassName ReflectionQuestion
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/12 16:11
 **/
public class ReflectionQuestion {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, IOException, ClassNotFoundException, NoSuchMethodException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("D:\\java_designpattern\\DesignPattern\\LearningReflection\\src\\re.properties"));
        String classFullPath = properties.get("classFullPath").toString();
        String methodName = properties.get("method").toString();

        Class cls = Class.forName(classFullPath);
        Object O = cls.newInstance();
        System.out.println("O的运行类型为："+O.getClass());

        Method method = cls.getMethod(methodName);
        System.out.println("================================");
        method.invoke(O);
    }
}
