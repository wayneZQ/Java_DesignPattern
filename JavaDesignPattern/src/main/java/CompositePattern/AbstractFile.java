package CompositePattern;

/**
 * @ClassName AbstractFile
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/14 17:12
 **/
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();  //业务逻辑
}
