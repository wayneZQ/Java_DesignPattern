package Exercise348;

import lombok.Data;

/**
 * @ClassName DoorController
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/23 15:28
 **/
@Data
public class DoorController {

    private DoorState doorState;

    public DoorController(){
        this.doorState = new ClosedState(this);
    }

    public void setDoorState(DoorState doorState){
        this.doorState = doorState;
    }

    public void click(){
        this.doorState.click();
        System.out.println("current state is: "+this.doorState.getStateCode());
    }

    public void complete(){
        this.doorState.complete();
        System.out.println("current state is: "+this.doorState.getStateCode());
    }

    public void timeout(){
        this.doorState.timeout();
        System.out.println("current state is: "+this.doorState.getStateCode());
    }

}
