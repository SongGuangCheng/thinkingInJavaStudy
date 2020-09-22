package thinking.char12.test;

/**
 * @author sgc
 * @create 2020/8/13
 */
public class TestReturnAndFinally {
    void f() throws Exception {throw new Exception();}
    int getI(){
        int i = 1;
        int b;
        try{
            f();
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally...");
        }
        return i;
    }
    public static void main(String[] args) {
        int 啊 =  new TestReturnAndFinally().getI();
        System.out.println(啊);
    }
}
