package thinking.char12.exercise1;

/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise1 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            throw new Exception("msg");
        }catch (Exception e){
            //e.printStackTrace();;
            e.printStackTrace(System.out);//将信息输出到标准输出流
        }finally {
            System.out.println("finally!!!");
        }
    }
}
