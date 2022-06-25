package FlyweightPattern;

/**
 * @ClassName client
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/15 16:11
 **/
public class client {
    public static void main(String[] args) {
        IgoChessman black1,black2,black3,white1,white2,white3;

        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();

        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");

        System.out.println(black1 == black2);

        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        white3 = factory.getIgoChessman("w");

        black1.display(new Coordinate(1,2));
        black2.display(new Coordinate(1,3));
        black3.display(new Coordinate(1,4));
        white1.display(new Coordinate(2,1));
        white2.display(new Coordinate(2,2));
        white3.display(new Coordinate(2,4));

    }
}
