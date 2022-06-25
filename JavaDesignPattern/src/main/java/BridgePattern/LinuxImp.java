package BridgePattern;

/**
 * @ClassName LinuxImp
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/13 16:01
 **/
public class LinuxImp implements ImageImp {
    @Override
    public void doPaint(Matrix M) {
        System.out.println("paint in linux!");
    }
}
