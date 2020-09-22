package thinking.char12.test;

/**
 * @author sgc
 * @create 2020/8/13
 * 重新抛出异常
 */
public class Test1 {


    public static void main(String[] args) {
        try {
            int i = 1/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
            // throw e;
            // throw new RuntimeException
            throw (ArithmeticException)e.fillInStackTrace();
        }
    }
}
