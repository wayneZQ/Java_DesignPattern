package BridgePattern;

/**
 * @ClassName client
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/13 23:18
 **/
public class client {
    public static void main(String[] args) {
        Image image;
        ImageImp imageImp;

        image = (Image) XMLUtil.getBean("image");
        imageImp = (ImageImp) XMLUtil.getBean("os");

        image.setImageImp(imageImp);
        image.parseFile("jeff");
    }
}
