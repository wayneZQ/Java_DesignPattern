package BridgePattern;

/**
 * @ClassName Image
 * @Description 抽象类
 * @Author zwq
 * @Date 2022/6/13 15:52
 **/
public abstract class Image {
    protected ImageImp imp;

    public void setImageImp(ImageImp imp){
        this.imp = imp;
    }
    public abstract void parseFile(String fileName);

}
