package ThinkInJava;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception {
    // getlogger里面 产生错误的包名或类名
    private static Logger logger = Logger.getLogger("LoggingException");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw  new LoggingException();
        }catch (LoggingException e){
            e.printStackTrace();
//            System.err.println("caught "+e);
        }
        try {
            throw  new LoggingException();
        }catch (LoggingException e){
            System.err.println("caught "+e);
        }
    }
}
