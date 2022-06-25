package BridgePattern;

/**
 * @ClassName PNGImage
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/13 16:11
 **/
public class PNGImage extends Image{
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName+".png");
    }
}
