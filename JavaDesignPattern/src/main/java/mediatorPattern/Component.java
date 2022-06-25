package mediatorPattern;

/**
 * @ClassName Component
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/21 13:53
 **/
public abstract class Component {
    protected  Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    /**
     * 转发调用方法，与中介者通信
     */
    public void changed(){
        this.mediator.componentChanged(this);
    }

    /**
     * 自身实现方法
     */
    public abstract void update();
}
