package ResponsibilityChainPattern;

/**
 * @ClassName Director
 * @Description
 * @Author Lenovo
 * @Date 2022/6/19 11:43
 **/
public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getAmount() < 50000){
            System.out.println("Director: "+name+" approve the request: "+purchaseRequest.getNumber()+" amount:"+purchaseRequest.getAmount()+"purpose: "+purchaseRequest.getPurpose());
        }else{
            this.successor.processRequest(purchaseRequest);
        }
    }
}
