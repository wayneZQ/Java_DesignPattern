package zwq;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class LamdaDemo01 {
    public static void main(String[] args) {
//        new Thread(() -> {
//            System.out.println(Thread.currentThread().getName()+" is running");
//        }
//        ).start();

//        calculateNum(new IntBinaryOperator() {
//            @Override
//            public int applyAsInt(int left, int right) {
//                return left+right;
//            }
//        })

        //使用lambda表达式
        int sum = calculateNum((int left,int right)->{
            return left+right;
        });
        System.out.println(sum);

        int num = typeCover((String s)->{
            return Integer.valueOf(s);
        });
        System.out.println(num);
    }
    public static  int calculateNum(IntBinaryOperator operator){
        int a = 20;
        int b = 20;
        return operator.applyAsInt(a,b);
    }
    public static <R> R typeCover(Function<String,R> function){
        String str = "1234";
        R result = function.apply(str);
        return result;
    }
}
