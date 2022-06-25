package BridgePattern;

/**
 * @ClassName UnixImp
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/13 16:04
 **/
public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix M) {
        System.out.println("paint in unix");
    }
}
