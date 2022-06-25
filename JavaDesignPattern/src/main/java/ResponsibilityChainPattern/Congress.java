package ResponsibilityChainPattern;

/**
 * @ClassName Congress
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/19 12:13
 **/
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        System.out.println("hold the meeting: "+name+" approve the request: "+purchaseRequest.getNumber()+" amount:"+purchaseRequest.getAmount()+"purpose: "+purchaseRequest.getPurpose());
    }
}
