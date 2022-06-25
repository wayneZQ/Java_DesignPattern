import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

}
class Window implements Runnable{
    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try{
                //调用lock 锁定
                lock.lock();
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+" 售票，票号为："+ticket);
                    ticket--;
                }else{
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}