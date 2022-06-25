package BridgePattern;

/**
 * @ClassName BMPImage
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/13 16:12
 **/
public class BMPImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName+".bmp");
    }
}
