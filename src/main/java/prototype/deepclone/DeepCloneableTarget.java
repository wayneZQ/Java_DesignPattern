package prototype.deepclone;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeepCloneableTarget implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private  String cloneClass;

    public DeepCloneableTarget(String cloneName,String cloneClass){
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
