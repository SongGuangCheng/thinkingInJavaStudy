package thinking.char12.test;

/**
 * @author sgc
 * @create 2020/8/13
 * finally的使用
 */
public class TestFinally {
    public static void main(String[] args) {
        try{
            //System.exit(0);
            int i = 1/0;
            //return;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally 执行了");
            //return;
        }
    }
}
