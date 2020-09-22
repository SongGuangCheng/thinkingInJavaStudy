package thinking.char12.exercise10;

/**
 * @author sgc
 * @create 2020/8/10
 */
public class Exercise10{
    void g() throws Exception1 {
        throw new Exception1();
    }
    void f(){
        try {
            g();
        }catch (Exception e){
            e.printStackTrace();
            try {
                throw new Exception2();
            } catch (Exception2 exception2) {
                exception2.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Exercise10().f();
    }
}


class Exception1 extends Exception{

}

class Exception2 extends Exception{

}