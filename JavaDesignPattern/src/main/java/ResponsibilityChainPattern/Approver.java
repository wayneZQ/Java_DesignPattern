package ResponsibilityChainPattern;

/**
 * @ClassName Approver
 * @Description 抽象处理者
 * @Author Lenovo
 * @Date 2022/6/19 11:27
 **/
public abstract class Approver {

    protected Approver successor; //定义后继者对象
    protected String name;

    public Approver(String name){
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    //抽象处理请求方法
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
