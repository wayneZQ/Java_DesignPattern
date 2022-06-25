package ObserverPattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/22 16:19
 **/
public class Client {
    public static void main(String[] args) {
        ControlCenter cc = new AllyControlCenter("ally center");

        Observer player1,player2,player3,player4;
        player1 = new player("mike");
        player2 = new player("jimmy");
        player3 = new player("ben");
        player4 = new player("kim");

        cc.join(player1);
        cc.join(player2);
        cc.join(player3);
        cc.join(player4);

        player1.beAttacked(cc);
    }
}
