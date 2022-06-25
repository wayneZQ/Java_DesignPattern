package Exercise348;

/**
 * @ClassName StayOpenState
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/23 16:30
 **/
public class StayOpenState extends DoorState {

    public StayOpenState(DoorState doorState) {
        super(doorState);
        this.setStateCode("stay open state");
    }

    @Override
    public void click() {
        this.getDoorController().setDoorState(new ClosingState(this));
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
