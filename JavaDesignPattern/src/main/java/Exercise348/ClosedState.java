package Exercise348;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ClosedState
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/23 15:30
 **/
public class ClosedState extends DoorState {

    private DoorController doorController;

    public ClosedState(){
        super();
        this.setStateCode("closed state");
    }

    public ClosedState(DoorController doorController){
        super(doorController);
        this.setStateCode("closed state");
    }

    public ClosedState(DoorState doorState) {
        super(doorState);
        this.setStateCode("closed state");
    }


    @Override
    public void click() {
       this.doorController.setDoorState(new openingState(this));

    }

    @Override
    public void complete() {
        System.out.println("Current State do not support this method! ");
    }

    @Override
    public void timeout() {
        System.out.println("Current State do not support this method! ");
    }




}
