package ResponsibilityChainPattern;

/**
 * @ClassName VicePresident
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/19 11:51
 **/
public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getAmount() < 100000){
            System.out.println("Vice president: "+name+" approve the request: "+purchaseRequest.getNumber()+" amount:"+purchaseRequest.getAmount()+"purpose: "+purchaseRequest.getPurpose());
        }else{
            this.successor.processRequest(purchaseRequest);
        }
    }
}
