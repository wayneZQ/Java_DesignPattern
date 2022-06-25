package AdapterPattern;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @ClassName XMLUtil
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/10 15:21
 **/
public class XMLUtil {
    /**
     * 用于从XML配置文件中提取具体类类名，并返回一个实例对象
     * @return
     */
    public static Object getBean(){
        try{
//            //创建文档对象
//            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = dFactory.newDocumentBuilder();
//            Document doc;
//            doc = builder.parse(new File("D:\\java_designpattern\\DesignPattern\\src\\main\\java\\StrategyMode\\config.xml"));
//
//            //获取包含类名的文本节点
//            NodeList nl = doc.getElementsByTagName("className");
//            Node classNode = nl.item(0).getFirstChild();
//            String cName = classNode.getNodeValue();
//
//            //通过类名生成实例对象并将其返回
//            Class c = Class.forName(cName);
//            Object obj = c.newInstance();
//            return obj;
            Properties properties = new Properties();
            properties.load(new FileInputStream("D:\\java_designpattern\\DesignPattern\\JavaDesignPattern\\src\\main\\java\\AdapterMode\\config.properties"));
            String classFullPath = properties.get("classFullPath").toString();
            Class cls = Class.forName(classFullPath);
            Object obj = cls.newInstance();
            return obj;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
