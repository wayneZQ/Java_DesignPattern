package prototype.deepclone;

import lombok.Data;

import java.io.*;


@Data
public class DeepPrototype implements Serializable,Cloneable {

    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype(){
        super();
    }

    //深拷贝 方式1：使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型的clone
        deep = super.clone();
        //对引用类型的属性进行单独的处理->DeepCloneableTarget
        DeepPrototype deepProtoType = (DeepPrototype) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoType;
    }
    //深拷贝 方式2：使用序列化，推荐使用
    public  Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);

            //将当前这个对象以对象流的形式输出  序列化
            oos.writeObject(this);

            //反序列化,对对象进行克隆
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copyObj = (DeepPrototype) ois.readObject();
            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
