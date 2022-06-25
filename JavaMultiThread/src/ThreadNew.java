import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 1.实现callable接口。---- JDK 5.0
 * 2. 
 */

class NumThread implements Callable<Integer>{
    @Override
    public Integer call() throws Exception{
        int sum = 0;
        for(int i=1;i<=100;i++){
            if(i%2 == 0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}
public class ThreadNew {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        
       FutureTask<Integer> futureTask =  new FutureTask<Integer>(numThread);
       new Thread(futureTask).start();
       //获取call 方法的回调
       try{
           Object sum =  futureTask.get();
           System.out.println(sum);
       }catch(InterruptedException e ){
           e.printStackTrace();
       }catch(ExecutionException e ){
           e.printStackTrace();
       }
    }
}
