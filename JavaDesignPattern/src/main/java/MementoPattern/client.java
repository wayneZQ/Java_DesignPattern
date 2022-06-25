package MementoPattern;

/**
 * @ClassName client
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/21 20:44
 **/
public class client {
    public static void main(String[] args) {
        MementoTaker taker = new MementoTaker();
        Chessman chess = new Chessman("che",1,1);
        display(chess);

        taker.setMemento(chess.save());
        chess.setY(4);
        display(chess);

        taker.setMemento(chess.save());
        chess.setX(5);
        display(chess);
        System.out.println("---------regret-------------");
        chess.restore(taker.getMemento());
        display(chess);
    }

    private static void display(Chessman chess) {
        System.out.println("chess: "+chess.getLabel()+"position: "+chess.getX()+" row"+chess.getY()+" column");
    }
}
