package CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Folder
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/14 17:38
 **/
public class Folder extends AbstractFile {

    private String name;

    private List<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        this.fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        this.fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return this.fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("===== kill virus for"+name+" folder =====");

        for (AbstractFile file:fileList){
            file.killVirus();
        }
    }
}
