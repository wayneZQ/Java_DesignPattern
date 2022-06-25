package Exercise348;

/**
 * @ClassName DoorState
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/23 15:28
 **/
public abstract class DoorState {

    protected DoorController doorController;
    protected String stateCode;

    public DoorState(DoorController doorController){
        this.setDoorController(doorController);
    }

    public DoorState(DoorState doorState){
        this.setDoorController(doorState.getDoorController());
    }


    public DoorState() {

    }

    public abstract void click();
    public abstract void complete();
    public abstract void timeout();

    public void setDoorController(DoorController doorController){
        this.doorController = doorController;
    }

    public DoorController getDoorController(){
        return this.doorController;
    }

    public void setStateCode(String code){
        this.stateCode = code;
    }

    public String getStateCode(){
        return this.stateCode;
    }

}
