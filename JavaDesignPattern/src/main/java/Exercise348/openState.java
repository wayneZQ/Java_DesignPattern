package Exercise348;

/**
 * @ClassName openState
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/23 16:29
 **/
public class openState extends DoorState {

    public openState(DoorState doorState) {
        super(doorState);
        this.setStateCode("open state");
    }

    @Override
    public void click() {
        this.getDoorController().setDoorState(new StayOpenState(this));
    }

    @Override
    public void complete() {
        System.out.println("Current State do not support this method! ");
    }

    @Override
    public void timeout() {
        this.getDoorController().setDoorState(new ClosedState(this));
    }
}
