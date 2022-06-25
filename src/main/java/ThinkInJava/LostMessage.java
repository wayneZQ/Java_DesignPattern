package ThinkInJava;


/**
 * 测试finally是否会导致前面的异常丢失
 * 确实会导致异常丢失
 */
class VeryImportantException extends Exception{
    public String toString(){
        return "a very important exception";
    }
}
class HuHomException extends Exception{
    public String toString(){
        return "a trivial exception";
    }
}

public class LostMessage {
    void f() throws VeryImportantException{
        throw new VeryImportantException();
    }
    void dispose() throws HuHomException{
        throw new HuHomException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm= new LostMessage();
            try{
                lm.f();
            }finally {
                lm.dispose();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
