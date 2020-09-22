package thinking.char12.exercise6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise6 extends Exception{}

class MyException1 extends Exception{
    private static Logger logger = Logger.getLogger("MyException1");
    static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));//把printStackTrace的内容给了trace
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        try {
            int i = 1/0;
        }catch (Exception e){
              logException(e);
        }
    }
}