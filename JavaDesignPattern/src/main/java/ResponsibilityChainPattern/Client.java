package ResponsibilityChainPattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/19 12:14
 **/
public class Client {
    public static void main(String[] args) {
        Approver mike,jason,bill,meeting;
        mike = new Director("MIKE");
        jason = new VicePresident("JASON");
        bill = new President("BILL");
        meeting = new Congress("first meeting");

        mike.setSuccessor(jason);
        jason.setSuccessor(bill);
        bill.setSuccessor(meeting);

        PurchaseRequest p1 = new PurchaseRequest(45000.0,10001,"buy fruit");
        PurchaseRequest p2 = new PurchaseRequest(60000.0,10002,"buy the cook");
        PurchaseRequest p3 = new PurchaseRequest(200000.0,10003,"buy the missile");

        mike.processRequest(p1);
        mike.processRequest(p2);
        mike.processRequest(p3);

    }
}
