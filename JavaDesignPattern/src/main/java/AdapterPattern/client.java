package AdapterPattern;


/**
 * @ClassName client
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/13 10:53
 **/
public class client {
    public static void main(String[] args) {
        ScoreOperation operation;
        operation =(ScoreOperation)XMLUtil.getBean();

        int[] scores = {78,77,98,12,90,67,45,99,44,88};
        int[] result;
        int score;

        System.out.println("the score after sorted is: ");

        result = operation.sort(scores);
        for(int i:result){
            System.out.print(i+",");
        }
        System.out.println();



    }




}
