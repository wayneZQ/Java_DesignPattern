package FlyweightPattern;

/**
 * @ClassName IgoChessman
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/15 15:57
 **/
public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinate coordinate){
        System.out.println("chess color: "+this.getColor()+" chess position: "+coordinate.getX()+" "+coordinate.getY());
    }
}
