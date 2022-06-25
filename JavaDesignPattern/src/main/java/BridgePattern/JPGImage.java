package BridgePattern;

/**
 * @ClassName JPGImage
 * @Description TODO
 * @Author ZWQ
 * @Date 2022/6/13 16:09
 **/
public class JPGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName+".JGP");
    }
}
