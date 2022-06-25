package FlyweightPattern;

import java.util.Hashtable;

/**
 * @ClassName IgoChessmanFactory
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/15 16:05
 **/
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht;

    private IgoChessmanFactory(){
        ht = new Hashtable();
        IgoChessman black,white;

        black = new BlackIgoChessman();
        white = new WhiteIgoChessman();

        ht.put("b",black);
        ht.put("w",white);
    }

    public static IgoChessmanFactory getInstance(){
        return instance;
    }
     public  IgoChessman getIgoChessman(String color){
        return (IgoChessman) ht.get(color);
     }
}
