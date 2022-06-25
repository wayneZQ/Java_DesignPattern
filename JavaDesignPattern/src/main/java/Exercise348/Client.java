package Exercise348;

/**
 * @ClassName Client
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/23 17:13
 **/
public class Client {
    public static void main(String[] args) {
        DoorController doorController = new DoorController();
        for(int i=0;i<10;i++){
            doorController.click();
        }
    }
}
