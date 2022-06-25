package prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Sheep implements Cloneable{
    private int age;
    private String name;
    private String color;

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return sheep;
    }
}
