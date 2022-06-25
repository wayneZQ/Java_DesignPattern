package BridgePattern;

/**
 * @ClassName WindowsImp
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/13 15:56
 **/
public class WindowsImp implements ImageImp {

    @Override
    public void doPaint(Matrix M) {
        System.out.println("paint in windows!");
    }
}
