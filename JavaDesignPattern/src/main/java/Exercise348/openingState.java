package Exercise348;

/**
 * @ClassName openingState
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/23 16:29
 **/
public class openingState extends DoorState {



    public openingState(DoorState doorState) {
        super(doorState);
        this.setStateCode("opening state");
    }

    @Override
    public void click() {
        this.getDoorController().setDoorState(new ClosingState(this));
    }

    @Override
    public void complete() {
        this.getDoorController().setDoorState(new openState(this));
    }

    @Override
    public void timeout() {
        System.out.println("Current State do not support this method! ");
    }
}
