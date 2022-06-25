package CompositePattern;

/**
 * @ClassName TextFile
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/14 17:24
 **/
public class TextFile extends AbstractFile {

    private String name;
    public TextFile(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("not support");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("not support");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("not support");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("kill virus for"+name+"text file");
    }
}
