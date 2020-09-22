package thinking.char12.exercise28;

/**
 * @author sgc
 * @create 2020/8/11
 */
public class Exercise28 {
    public static void main(String[] args) {
       throw new MyException("我是个异常");
    }
}

class MyException extends RuntimeException{
    String msg;
    public MyException(){}
    public MyException(String s){
        super(s);
        this.msg = s;
    }
    void p(){
        System.out.println(msg);
    }
}
