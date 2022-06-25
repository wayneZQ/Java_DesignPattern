
class Clerk{
    private int productCount = 0;
    /**
     * 生产产品
     */
    public synchronized void produceProduct() {
        if(productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+":start to produce No."+productCount+" product.......");
            notify();
        }else{
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    /**
     * 消费产品
     */
    public synchronized void consumeProduct() {
        if(productCount > 0){
            System.out.println(Thread.currentThread().getName()+"start to consume No."+productCount+" product........");
            productCount --;
            notify();
        }else{
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


class Producer extends Thread{
    private Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":开始生产产品。。。。。。。");
        while (true){
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}


class Customer extends Thread{
    private Clerk clerk;
    public Customer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":开始消费产品。。。。。。。");
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
} 



public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Customer c1 = new Customer(clerk);
        c1.setName("消费者1");

        p1.start();
        c1.start();


    }
}
