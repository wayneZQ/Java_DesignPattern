package BridgePattern;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

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
    public static Object getBean(String args){
        try{
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("D:\\java_designpattern\\DesignPattern\\JavaDesignPattern\\src\\main\\java\\BridgeMode\\config.xml"));

            //获取包含类名的文本节点
            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            nl = doc.getElementsByTagName("className");

            //获取第一个包含类名的节点，即扩充抽象类
            if(args.equals("image")){
                classNode = nl.item(0).getFirstChild();
            }
            //获取第二个包含类名的节点，即具体抽象类
            if(args.equals("os")){
                classNode = nl.item(1).getFirstChild();
            }
            assert classNode != null;
            cName = classNode.getNodeValue();

            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;


        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
