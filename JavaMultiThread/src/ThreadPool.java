import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NumberThread implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<=100;i++){
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        /**
         * service.submit(); 适合用于callable
            service.execute();  适合用于runnable
         */ 
        service.execute(new NumberThread());
        service.shutdown();

    }
}
