package ResponsibilityChainPattern;

/**
 * @ClassName President
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/19 12:12
 **/
public class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getAmount() < 50000){
            System.out.println("President: "+name+" approve the request: "+purchaseRequest.getNumber()+" amount:"+purchaseRequest.getAmount()+"purpose: "+purchaseRequest.getPurpose());
        }else{
            this.successor.processRequest(purchaseRequest);
        }
    }
}
