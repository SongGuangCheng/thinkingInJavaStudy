package thinking.char12.exercise7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise7 {
    private static Logger logger = Logger.getLogger("Exercise7");
    static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));//把printStackTrace的内容给了trace
        logger.severe(trace.toString());
    }


    public static void main(String[] args) {
        Exception exception = null;
        int a[] = {1,2,4,5,2};
        try {
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.err.println("数组下标越界");
            logException(e);
        }
    }
}

class MyException1 extends Exception{
    private static Logger logger = Logger.getLogger("MyException1");
    static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));//把printStackTrace的内容给了trace
        logger.severe(trace.toString());
    }

}