package thinking.char12.exercise4;

/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise4 {
    public static void main(String[] args) {
        MyException myException = new MyException("我是个异常");
        try{
            throw myException;
           // myException.p(); 抛出异常之后就会跳转到catch块 无法到达此处
        } catch (MyException e) {
            e.printStackTrace();
            myException.p();
        }
    }
}

class MyException extends Exception{
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