package Exercise348;

/**
 * @ClassName ClosingState
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/23 16:30
 **/
public class ClosingState extends DoorState {

    public ClosingState(DoorState doorState) {
        super(doorState);
        this.setStateCode("Closing state");
    }

    @Override
    public void click() {
        this.getDoorController().setDoorState(new openingState(this));
    }

    @Override
    public void complete() {
        this.getDoorController().setDoorState(new ClosedState(this));
    }

    @Override
    public void timeout() {
        System.out.println("Current State do not support this method! ");
    }
}
